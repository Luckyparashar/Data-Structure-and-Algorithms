public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minidx=i;
            for(int j=i+1;j<n;j++)
            {
                if (arr[j]<arr[minidx]) {
                    minidx=j;
                    
                }
            }
            int temp=arr[i];
            arr[i]=arr[minidx];
            arr[minidx]=temp;
        }
    }
}
