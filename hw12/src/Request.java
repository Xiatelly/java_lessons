import java.util.List;

public class Request {
    private String uri;
    private List<String> headers;
    private String payload;

    public String getUri() {
        return uri;
    }

    public List<String> getHeaders() {
        return headers;
    }

    public String getPayload() {
        return payload;
    }

    public Request(String uri, List<String> headers, String payload) {
        this.uri = uri;
        this.headers = headers;
        this.payload = payload;
    }
}
