public class jump {
    public static void main(String[] args) {
          int[] a= {1,3,5,8,9,2,6,7,8,9};
          int j = Jump(a);
        System.out.println(j);
    }
    public static int Jump(int [] a){
        if (a.length <= 1)
            return 0;
        //initialisation
        int maxR = a[0];
        int step = a[0];
        int Jump = 1;

        for (int i = 1; i<a.length; i++){
            if (i==a.length-1)
                return Jump;

            if (i + a[i] > maxR ) //the value of the step will decrease when
                                  // 1+3=4>1  maxR =4, step = 0,jump=2
                maxR = i + a[i];
            step--;
            if (step==0){
                Jump++;
                step = maxR-i;
            }
        }
             return Jump;
    }
}
