import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.testUri();
    }

    private void testUri(){

        Request request = new Request(
                "example.ua/homework/basic",
                Arrays.asList("Content-Type: application/xml", "Cache-Control: max-age=3600"),
                "{ \"abc\" : \"def\" }");
        ChainOfFilters filters = new ChainOfFilters();
        filters.addFilter(new SubstrFilter("basic"));
        filters.addFilter(new RegexFilter("[^/]*\\/[^/]*\\/[^/]*"));
        filters.addFilter(new JsonFilter());


        filters.doFilter(request);

    }
}