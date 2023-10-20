// given an array of strings and we have to sort it bh lexicographic order using the selection sort Algorithm.
class SortLexically {
    static void sortFruits(String[] fruits){
        int n=fruits.length;
        for(int i=0;i<n-1;i++)
        {
            int min_index=i;
            for(int j=i+1;j<n;j++){
                if(fruits[j].compareTo(fruits[min_index]) < 0){
                    min_index=j;
                }
            }
            String temp=fruits[min_index];
            fruits[min_index]=fruits[i];
            fruits[i]=temp;
        }
    }
    public static void main(String[] args) {
        String[] arr={"apple","papaya","orange","kiwi","lemon"};
        sortFruits(arr);
        for(String i:arr){
            System.out.print(i+" ");
        }
    }    
}
