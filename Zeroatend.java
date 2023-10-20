// Given an integer array arr, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
// Note that you must do this inplace with out making a copy of the array.
// input:- 0,5,0,3,42
// output:- 5 3 42 0 0
// we can solve this problem the Bubble Sort Algorithm though we have to place the 0's to the end of the array.we an do it using Bubble sort by swaping it adjacent elements.
// code
class ZeroAtEnd{
    static void funZeroAtEnd(int[] a){
        int n=a.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]==0 && a[j+1]!= 0){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] a={4,2,0,6,0,5};
        funZeroAtEnd(a);
        for(int i:a){
            System.out.print(i+" ");
        }
    }
} 