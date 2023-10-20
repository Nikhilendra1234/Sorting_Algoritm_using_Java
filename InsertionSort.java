class InsertionSort{
    static void insertionSort(int[] a){
        int n=a.length;
        for(int i=1;i<n;i++){
            int j=i;
            while(j>0 && a[j]<a[j-1]){
                int temp=a[j];
                a[j]=a[j-1];
                a[j-1]=temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={4,7,3,67,56,6};
        insertionSort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}