// Java program to find all pairs in both arrays
// whose sum is equal to given value x
import java.io.*;

class matrixsum {

    // Function to print all pairs in both arrays
    // whose sum is equal to given value x
    static void findPairs(int arr1[], int arr2[], int n,
                          int m, int x)
    {
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                if (arr1[i] + arr2[j] == x)
                    System.out.println(arr1[i] + " "
                            + arr2[j]);
    }

    // Driver code
    public static void main(String[] args)
    {
        int arr1[] = { 1, 2, 3, 7, 5, 4 };
        int arr2[] = { 0, 7, 4, 3, 2, 1 };
        int x = 8;
        findPairs(arr1, arr2, arr1.length, arr2.length, x);
    }
}