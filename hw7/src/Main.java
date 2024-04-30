import array_utils.ListUtils;
import array_utils.StringOccuranceData;
import phone_book.Notation;
import phone_book.PhoneBook;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        List<String> names = new ArrayList<>();
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

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Dima", "334455");
        phoneBook.add("Misha", "112233");
        phoneBook.add("Katia", "123456");
        phoneBook.add("Slava", "456765");
        phoneBook.add("Dima", "554433");
        phoneBook.add("Dima", "557733");
        phoneBook.add("Dima", "558833");

        main.test1(names);

        main.test2();

        main.test3();

        main.test4(names);

        main.testPhoneBook(phoneBook);

        main.testPhoneBook2(phoneBook);
    }

    private void test1(List<String> names){
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
        List<Integer> newList = new ArrayList<Integer>();
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
        List<Integer> uniqueList = ListUtils.findUnique(newList);
        System.out.println(uniqueList);
        System.out.println();
    }

    private void test4(List<String> names){
        ListUtils.calcOccurance(names);
    }

    private void test5(List<String> names){
        List<StringOccuranceData> result = ListUtils.findOccurace(names);
        for (StringOccuranceData data : result){
            System.out.printf("name: %s, occurance: %d%n",data.name, data.occurance);
        }
        System.out.println();
    }

    private void testPhoneBook(PhoneBook phoneBooks){
        Notation result = phoneBooks.find("Misha");
        if (result != null)
            System.out.printf("name: %s, phone number: %s%n", result.name, result.phoneNumber);
        System.out.println();
    }

    private void testPhoneBook2(PhoneBook phoneBooks){
        List<Notation> result = phoneBooks.findAll("Dima");
        for (Notation notation : result){
            System.out.printf("name: %s, phone number: %s%n", notation.name, notation.phoneNumber);
        }
    }
}

