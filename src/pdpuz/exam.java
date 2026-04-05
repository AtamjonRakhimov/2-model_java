package pdpuz;

public class exam {
    public static void main(String[] args) {
        // 1-misol
        //Binary search algoritmini ishlab chiqing
        /*int[] arr = {10, 20, 30, 40, 50, 60};
        int target = 50;

        int left = 0;
        int right = arr.length - 1;

        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                index = mid;
                break;
            } else if (arr[mid] < target) {
                left += 1;
            }else if (arr[mid] > target) {
                right -= 1;
            }
        }

        System.out.println(index);*/

        //2-misol
        //Berilgan int[] array ichida takrorlanmaydigan birinchi elementni toping.
//        int[] arr = {4, 5, 1, 2, 0, 4};
//
//        for (int i = 0; i < arr.length; i++) {
//            boolean uniq = true;
//
//            for (int j = 0; j < arr.length; j++) {
//                if (i != j && arr[i] == arr[j]) {
//                    uniq = false;
//                    break;
//                }
//            }
//
//            if (uniq) {
//                System.out.println(arr[i]);
//                break;
//            }
//        }

        //3-misol
        // Berilgan tartiblangan int[] array ichida yig‘indisi target ga teng bo‘lgan 2 ta son bormi?
        /*int[] arr = {1, 2, 4, 7, 11};
        int target = 9;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == target ){
                    System.out.println(arr[i] + " " + arr[j]);
                    return;
                }
            }
        }*/

    }
}
