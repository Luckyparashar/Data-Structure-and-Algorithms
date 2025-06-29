public class MeargeSort {
    public static void meargeSort(int[]arr, int start,int end){

        if (start<end) {
            int mid=(start+end)/2;
            meargeSort(arr, start, mid);
            meargeSort(arr, mid+1, end);
            mearge(arr,start,mid,end);
        }
    }

    private static void mearge(int[] arr, int start, int mid, int end) {
       
        int n1=mid-start+1;
        int n2=end-mid;
int [] arr1=new int[n1];
int [] arr2=new int[n2];
        for(int i=0;i<n1;i++){
arr1[i]=arr[start+i];
        }
        for(int i=0;i<n2;i++){
arr2[i]=arr[mid+1+i];
        }

int i=0,j=0,k=start;
        while (i<n1&&j<n2) {
            if (arr1[i]<=arr2[j]) {
                arr[k++]=arr1[i++];
            }else
            arr[k++]=arr2[j++];
        }

        while (i<n1) {
             arr[k++]=arr1[i++];
        }
        while (i<n2) {
             arr[k++]=arr2[j++];
        }
    }
}
