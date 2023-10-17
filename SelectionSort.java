class Selection{
    static void selectionSort(int[] a){
        int n=a.length;
        for(int i=0;i<n-1;i++)
        {
            int min_index=i;
            for(int j=i+1;j<n;j++){
                if(a[j]<a[min_index])
                    min_index=j;
            }

            int temp=a[i];
            a[i]=a[min_index];
            a[min_index]=temp;
        }
    }
    public static void main(String[] args) {
        int[] arr={3,52,623,5,34};
        selectionSort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
