class AdvanceQue3A{
    static void displayArr(int []a ){
        for(int val:a){
            System.out.print(val+" ");
        }
    }
    static void Sort0s1s2s(int[]a){
        int coutn_0=0,count_1=0,count_2=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==0)
                coutn_0++;
            else if(a[i]==1)
                count_1++;
            else
                count_2++;
        }
        int k=0;
        while(coutn_0>0){
            a[k++]=0;
            coutn_0--;
        }
        while(count_1>0){
            a[k++]=1;
            count_1--;
        }
        while(count_2>0){
            a[k++]=2;
            count_2--;
        }
    }
    public static void main(String[] args){
        int[]a={0,1,2,1,2,0,0,1,2};
        System.out.println("Array before sorting");
        displayArr(a);
        Sort0s1s2s(a);
        System.out.println();
        System.out.println("Array after sorting");
        displayArr(a);
    }
}
