package pdpuz;

import java.util.Arrays;
import java.util.HashSet;

public class Solution_821 {
    public static void main(String[] args) {
        Solution_821 solution821 = new Solution_821();

        String s = "loveleetcode";
        char c = 'e';
        System.out.println(Arrays.toString(solution821.shortestToChar(s, c)));

    }

    public int[] shortestToChar(String s, char c) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) if (s.charAt(i) == c) set.add(i);

        int[] res = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) continue;
            int d = Integer.MAX_VALUE;
            for (Integer v : set) d = Math.min(d, Math.abs(i - v));
            res[i] = d;
        }
        return res;
    }
}
