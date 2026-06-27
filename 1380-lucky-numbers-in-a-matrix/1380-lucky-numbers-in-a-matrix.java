class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {

            // Find the minimum element in the current row
            int minCol = 0;
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] < matrix[i][minCol]) {
                    minCol = j;
                }
            }

            // Check if it is the maximum in its column
            boolean isLucky = true;

            for (int k = 0; k < m; k++) {
                if (matrix[k][minCol] > matrix[i][minCol]) {
                    isLucky = false;
                    break;
                }
            }

            if (isLucky) {
                result.add(matrix[i][minCol]);
            }
        }

        return result;
    }
}