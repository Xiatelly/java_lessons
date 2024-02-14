public class Cat extends Animal {
    public Cat(String name){
        super(name);
        runLimit = 200.0f;
        swimLimimt = 0.0f;
      }

    @Override
    public void swim(float distance){
        System.out.printf("Cats can't swim, so %s do nothing%n", name);
    }
}
