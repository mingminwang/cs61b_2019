public class ArrayDeque<T> {
    private int size;
    private T[] items;
    private int nextFirst;
    private int nextLast;

    /** Create an empty list*/
    public ArrayDeque(){
        items = (T[]) new Object[8];
        size = 0;
        nextFirst = 0;
        nextLast = 7;
    }

    /** Resize the underlying array to the target capacity*/
    public void resize(int capacity){
        T[] a  = (T[]) new Object[capacity];
        System.arraycopy(items, 0, a, 0, size);
        items = a;
    }

    /** isEmpty() method*/
    public boolean isEmpty(){
        return size == 0;
    }

    /** addFirst() method*/
    public void addFirst(T x){
        if(items[0] == null){
            items[0] = x;
        }
        if(items[0] != null ){
            if(size == items.length){
                resize(size*2);
            }
            T[] newArray = (T[]) new Object[items.length];
            System.arraycopy(items, 0, newArray, 1, items.length-1);
            items = newArray;
            items[0] = x;
            size += 1;
        }
    }

    /**addLast() method*/
    public void addLast(T x){
        if(size == items.length){
            resize(size*2);
        }
        items[size] = x;
        size += 1;
    }

    /** removeFirst() method */
    public T removeFirst(){
        if(isEmpty()){
            return null;
        }
        T x = items[0];
        items[0] = null;
        size -= 1;
        T[] b = (T[]) new Object[size];
        System.arraycopy(items, 1, b, 0, size);
        items = b;
        return x;
    }


    /** removeLast() method*/
    public T removeLast(){
        if(isEmpty()){
            return null;
        }

        T x = get(size-1);
        items[size-1] = null;
        size = size - 1;
        return x;
    }

    /** printDeque() method*/
    public void printDeque(){
        for(T i: items){
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }

    /** get() method*/
    public T get(int index){

        return items[index];
    }

    /** Returns the number of items in the list. */
    public int size() {
        return size;
    }

    public static void main(String[] args){
        ArrayDeque<Integer> A = new ArrayDeque<>();
        A.addLast(1);
        A.addLast(2);
        A.addFirst(10);
        A.addFirst(10);
        A.addFirst(10);
        A.addFirst(10);

       // A.addLast(2);
       // A.addLast(2);
       // A.addFirst(63);

        //A.printDeque();
        //System.out.println(A.get(4));
        //System.out.println(A.size());
        System.out.println(A.removeLast());
        System.out.println(A.removeLast());
        System.out.println(A.removeLast());
        System.out.println(A.removeFirst());

        for(int i = 0; i <1000; i++){
            A.addFirst(i);
        }
            A.printDeque();
    }
}