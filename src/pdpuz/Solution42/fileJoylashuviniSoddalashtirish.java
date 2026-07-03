package pdpuz.Solution42;

import java.util.Stack;

public class fileJoylashuviniSoddalashtirish {
    public static void main(String[] args) {
        String str ="/home/";

        System.out.println(tekshir(str));
    }

    private static String tekshir(String str) {
        Stack<String> stack = new Stack<String>();

        String[] folders = str.split("/");

        for (String folder : folders) {
            if (folder.equals("..")) {
                if (!stack.empty()) stack.pop();
                continue;
            }
            if (folder.equals(".") || folder.isEmpty()) continue;
            stack.push(folder);
        }
        return stack.toString();
    }
}
