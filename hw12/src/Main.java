import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        System.out.println("Request tests");
        main.testRequests();
        System.out.println();

        System.out.println("String list modifier tests");
        main.testStringLists();
        System.out.println();
    }

    private void testRequests(){
        ChainOfFilters filters = new ChainOfFilters();
        filters.addFilter(new SubstrFilter("basic"));
        filters.addFilter(new RegexFilter("[^/]*\\/[^/]*\\/[^/]*"));
        filters.addFilter(new JsonFilter());
        filters.addFilter(new CacheControlFilter());

        Request request0 = new Request(
                "example.ua/homework/basic",
                Arrays.asList("Content-Type: application/xml", "Cache-Control: max-age=3600, no-cache, no-store"),
                "{ \"abc\" : \"def\" }");
        filters.doFilter(request0);

        Request request1 = new Request(
                "example.ua/homework/basic",
                Arrays.asList("Content-Type: application/xml", "Cache-Control: max-age=3600, no-cache, no-flower"),
                "{ \"abc\" : \"def\" }");
        filters.doFilter(request1);
    }

    private List<String> modifyListString(List<String> src, StringListModifier modifier){
        return modifier.modify(src);
    }

    private void testStringLists(){
        List<String> testList = new ArrayList<>();
        testList.add("When I came home last night at three!");
        testList.add("The man was waiting there for me");
        testList.add("Awesome");
        testList.add("Sun");
        testList.add("57656174686572");

        List<String> test1 = modifyListString(testList, new StringListReverseModifier());
        System.out.println(test1);

        List<String> test2 = modifyListString(testList, new StringListOddModifier());
        System.out.println(test2);

        List<String> test3 = modifyListString(testList, new StringListHexModifier());
        System.out.println(test3);
    }
}