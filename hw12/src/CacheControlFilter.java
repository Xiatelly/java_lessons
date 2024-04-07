
public class CacheControlFilter implements Filter{

    private String string;

    public CacheControlFilter(String text){
        this.string = text;
    }

    @Override
    public FilterResult doFilter(Request request) {
        FilterResult result = new FilterResult();
        result.result = request.getUri().contains(this.string);
        if (!result.result) {
            result.log = String.format(
                    "URI %s is not contain a substring: %s",
                    request.getUri(),
                    this.string);
        }
        return result;
    }
}