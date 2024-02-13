public class Coworker {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int age;

    public Coworker(
            String name,
            String position,
            String email,
            String phone,
            int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }

    public void printData(){
        System.out.print("Name: ");
        System.out.println(name);

        System.out.print("Position: ");
        System.out.println(position);

        System.out.print("E-mail: ");
        System.out.println(email);

        System.out.print("Phone: ");
        System.out.println(phone);

        System.out.print("Age: ");
        System.out.println(age);
    }
}
