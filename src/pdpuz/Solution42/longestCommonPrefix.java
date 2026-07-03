package pdpuz.Solution42;

public class longestCommonPrefix {
    public static void main(String[] args) {
        String[] text = {"flow", "flower", "flight"};

        System.out.println(checkPrefix(text));
    }

    private static String checkPrefix(String[] arr) {
        String prefix = arr[0];
        for (int i = 1; i < arr.length; i++) {
            while (!arr[i].startsWith(prefix))
                prefix = prefix.substring(0, prefix.length() - 1);

            if (prefix.isEmpty()) return "";
        }
        return prefix;
    }
}
