package Iterator;

public class ArrayAggregate implements Aggregate{
    private int[] array;

    public ArrayAggregate(int[] array){
        this.array = array;
    }

    public Iterator createIterator(){
        return new ArrayIterator(array);
    }
}
