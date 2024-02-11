public class Coworker {
    private String mName;
    private String mPosition;
    private String mEmail;
    private String mPhone;
    private int mAge;

    public Coworker(
            String name,
            String position,
            String email,
            String phone,
            int age){
        mName = name;
        mPosition = position;
        mEmail = email;
        mPhone = phone;
        mAge = age;
    }

    public void printData(){
        System.out.print("Name: ");
        System.out.println(mName);

        System.out.print("Position: ");
        System.out.println(mPosition);

        System.out.print("E-mail: ");
        System.out.println(mEmail);

        System.out.print("Phone: ");
        System.out.println(mPhone);

        System.out.print("Age: ");
        System.out.println(mAge);
    }
}
