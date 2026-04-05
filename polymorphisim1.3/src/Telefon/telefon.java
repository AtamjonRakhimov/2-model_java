package Telefon;
import pdpuz.Texnik.texnik;

public class telefon extends texnik{
    @Override
    public void work() {
        System.out.println("telefon is working...");
    }

    @Override
    public void turnOn() {
        System.out.println("telefon turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("telefon turned off.");
    }
}
