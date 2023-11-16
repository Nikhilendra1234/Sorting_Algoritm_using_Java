// Given an array where all its elements are sorted in increasing order except two swapped elements, sort it in a linear time assume there is no duplicate in the array.
// input:-[3,8,6,7,5,9]
// output:-[3,5,6,7,8,9]
class AdvanceQuestion1{
    static void displayArr(int[]a){
        for(int i:a)
            System.out.print(i+" ");
    }
    static void swap(int[]a,int x,int y){
        int temp=a[x];
        a[x]=a[y];
        a[y]=temp;
    }
    static void sortTwoDigit(int[] a){
        if(a.length<=1)return;
        int x=-1,y=-1;
        for(int i=1;i<a.length;i++){
            if(a[i-1]>a[i]){
                if(x==-1){
                    x=i-1;
                    y=i;
                }
                else
                    y=i;
            }
        }
        swap(a,x,y);
    }
    public static void main(String[]args){
        int[]a={3,8,6,7,5,9};
        System.out.println("Array before sorting");
        displayArr(a);
        sortTwoDigit(a);
        System.out.println();
        System.out.println("Array after sorting");
        displayArr(a);
    }
}