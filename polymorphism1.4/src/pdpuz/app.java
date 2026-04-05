package pdpuz;
import pdpuz.Mouse.mouse;

public class app {
    public static void main(String[] args) {
        animal a1 = new cat();
        animal a2 = new dog();
        animal a3 = new mouse();

        a1.live();
        a1.eat();

        a2.live();
        a2.eat();

        a3.live();
        a3.eat();



    }
}
