package pdpuz;

public class Solution_796 {
    public static void main(String[] args) {
        Solution_796 solution796 = new Solution_796();

        String s = "abcde";
        String goal = "cdeab";
        System.out.println(solution796.rotateString(s, goal));

    }

    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;
        return (s + s).contains(goal);

    }
}
