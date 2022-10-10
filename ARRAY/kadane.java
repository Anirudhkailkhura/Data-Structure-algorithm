public class kadane {
    public static void main(String[] args) {
        int[] nums = { -2, -3, 4, -1, -2, 1, 5, -3 };
        System.out.println("Maximum contiguous sum is "
                + maxSubArraySum(nums));

    }
   public static int  maxSubArraySum(int[] nums){

        int sum = 0;
        int maxi = nums[0];

        for (int i = 0; i< nums.length;i++){
            sum  = sum + nums[i];// transversing the sum

           if(sum > maxi)  //updating maxi
               maxi = sum ;

           if (sum < 0)
               sum = 0;
        }
        return maxi;
   }
}
