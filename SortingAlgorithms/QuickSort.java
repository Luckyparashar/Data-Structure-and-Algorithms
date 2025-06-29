public class QuickSort {
    public static  void quickSort(int [] arr, int start,int end){
        if(start<end){

            int i =partition(arr, start, end);
            quickSort(arr, start, i - 1);  
            quickSort(arr, i + 1, end);
        }
    }

    private static int partition(int[] arr, int start, int end) {
       
        int pivot = arr[end];
        int i = start - 1; // Index of smaller element
        for(int j=start;j<end;j++){
if (arr[j]<=pivot) {
    i++;
    int temp=arr[j];
    arr[j]=arr[i];
    arr[i]=temp;
}
        }
        int temp=arr[i+1];
        arr[i+1]=arr[end];
        arr[end]=temp;
return i+1;
    }
}
