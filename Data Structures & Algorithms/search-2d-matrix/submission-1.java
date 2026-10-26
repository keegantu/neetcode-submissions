class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int right = m*n - 1;
        int mid = (left + right)/2;

        while(left <= right){
            int midCol = mid % n;
            int midRow = mid / n;

            if(matrix[midRow][midCol] < target){
                left = mid + 1;
                mid = (left + right) / 2;
            }else if(matrix[midRow][midCol] > target){
                right = mid - 1;
                mid = (left + right) / 2;
            }else if(matrix[midRow][midCol] == target){
                return true;
            }
        }

        return false;

    }
}
