import org.json.JSONObject;

public class JsonFilter implements Filter{
    @Override
    public FilterResult doFilter(Request request) {
        FilterResult result = new FilterResult();
        try {
            JSONObject jo = new JSONObject(request.getPayload());
            result.result = (jo!=null);
        }
        catch (Exception e){
            result.result = false;
        }

        if (!result.result) {
            result.log = String.format(
                    "Request payload is not JSON: %s",
                    request.getPayload());
        }
        return result;
    }
}