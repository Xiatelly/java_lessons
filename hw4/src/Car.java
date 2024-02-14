public class Car {
    private void startElectricity(){
        System.out.println("Start electricity");
    }

    private void startCommand(){
        System.out.println("Start command");
    }

    private void startFluelSystem(){
        System.out.println("Start Fluel System");
    }

    public void start(){
        startElectricity();
        startCommand();
        startFluelSystem();
    }

}
