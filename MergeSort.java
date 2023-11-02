 class MergeSort {
    // Method to display the array before and after sorting.
    static void displayArr(int [] a){
        for(int val:a){
            System.out.print(val+" ");
        }
    }
    //Method to merge the two sorted array in required order. 
    static void merge(int[]a,int l,int mid,int r){
        int n1=mid-l+1;
        int n2=r-mid;
        // dividing the array into two parts
        int []left=new int[n1];
        int []right=new int[n2];
        int i,j,k;
        // copying the array into two parts
        for(i=0;i<n1;i++)left[i]=a[l+i];
        for(j=0;j<n2;j++)right[j]=a[mid+1+j];
        i=j=0;
        k=l;
        // comparing the value from two sorted array and putting it into the main array according to the order.
        while(i<n1 && j<n2){
            if(left[i]<right[j])
                a[k++]=left[i++];
            else
                a[k++]=right[j++];
        }
        // cheking if the any one of the array left its element .so that it should be entered in the last of the main array.
        while(i<n1){
            a[k++]=left[i++];
        }
        while(j<n2){
            a[k++]=right[j++];
        }
    }
    // Method to divide and sort the array.using divide anf conquer algorithm.
    static void mergeSort(int []a,int l,int r){
        if(l>=r)return;
        int mid=(l+r)/2;
        // dividing the main array from middle.
        mergeSort(a, l, mid);
        mergeSort(a, mid+1, r);
        merge(a,l,mid,r);

    }
   public static void main(String[] args) {
    int []arr={4,2,56,7,6,9};
    System.out.println("Array before sorting");
    displayArr(arr);
    int n=arr.length;
    mergeSort(arr,0,n-1);
    System.out.println();
    System.err.println("Array after sorting");
    displayArr(arr);
   } 
}
