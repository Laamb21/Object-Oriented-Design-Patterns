package Iterator;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {92, 15, 98, 24, 53, 13, 12, 16,  0, 23};

        //Create concrete aggregate
        ArrayAggregate arrayAggregate = new ArrayAggregate(numbers);

        //Get iterator from aggregate
        Iterator iterator = arrayAggregate.createIterator();

        //Traverse through elements using iterator
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
