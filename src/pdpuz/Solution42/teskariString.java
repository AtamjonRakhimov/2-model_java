package pdpuz.Solution42;

import java.util.Arrays;

public class teskariString {
    public static void main(String[] args) {
        String[] arr = {"s", "a", "l", "0", "m"};

        int start = 0;
        int end = arr.length-1;
        String prev = "";

        while (start < end) {
            prev = arr[start];
            arr[start] = arr[end];
            arr[end] = prev;
            start++;
            end--;

        }
        System.out.println(Arrays.toString(arr));
    }
}
