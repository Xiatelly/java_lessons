package array_utils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public abstract class ListUtils {

    public static int countOccurance(List<String> strings, String text){
        int counter = 0;
        for (String string : strings)
            if (string.equals(text))
                counter++;
        return counter;
    }

    public static LinkedList<Integer> toList(Integer... elements){
        LinkedList<Integer> intList = new LinkedList<Integer>();
        for (Integer integer : elements){
            intList.add(integer);
        }
        return intList;
    }

    public static List<Integer> findUnique(List<Integer> list){
        List<Integer> newList = new ArrayList<Integer>();
        for (Integer integer : list){
            if (!newList.contains(integer))
                newList.add(integer);
        }
        return newList;
    }

    public static void calcOccurance(List<String> strings){
        List<String> stringList = new ArrayList<String>();
        List<Integer> counterList = new ArrayList<Integer>();
        for (String string : strings){
            int i = stringList.indexOf(string);
            if (i >= 0) {
                Integer counter = counterList.get(i);
                counter++;
                counterList.set(i, counter);
            }
            else {
                stringList.add(string);
                counterList.add(1);
            }
        }

        for (int i = 0; i< stringList.size(); i++){
            System.out.printf(
                    "%s: %d %n",
                    stringList.get(i),
                    counterList.get(i));
        }
    }

    private static int findOccuranceIndex(List<StringOccuranceData> list, String string){
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).name.equals(string))
                return i;
        }
        return -1;
    }

    public static List<StringOccuranceData> findOccurace(List<String> strings){
        List<StringOccuranceData> result = new ArrayList<StringOccuranceData>();
        for (String string : strings){
            int i = findOccuranceIndex(result, string);
            if (i >= 0)
                result.get(i).occurance++;
            else
                result.add(new StringOccuranceData(string, 1));
        }
        return result;
    }
}
