package pdpuz;

public class Solution_766 {
    public static void main(String[] args) {
        Solution_766 solution766 = new Solution_766();
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 1, 2, 3},
                {9, 5, 1, 2}
        };
        System.out.println(solution766.isToeplitzMatrix(matrix));

    }

    public boolean isToeplitzMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i > 0 && j > 0 && matrix[i - 1][j - 1] != matrix[i][j]) return false;
            }
        }

        return true;
    }
}
