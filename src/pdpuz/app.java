package pdpuz;

public class app {
    public static void main(String[] args) {
        // 1-misol Variables & Data Types: Integer va Double tipdagi ikki o‘zgaruvchi yaratib, ularning
        //yig‘indisi va ko‘paytmasini hisoblang.
        /*
        Integer a = 10;
        double b = 10.5d;
        System.out.println("yig'indisi:  " + a + b);
        System.out.println("Ko'paytmasi: " + a * b);
         */

        //2-misol  If/Else: Foydalanuvchidan son qabul qilib, son juft yoki toq ekanligini aniqlang
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("son kiriting: ");
        int number = scanner.nextInt();

        if (number % 2 ==0) System.out.println("Juft son");
        else System.out.println("toq son");

         */

        // 3-misol  For Loop: 1 dan 20 gacha bo‘lgan sonlarni ekranga chiqaring.
        /*
        for (int i = 1; i <= 20 ; i++) {
            System.out.println(i);
        }

         */

        // 4-misol While Loop: 5 ning darajalarini (5^1, 5^2 … 5^5) while loop yordamida hisoblang.
        /*
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("darajani hisoblamoqchimisiz : (ha/yuq) ");
            String tekshir =scanner.nextLine();
            if (tekshir.toLowerCase().equals("ha")){
                System.out.print("son kiriting : ");
                int number = scanner.nextInt();
                System.out.print("darajani kiriting: ");
                int daraja = scanner.nextInt();
                System.out.println(Math.pow(number,daraja));
            }else {
                break;
            }
        }

         */
        // 5-misol Arrays: 5 ta sonli array yaratib, eng katta va eng kichik elementni toping
        /*
        int[] arr = {23, 44, 5, 66, 53};
        int katta = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            if (katta < arr[i + 1]) {
                katta = arr[i + 1];
            }
        }
        System.out.println(Arrays.toString(arr) + " Max soni bu -> " + katta);

         */
        // 6-misol ArrayList: 3 ta ism qo‘shing va ularni for-each yordamida ekranga chiqaring.
        /*
        ArrayList<String> names = new ArrayList<>();
        names.add("Atamjon");
        names.add("Shaxzod");
        names.add("Ali");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

         */

        // 7-misol HashMap: Studentning id va name ma’lumotlarini saqlang, key 102 bo‘lgan
        //studentning ismini ekranga chiqaring.
        /*
        HashMap<Integer,String> Students = new HashMap<>();
        Students.put(100,"Atamjon");
        Students.put(101,"Ali");
        Students.put(102,"Abdukarim");
        Students.put(103,"Shaxzod");
        System.out.println(Students.get(102));

         */
        //8-misol Encapsulation: Book klassini tuzing (title va author private), getter/setter
        //yordamida ma’lumotlarni oling va ekranga chiqarish.
        /*
        Book book1 = new Book();
        book1.setTitle("Jack london");
        book1.setAuthor("O'tkir Hoshimov");
        System.out.println(book1.getTitle());
        System.out.println(book1.getAuthor());

         */

//        for (int i = 1; i <= 10; i++) {
//            for (int j = 1; j <= 10; j++) {
//                if (i == 1 || i == 10) {
//                    System.out.print("*");
//                } else if (j == 10) {
//                    System.out.print("*");
//                } else if (j == 1) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println(" ");
//
//
//        }








    }
}
