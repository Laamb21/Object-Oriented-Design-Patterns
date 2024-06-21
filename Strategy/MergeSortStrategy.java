package Strategy;

public class MergeSortStrategy implements SortingStrategy{
    @Override
    public void sort(int[] array){
        System.out.println("Sorting using Merge Sort.");
        mergeSort(array);
    }

    //MergeSort algorithm implementation
    private static void mergeSort(int[] array){
        if(array != null && array.length > 1){
            mergeSortHelper(array, 0, array.length - 1);
        }
    }

    //Method to merge two subarrays
    private static void merge(int[] array, int left, int mid, int right){
        //Find sizes of two subarrays to be merged 
        int n1 = mid - left + 1;
        int n2 = right - mid;

        //Create temporary arrays 
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];
        
        //Copy data to temporary arrays
        for(int i = 0; i < n1; i++){
            leftArray[i] = array[left + i];
        }
        for(int j = 0; j < n2; j++){
            rightArray[j] = array[mid + 1 + j];
        }

        //Initali indexes of first and second subarrays
        int i = 0;
        int j = 0;

        //Inital index of merged subarray
        int k = left;

        //Merge the temporary arrays
        while(i < n1 && j < n2){
            if(leftArray[i] <= rightArray[j]){
                array[k] = leftArray[i];
                i++;
            }
            else{
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        //Copy remaining elements of leftArray[] if any
        while(i < n1){
            array[k] = leftArray[i];
            i++;
            k++;
        }

        //Copy remaining elements of rightArray[] if any
        while(j < n2){
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    //Helper method to handle recursion
    private static void mergeSortHelper(int[] array, int left, int right){
        if(left < right){
            //Find the middle point
            int mid = left + (right - left) / 2;

            //Sort first and second halves
            mergeSortHelper(array, left, mid);
            mergeSortHelper(array, mid + 1, right);

            //Merge sorted halves
            merge(array, left, mid, right); 
        }
    }
}
