import java.util.HashSet;
import java.util.Set;

public class sumZero {
    public static void main(String[] args) {
        int[] arr = {4,2,-3,1,6};
        if(subArray(arr))
            System.out.println("found the subArray");
        else
            System.out.println("no such subArray found");

    }
    static boolean subArray(int[] arr){
        // Create an empty hashset hs
        Set<Integer> hs = new HashSet<Integer>();
        int sum = 0; // initializing th sum of the element

        for (int i= 0; i< arr.length; i++)
        {
            // add current element to sum
            sum += arr[i];

            // Return true in the following case
            // current element i s0
            // sum of element from 0 to i is 0
            // sum is already present in the hash set

            if(arr[i] == 0 || sum==0 || hs.contains(sum))
                return true;
            // Add sum to hash set
            hs.add(sum);
        }
        //we reach here only if there is no
        //sub array with sum
        return false;
    }
}
