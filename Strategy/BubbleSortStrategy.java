package Strategy;

//Concrete Strategy class
public class BubbleSortStrategy implements SortingStrategy{
    @Override
    public void sort(int[] array){
        System.out.println("Sorting using Bubble Sort.");
        bubbleSort(array);
        printArray(array);
    }

    //BubbleSort algorithm implementation
    public static void bubbleSort(int[] array){
        int temp;
        boolean swapped;
        for(int i = 0; i < array.length - 1; i++){
            swapped = false;
            for(int j = 0; j < array.length - i - 1; j ++){
                if(array[j] > array[j + 1]){
                    //Swap array[j] and array[j+1]
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swapped = true;
                }
            }
            //If no two elements were swapped by inner loop, then break
            if(swapped == false){
                break;
            }
        }
    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(i + " ");
        }
    }
}
