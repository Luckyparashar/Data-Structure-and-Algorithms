import java.util.Arrays;

public class MainTest {

    public static void main(String[] args) {
        int [] arr={8,2,4,6,7,9,4,5};

        //Bubblesort.bubbleSort(arr);
        //Bubblesort.bubbleSortdesc(arr);
//---------------------------------------------------------
//SelectionSort.selectionSort(arr);
//----------------------------------------------
//InsertionSort.insertionSort(arr);
//InsertionSort.insertionSortDesc(arr);
//-----------------------------------------------
//MeargeSort.meargeSort(arr, 0, arr.length-1);
//----------------------------------------------
QuickSort.quickSort(arr, 0, arr.length-1);


System.out.println(Arrays.toString(arr));
        
    }
}