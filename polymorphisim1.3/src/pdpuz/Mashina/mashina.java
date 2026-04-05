package pdpuz.Mashina;
import pdpuz.Texnik.texnik;

public class mashina extends texnik{
    @Override
    public void work() {
        System.out.println("mashina is working...");
    }

    @Override
    public void turnOn() {
        System.out.println("mashina turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("mashina turned off.");
    }
}
