import package0.SameName;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        System.out.println("### task 1 ###");
        main.testCoworker();

        System.out.println("### task 2 ###");
        main.testPackages();

        System.out.println("### task 3 ###");
        main.testCar();
    }

    private void testCoworker(){
        Coworker coworker0 = new Coworker(
                "Alex",
                "HR",
                "alex@mail.su",
                "4928451001",
                36);
        coworker0.printData();
        System.out.println();

        Coworker coworker1 = new Coworker(
                "Kate",
                "QA",
                "kittyKat@gmail.su",
                "1452319090",
                25);
        coworker1.printData();
        System.out.println();
    }

    private void testPackages(){
        package0.SameName sameName0 = new package0.SameName();
        package1.SameName sameName1 = new package1.SameName();
        System.out.println();
    }

    private void testCar(){
        Car car = new Car();
        car.start();
    }

}