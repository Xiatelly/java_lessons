import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FileNavigator {

    private HashMap<String, List<FileData>> data = new HashMap<>();

    public void add(String name, int size, String path){
        add(new FileData(name, size, path));
    }

    public void add(FileData file){
        List<FileData> record = data.get(file.getPath());
        if (record == null){
            List<FileData> newRecord = new ArrayList<>();
            newRecord.add(file);
            data.put(file.getPath(), newRecord);
        }
        else{
            record.add(file);
        }
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

    public final HashMap<String, List<FileData>> getData() {
        return data;
    }
}
