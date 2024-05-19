import java.util.Arrays;

public class CacheControlFilter implements Filter{
    public static final String[] VALID_OPTIONS = {
        "max-age",
        "max-stale",
        "min-fresh"};
    public static final String[] VALID_FLAGS = {
        "no-cache",
        "no-store",
        "no-transform",
        "only-if-cached",
        "stale-if-error"};

    public static final String CACHE_CONTROL_PREFIX = "Cache-Control:";

    @Override
    public FilterResult doFilter(Request request) {
        FilterResult result = new FilterResult();
        result.result = true;
        for (String header : request.getHeaders()){
            if (!header.startsWith(CACHE_CONTROL_PREFIX))
                continue;

            String body = header.substring(CACHE_CONTROL_PREFIX.length());
            String[] parts = body.split(",");
            for (String part : parts) {
                String trimmedPart = part.trim();
                if (trimmedPart.contains("=")){
                     String[] optionParts = trimmedPart.split("=");
                     if (Arrays.stream(VALID_OPTIONS).noneMatch(element -> element.equals(optionParts[0]))){
                         result.result = false;
                         result.log = String.format(
                                 "Cache-Control header contains not valid option: %s",
                                 optionParts[0]);
                         break;
                     }
                }
                else{
                    if (Arrays.stream(VALID_FLAGS).noneMatch(element -> element.equals(trimmedPart))){
                        result.result = false;
                        result.log = String.format(
                                "Cache-Control header contains not valid flag: %s",
                                trimmedPart);
                        break;
                    }
                }
            }
            if (!result.result)
                break;
        }

        return result;
    }
}