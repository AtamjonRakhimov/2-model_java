package pdpuz;

import java.util.HashMap;
import java.util.HashSet;

public class Solution_819 {
    public static void main(String[] args) {
        Solution_819 solution_819 = new Solution_819();

        String paragrh = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};
        System.out.println(solution_819.mostCommonWord(paragrh, banned));

    }

    public String mostCommonWord(String paragraph, String[] banned) {
        HashSet<String> bannedWords = new HashSet<>();
        HashMap<String, Integer> validCount = new HashMap<>();

        for (String word : banned) {
            bannedWords.add(word);
        }

        String[] words = paragraph.toLowerCase().split("\\W+");

        for (String word : words) {
            if (!bannedWords.contains(word))
                validCount.put(word, validCount.getOrDefault(word, 0) + 1);
        }
        int max = 0;
        String result = "";

        for (String word : validCount.keySet()) {
            if (validCount.get(word) > max) {
                max = validCount.get(word);
                result = word;
            }
        }
        return result;

    }
}
