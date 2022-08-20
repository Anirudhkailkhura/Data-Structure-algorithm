public class saperate {
    public static void main(String[] args) {
         int[] a= {2,-3,-4,-1,6,9};
         int n = a.length;
         rearrange(a,n);
        for (int i= 0; i<a.length;i++)
            System.out.println(a[i]);
    }
    static void rearrange(int[] a, int n){
        int i = 0;  //pointer at the starting of thr array
        int j = n-1;  //pointer at the ending of thr array

        //shifting all the negative element to the end
        while(i<j){
            while(i <= n-1 && a[i] > 0)
                i+= 1;
            while(j >= 0 && a[j] < 0)
                j-= 1;
            if (i<j)
                swap(a,i,j);
        }
        if (i==0 || i==n)
            return;
        int k = 0;
        while(k<n && i<n){
            swap(a,k,i);
            i= i+1;
            k= k+2;
        }
    }
    static void swap(int[] a,int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}

