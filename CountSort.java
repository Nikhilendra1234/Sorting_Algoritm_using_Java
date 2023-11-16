class CountSort{
    static void displayArr(int[]a){
        for(int i:a)
            System.out.print(i+" ");
    }
    static int findMax(int[]a){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
                max=a[i];
        }
        return max;
    }
    static void countSort(int[]a){
        int max=findMax(a);
        int n=a.length;
        int[]freq=new int[max+1];
        for(int i=0;i<n;i++){
            freq[a[i]]++;
        }
        for(int i=1;i<freq.length;i++){
            freq[i]=freq[i]+freq[i-1];
        }
        int[] output=new int[n];
        for(int i=n-1;i>=0;i--){
            int idx=freq[a[i]]-1;
            output[idx]=a[i];
            freq[a[i]]--;
        }
        for(int i=0;i<n;i++){
            a[i]=output[i];
        }
    }
    public static void main(String[]args){
        int[] a={4,2,6,8,9,3};
        System.out.println("Array before sorting");
        displayArr(a);
        countSort(a);
        System.out.println();
        System.out.println("Array after sorting");
        displayArr(a);
    }
}