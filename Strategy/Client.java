package Strategy;

//Main class (DOES NOT ACTUALLY SORT, DEMONSTRATION PURPOSES ONLY)
public class Client {
    public static void main(String[] args) {
        //Create SortingContext with BubbleSortStrategy
        SortingContext sortingContext = new SortingContext(new BubbleSortStrategy());
        
        //Create random array
        int array1Size = (int)Math.random();
        int[] array1 = new int[array1Size];
        for(int i = 0; i < array1Size; i++){
            array1[i] = (int)Math.random();
        }

        //Sort array with BubbleSortStrategy
        sortingContext.performSort(array1);

        //Change Strategy to MergeSortStrategy
        sortingContext.setSortingStrategy(new MergeSortStrategy());

        //Create new random array
        int array2Size = (int)Math.random();
        int[] array2 = new int[array2Size];
        for(int i = 0; i < array2Size; i++){
            array2[i] = (int)Math.random();
        }

        //Sort array with MergeSort
        sortingContext.performSort(array2);

        //Chaneg Strategey to QuickSortStrategy
        sortingContext.setSortingStrategy(new QuickSortStrategey());

        //Create new random array
        int array3Size = (int)Math.random();
        int[] array3 = new int[array3Size];
        for(int i = 0; i < array3Size; i++){
            array3[i] = (int)Math.random();
        }

        //Sort array with QuickSort
        sortingContext.performSort(array3);
    }
}
