package pdpuz;
import pdpuz.MyMath.math;

public class app {
    public static void main(String[] args) {
        math math1=new math();

        System.out.println("Son + son: " + math1.add(5, 7));
        System.out.println("Double + double: " + math1.add(4.5, 3.2));
        System.out.println("Double + son: " + math1.add(2.5, 8));
        System.out.println("Matn + son: " + math1.add("Yoshi: ", 18));
        System.out.println("Matn + double: " + math1.add("Bahosi: ", 99.5));
        System.out.println("Matn + matn: " + math1.add("Salom, ", "Atamjon!"));



    }



}
