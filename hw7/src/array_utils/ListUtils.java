package array_utils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public abstract class ListUtils {

    public static int countOccurance(ArrayList<String> strings, String text){
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

    public static ArrayList<Integer> findUnique(ArrayList<Integer> list){
        ArrayList<Integer> newList = new ArrayList<Integer>();
        for (Integer integer : list){
            if (!newList.contains(integer))
                newList.add(integer);
        }
        return newList;
    }
}
