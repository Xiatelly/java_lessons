import java.util.*;

public class FileNavigator {

    private HashMap<String, List<FileData>> data = new HashMap<>();

    public void add(String name, int size, String path){
        add(new FileData(name, size, path));
    }

    public void add(FileData file){
        data.compute(
                file.getPath(),
                (k, oldRecord) -> {
                    List<FileData> record = (oldRecord != null) ? oldRecord : new ArrayList<>();
                    record.add(file);
                    return record;
                });
    }

    public final List<FileData> find(String pathK){
        return data.get(pathK);
    }

    public List<FileData> filterBySize(int size){
        List<FileData> result = new ArrayList<>();

        data.forEach(
            (path, record) -> {
                for(FileData fileData : record)
                    if(fileData.getSize() <= size)
                        result.add(fileData);
            }
        );
        return result;
    }

    public void remove(String pathR){
        data.remove(pathR);
    }

    public List<FileData> sortBySize(){
        List<FileData> result = new ArrayList<>();

        data.forEach(
                (path, record) -> {
                    for(FileData fileData : record)
                        result.add(fileData);
                }
        );
        result.sort((a, b) -> {
            return Integer.compare(a.getSize(), b.getSize());
        });
        return result;
    }

    public void validatePath(){
        final boolean[] haveError = {false};
        data.forEach(
            (path, record) -> {
                for(FileData fileData : record)
                   if (!path.equals(fileData.getPath())) {
                       System.out.printf(
                               "Path not valid. Key Path: %s, File path: %s, File name: %s%n",
                               path, fileData.getPath(), fileData.getName());
                       haveError[0] = true;
                   }
            }
        );
        if (!haveError[0])
            System.out.println("All paths are valid");
    }

    public Map<String, List<FileData>> getData() {
        return Collections.unmodifiableMap(data);
    }
}
