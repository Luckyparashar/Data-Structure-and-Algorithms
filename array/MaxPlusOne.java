

import java.util.Arrays;

public class MaxPlusOne {
    public static void main(String[] args) {
        int[] arr={9,7,5,2,5,1,0};
        int max=findMax(arr);
        System.out.println(max);
        int[] newarr=new int[max+1];
        for(int i=0;i<newarr.length;i++){
            newarr[i]=-1;
        }
        initData(arr, newarr);
        System.out.println(Arrays.toString(newarr));


    }
    static int findMax(int[] arr){
        int max=-1;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max, arr[i]);
        }
        return max;
    }
    static void initData(int[] arr,int[] newarr){
        for(int j=0;j<arr.length;j++){
int i=arr[j];
newarr[i]=j;
        }
        
    }
}
