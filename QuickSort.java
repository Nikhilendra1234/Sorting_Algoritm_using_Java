class QuickSort{
    // method for display array after and before sorting.
    static void displayArr(int[]a){
        for(int val:a){
            System.out.print(val+" ");
        }
    }
    // method for swapping array elements
    static void swap(int[]a,int x,int y){
        
        int temp=a[x];
        a[x]=a[y];
        a[y]=temp;
    }
    // partition method which does the pivot element selection and the put that into the pivotposition i.e to it's correct position. Then it put all the small element into the left side of the pivot element and all the big element at the right side and then returns the pivotindex.
    static int partition(int[]a,int start,int end){
        int pivot=a[start];
        int count=0;
        for(int i=start+1;i<a.length;i++){
            if(a[i]<=pivot)
                count++;
        }
        int pivotIndex=start+count;
        swap(a,start,pivotIndex);
        int i=start;
        int j=end;
        while(i<pivotIndex && j>pivotIndex){
            while(a[i]<=pivot)i++;
            while(a[j]>pivot)j--;
            if(i<pivotIndex && j>pivotIndex){
                swap(a,i,j);
                i++;
                j--;
            }
        }
        return pivotIndex;
    }
    static void quickSort(int[]a,int start,int end){
        if(start>=end)return;
        // calling the partition method
        int pivot=partition(a,start,end);
        // recursive call to divide the array into twon parts.
        quickSort(a,start,pivot-1);
        quickSort(a,pivot+1,end);
    }
    public static void main(String[] args){
        int[] arr={4,6,7,8,3,1,5};
        System.out.println("Array before sorting");
        // calling the displayArr method to print array before sorting.
        displayArr(arr);
        // calling the quickSort() to start sorting. 
        quickSort(arr,0,arr.length-1);
        System.out.println();
        System.out.println("Array after sorting");
        // calling the displayArr method to print the array after sorting.
        displayArr(arr);
    }
}