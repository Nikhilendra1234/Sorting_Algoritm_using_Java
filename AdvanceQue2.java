// Given an array of positive and negative integers ,segregate them in a linear time  and constant space. The output should print all negative numbers followed by all positive numbers.
// input:- [-2,5,-20,7,5,-7,9,-4];
// output:-[-2,-20,-7,-4,5,7,5,9];
 class AdvanceQuestion2{
    static void displayArr(int[]a){
        for(int val:a)
            System.out.print(val+" ");
    }
    static void swap(int[]a,int x,int y){
        int temp=a[x];
        a[x]=a[y];
        a[y]=temp;
    }
    static void sortNegativePositive(int[]a,int start,int end){
        int i=start, j=end;
        while(i<=j){
            while(a[i]<0)i++;
            while(a[j]>=0)j--;
            if(i<=j){
                swap(a,i,j);
                i++;
                j--;
            }
        }
    }
    public static void main(String[]args){
        int[] a={-2,5,-20,7,5,-7,9,-4};
        System.out.println("Array before sorting");
        displayArr(a);
        sortNegativePositive(a,0,a.length-1);
        System.out.println();
        System.out.println("Array after sorting");
        displayArr(a);
    }
}