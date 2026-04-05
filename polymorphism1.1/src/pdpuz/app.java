package pdpuz;
import pdpuz.Figure.figure;

public class app {
    public static void main(String[] args) {
        figure fig = new figure();

        System.out.println("Kvadrat perimetri: " + fig.perimeter(5));
        System.out.println("To‘g‘ri to‘rtburchak perimetri: " + fig.perimeter(4, 7));
        System.out.println("Uchburchak perimetri: " + fig.perimeter(3, 6, 5));
        System.out.println("Beshburchak perimetri: " + fig.perimeter(2, 3, 4, 5, 6));



    }



}
