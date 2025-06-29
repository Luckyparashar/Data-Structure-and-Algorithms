import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int [] arr ={10,7,5,4,12,7,8,1};
        int m=max(arr);
        System.out.println(m);
        int [] newarr=new int [m+1];
        putInTheirIndex(arr, newarr);
        System.out.println(Arrays.toString(newarr));
        sort(arr, newarr);
        System.out.println(Arrays.toString(arr));


    }
    static int max(int []arr){
        int m=Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]<arr[i])
            m=Math.max(m, arr[i]);
       else
        m=Math.max(m, arr[i-1]);
         }
        return m;
    }
    static void putInTheirIndex(int []arr,int []newarr){
        for(int i=0;i<arr.length;i++){
            ++newarr[arr[i]];
        }
    }
    static void sort(int[]arr ,int[] newarr){
        int i=0;
        int k=0;
        while (i<newarr.length) {
            while(newarr[i]>0){
                arr[k]=i;
                k++;
                --newarr[i];
            }
            i++;
            
        }
    }
}
