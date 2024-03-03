import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.testFileNavigator();
    }
    private void printArray(List<FileData> data){
        for(FileData fileData : data)
            System.out.printf("name: %s, size: %d, path: %s%n",
                    fileData.getName(),
                    fileData.getSize(),
                    fileData.getPath());
    }

    private void testFileNavigator(){
        FileNavigator navigator = new FileNavigator();
        navigator.add("1.jpg", 4, "/files");
        navigator.add("2.jpg", 6, "/files");
        navigator.add("22.jpg", 10, "/files1");
        navigator.add("3.jpg", 15, "/files2");
        navigator.add("4.jpg", 15, "/files3");
        navigator.add("42.jpg", 78, "/files1");
        navigator.add("56.jpg", 56, "/files3");
        navigator.add("11.jpg", 35, "/files0");

        final List<FileData> findResult = navigator.find("/files");
        printArray(findResult);

        System.out.println();

        final List<FileData> filterResult = navigator.filterBySize(15);
        printArray(filterResult);

        System.out.println();

        final List<FileData> sorterResult =  navigator.sortBySize();
        printArray(sorterResult);

        System.out.println();

        navigator.remove("/files2");
        navigator.getData().forEach(
            (path, record) -> {
               printArray(record);
        });

        System.out.println();

        findResult.get(0).setPath("/invald_path");
        navigator.validatePath();
    }
}