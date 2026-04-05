package pdpuz.Telivizor;
import pdpuz.Texnik.texnik;

public class telivizor extends texnik {
    @Override
    public void work() {
        System.out.println("telivizor is working...");
    }

    @Override
    public void turnOn() {
        System.out.println("telivizor turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("telivizor turned off");
    }
}
