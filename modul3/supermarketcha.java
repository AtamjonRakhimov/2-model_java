package pdpuz;

import java.util.ArrayList;
import java.util.Scanner;

public class supermarketcha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> arr = new ArrayList<>();
        arr.add("konfet");
        arr.add("non");
        arr.add("olma");
        arr.add("coffe");
        arr.add("salfetka");
        arr.add("pecheni");
        arr.add("sabzi");

        ArrayList<String> newarr = new ArrayList<>();

        while (true) {
            System.out.println("1-xarid qilish:");
            System.out.println("2-chiqish: ");
            int number = scanner.nextInt();

            if (number == 2) {
                break;
            }
            if (number == 1) {
                System.out.print("mahsulotlar:");
                System.out.println(arr);
                System.out.println("qaysi mahsulotni olmoqchisiz nomini kiriting :");
                String product = scanner.next();
                for (int i = 0; i < arr.size(); i++) {
                    if (arr.get(i).equals(product)) {
                        arr.remove(product);
                        newarr.add(product);
                        System.out.println("muvafaqiyatli xarid qilindi!");
                        break;
                    }
                    if (i == arr.size() - 1) {
                        System.out.println("unaqa mahsulot yuq :(");
                        break;
                    }
                }
            }
        }


        if (!newarr.isEmpty()) {
            System.out.println("siz xarid qilgan tovarlar :" + newarr);
            System.out.println("Xaridiz uchun rahmat yana kelib turing !!!🤩❤️");
        } else {
            System.out.println("Siz hech nima sotib olmadiz 😓");
        }


    }
}
