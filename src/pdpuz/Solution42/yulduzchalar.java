package pdpuz.Solution42;

import java.util.Stack;

public class yulduzchalar {
    public static void main(String[] args) {
        String str = "leet**cod*e";

        System.out.println(ochirYulduzchaOldingisiBilan(str));
    }

    private static String ochirYulduzchaOldingisiBilan(String str) {
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '*') stack.pop();
            else stack.push(ch);
        }
        return stack.toString();
    }
}
