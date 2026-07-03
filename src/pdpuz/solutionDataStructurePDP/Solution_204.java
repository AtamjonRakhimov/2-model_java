package pdpuz.solutionDataStructurePDP;

import java.util.ArrayList;
import java.util.List;

public class Solution_204 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(countPrimes(n));

    }

    public static int countPrimes(int n) {
        List<Integer> arr = new ArrayList<>();

        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                arr.add(i);
            }
        }
        return arr.size();

    }
}
