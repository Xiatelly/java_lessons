public class Cat extends Animal {
    public Cat(String name){
        super(name);
        mRunLimit = 200.0f;
        mSwimLimit = 0.0f;
      }

    public void swim(float distance){
        System.out.printf("Cats can't swim, so %s do nothing%n", mName);
    }
}
