package pdpuz;
import pdpuz.Texnik.texnik;
import pdpuz.Mashina.mashina;
import pdpuz.Telivizor.telivizor;
import pdpuz.Telefon.telefon;

public class app {
    public static void main(String[] args) {
        texnik texnik1 = new texnik();
        texnik mashina1 = new mashina();
        texnik telivizor1 = new telivizor();
        texnik telefon1 = new telefon();



        texnik1.work();
        mashina1.work();
        mashina1.turnOff();
        telivizor1.work();
        telefon1.work();



    }
}
