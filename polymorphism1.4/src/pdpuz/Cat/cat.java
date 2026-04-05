package pdpuz.Cat;

public class cat extends animal{
    @Override
    public void live() {
        System.out.println("cat is living...");
    }

    @Override
    public void eat() {
        System.out.println("cat is eating...");
    }
}
