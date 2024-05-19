import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexFilter implements Filter{

    private String regex;
    private Pattern pattern;

    public RegexFilter(String text){
        this.regex = text;
        this.pattern = Pattern.compile(regex);
    }

    @Override
    public FilterResult doFilter(Request request) {
        Matcher matcher = pattern.matcher(request.getUri());
        FilterResult result = new FilterResult();
        result.result = matcher.matches();
        if (!result.result) {
            result.log = String.format(
                    "URI %s is not much regex: %s",
                    request.getUri(),
                    this.regex);
        }
        return result;
    }
}
