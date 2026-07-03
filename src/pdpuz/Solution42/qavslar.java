package pdpuz.Solution42;

public class qavslar {
    public static void main(String[] args) {
        String text = "(hello world)";

        System.out.println(checkBreakets(text));

    }

    public static boolean checkBreakets(String text) {
        String open = "(";
        String close = ")";
        int result = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == '(') result += 1;
            else if (c == ')') result -= 1;
        }
        return result == 0;
    }
}
