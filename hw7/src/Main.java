import array_utils.ListUtils;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println("## Task1 ###");
        main.test1();
        System.out.println("## Task2 ###");
        main.test2();
        System.out.println("## Task3 ###");
        main.test3();
    }
    private void test1(){
        ArrayList<String> names = new ArrayList<>();
        names.add("Ann");
        names.add("Michelle");
        names.add("Bob");
        names.add("John");
        names.add("Bob");
        names.add("John");
        names.add("Sofie");
        names.add("John");
        names.add("Michelle");
        names.add("John");
        names.add("Michelle");
        names.add("Alex");
        names.add("John");
        names.add("Alex");
        names.add("Sofie");
        names.add("Alex");
        names.add("Sofie");
        names.add("Michelle");
        int a = ListUtils.countOccurance(names, "Sofie");
        System.out.println(a);
        System.out.println();
    }

    private void test2(){
        LinkedList<Integer> intList = ListUtils.toList(1,2,3,4,5,6,7,8,9,2,3,33,12,4,45);
        System.out.println(intList);
        System.out.println();
    }

    private void test3(){
        ArrayList<Integer> newList = new ArrayList<Integer>();
        newList.add(1);
        newList.add(1);
        newList.add(2);
        newList.add(3);
        newList.add(4);
        newList.add(5);
        newList.add(5);
        newList.add(6);
        newList.add(7);
        newList.add(8);
        ArrayList<Integer> uniqueList = ListUtils.findUnique(newList);
        System.out.println(uniqueList);
        System.out.println();
    }
}

