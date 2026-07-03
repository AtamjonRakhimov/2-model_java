package pdpuz.Solution42;

public class ascii {
    public static void main(String[] args) {
        String text = "USA";

        System.out.println(checkUpper(text));
    }

    private static boolean checkUpper(String text) {
        boolean result = false;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'A' && c <= 'Z') result = true;
            else return false;
        }
        return result;
    }
}
