public class Cat extends Animal {
    public Cat(String name){
        super(name);
        RunLimit = 200.0f;
        SwimLimimt = 0.0f;
      }

    @Override
    public void swim(float distance){
        System.out.printf("Cats can't swim, so %s do nothing%n", Name);
    }
}
