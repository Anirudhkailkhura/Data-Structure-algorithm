//Search in a sorted 2D matrix

public class sortedMatrix {
    public static void main(String[] args) {


    }
    public static boolean search(int[][]matrix,int target){
        int low = 0;
        if(matrix.length==0) return false;
        int n = matrix.length;
        int m = matrix[0].length;
        int high = (n*m) - 1;

        while(low<= high){
            int mid = (low + (high + low) / 2);
            if (matrix[mid/m][mid%m] == target){
                return true;
            }
            if (matrix[mid/m][mid%m] < target){
                low = mid+1;

            }
            else{
                high= mid-1;
            }
        }
        return false;
    }
}
