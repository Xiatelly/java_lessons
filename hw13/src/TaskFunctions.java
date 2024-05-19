import java.util.List;

public final class TaskFunctions {
    private TaskFunctions(){}

    public static List<Integer> arrayFetchNumbersAfterLastFour(List<Integer> array){
        int lastFourIndex = array.lastIndexOf(4);
        if (lastFourIndex < 0)
            throw new RuntimeException("Current array does not contains 4");
        return array.subList(lastFourIndex + 1, array.size());
    }

    public static boolean arrayContainsFromOneAndFour(List<Integer> array){
        boolean isContainsFour = false;
        boolean isContainsOne = false;
        for (Integer i : array){
            if (i == 4)
                isContainsFour = true;
            else if (i == 1) {
                isContainsOne = true;
            }
            else {
                return false;
            }
        }

        return isContainsFour && isContainsOne;
    }
}
