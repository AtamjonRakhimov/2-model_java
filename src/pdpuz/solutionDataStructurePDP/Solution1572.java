package pdpuz.solutionDataStructurePDP;

public class Solution1572 {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(diagonalSum(mat));
    }

    public static int diagonalSum(int[][] mat) {
        int n = mat.length;
        if (n == 1) return mat[0][0];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += mat[i][i];
            int j = n - 1 - i;
            if (i != j) sum += mat[i][j];
        }
        return sum;

    }
}
