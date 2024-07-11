class Solution {
    public void swap(int[][] matrix, int a, int b, int c, int d) {
        int temp = matrix[a][b];
        matrix[a][b] = matrix[c][d];
        matrix[c][d] = temp;
    }

    public void rotate(int[][] matrix) {
        int n = matrix.length;
        
        //Transpose
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                swap(matrix, i, j, j, i);
            }
        }
        
        //Reverse 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                swap(matrix, i, j, i, n - j - 1);
            }
        }
    }
}
