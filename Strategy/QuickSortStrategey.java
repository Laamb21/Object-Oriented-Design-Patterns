package Strategy;

//Concrete Strategy class
public class QuickSortStrategey implements SortingStrategy{
    @Override
    public void sort(int[] array){
        System.out.println("Sorting using Quick Sort.");
        quickSort(array, array[0], array[array.length - 1]);
    }

    //Quick Sort algorithm implementation 

    //A utility function to swap two elements 
    public static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    //Function that takes last element as a pivot, places pivot element at correct position 
    //in the sorted array, and places all smaller elements to the left of the pivot, and all 
    //greater elements to the right of the pivot
    public static int partition(int[] array, int low, int high){
        //Choosing a partition
        int pivot = array[high];

        //Index of smaller element indicates the right position of pivot found thus far
        int i = (low - 1);

        for(int j = low; j <= high; j++){
            //If current element if smaller than pivot...
            if(array[j] < pivot){
                //Increment index of smaller element
                i++;
                swap(array, i, j);  
            }
        }

        swap(array, i + 1, high);
        return (i + 1);
    }

    //Main function that implements QuickSort
    public static void quickSort(int[] array, int low, int high){
        if(low < high){
            int pivot = partition(array, low, high);
            quickSort(array, low, pivot - 1);
            quickSort(array, pivot + 1, high);
        }
    }
}
