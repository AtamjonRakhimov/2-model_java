package pdpuz.Dog;

public class dog extends animal{
    @Override
    public void live() {
        System.out.println("dog is living...");
    }

    @Override
    public void eat() {
        System.out.println("dog is eating...");
    }
}
