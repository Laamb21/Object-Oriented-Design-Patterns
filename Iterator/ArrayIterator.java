package Iterator;

public class ArrayIterator implements Iterator{
   private int[] array;
   private int currentIndex;
   
   public ArrayIterator(int[] array){
        this.array = array;
        this.currentIndex = 0;
   }

   public boolean hasNext(){
        return currentIndex < array.length;
   }

   public Object next(){
        if(hasNext()){
            return array[currentIndex++];
        }
        return null;
   }
}
