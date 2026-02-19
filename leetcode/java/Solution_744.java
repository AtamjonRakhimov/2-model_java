package pdpuz;

public class Solution_744 {
    public static void main(String[] args) {
        Solution_744 solution744 = new Solution_744();

        char[] letters = {'c', 'f', 'j'};
        char target = 'a';
        System.out.println(solution744.nextGreatestLetter(letters, target));

    }

    public char nextGreatestLetter(char[] letters, char target) {
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] > target) return letters[i];
        }
        return letters[0];
    }
}
