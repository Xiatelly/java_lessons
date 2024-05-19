import org.json.JSONObject;

public class JsonFilter implements Filter{
    @Override
    public FilterResult doFilter(Request request) {
        FilterResult result = new FilterResult();
        try {
            JSONObject jo = new JSONObject(request.getPayload());
            result.result = true;
        }
        catch (Exception e){
            result.result = false;
            result.log = String.format(
                    "Request payload is not JSON: %s (Error: %s)",
                    request.getPayload(),
                    e.getMessage());
        }
        return result;
    }
}