public class InsertionSort {

    public static void insertionSort(int[] arr) {
        int n=arr.length;
        for(int i=1;i<n;i++){
            int current=arr[i];
            int j=i-1;
            while (j>=0&&current<arr[j]) {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
    }

    public static void insertionSortDesc(int[] arr) {
        int n=arr.length;
        for(int i=1;i<n;i++){
            int current=arr[i];
            int j=i-1;
            while (j>=0&&current>arr[j]) {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
    }
}