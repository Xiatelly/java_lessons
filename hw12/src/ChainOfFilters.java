import java.util.LinkedList;
import java.util.List;

public class ChainOfFilters {
    private List<Filter> filters = new LinkedList<>();

    public void addFilter(Filter filter){
        this.filters.add(filter);
    }

    public boolean doFilter(Request request){
        for (Filter f : this.filters){
           FilterResult result = f.doFilter(request);
           if (!result.result){
               System.out.printf("400 Bad Request: %s", result.log);
               return false;
           }
        }
        System.out.println("Its a valid request");
        return true;
    }
}
