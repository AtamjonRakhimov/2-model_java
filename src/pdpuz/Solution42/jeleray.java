package pdpuz.Solution42;

import java.util.HashSet;
import java.util.Set;

public class jeleray {
    public static void main(String[] args) {
        String j1="aA";
        String stones="aAAbbbb";

        Set<Character> set=new HashSet<>();
        for (int i = 0; i < j1.length(); i++) {
            set.add(j1.charAt(i));
        }
        int count =0;
        for (char c : stones.toCharArray()) {
            if (set.contains(c))count++;
        }

        System.out.println(count);
    }
}
