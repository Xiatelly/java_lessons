public class FileData {
    private String name;

    private int size;

    private String path;

    public FileData(String name, int size, String path){
        this.name = name;
        this.size = size;
        this.path = path;
    }
    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
