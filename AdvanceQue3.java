class AdvanceQuestion3{
    static void displayArr(int[]a){
        for(int val:a)
            System.out.print(val);
    }
    static void Sort0s1s2s(int[]a){
        int[] freq=new int[3];
        int n=a.length;
        for(int i=0;i<n;i++){
            freq[a[i]]++;
        }
        int[] output=new int[n];
        for(int i=1;i<freq.length;i++){
            freq[i]+=freq[i-1];
        }
        int k=0;
        for(int i=n-1;i>=0;i--){
            int idx=freq[a[i]]-1;
            output[idx]=a[i];
            freq[a[i]]--;
        }
        for(int i=0;i<n;i++)
            a[k++]=output[i];
    }
    public static void main(String[] args) {
        int[]a={0,1,2,1,2,0,0,1,2};
        System.out.println("Array before sorting");
        displayArr(a);
        Sort0s1s2s(a);
        System.out.println();
        System.out.println("Array after sorting");
        displayArr(a);
    }
}