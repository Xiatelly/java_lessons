package phone_book;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List<Notation> notations = new ArrayList<>();

    public void add(Notation notation){
        this.notations.add(notation);
    }

    public void add(String name, String phone){
        this.add(new Notation(name, phone));
    }

    public Notation find(String name){
        for (int i = 0; i < notations.size(); i++){
            if (notations.get(i).name.equals(name))
                return notations.get(i);
        }
        return null;
    }

    public List<Notation> findAll(String name){
        List<Notation> result = new ArrayList<>();
        for (int i = 0; i < notations.size(); i++){
            if (notations.get(i).name.equals(name)){
                result.add(notations.get(i));
            }
        }
        return result;
    }
}
