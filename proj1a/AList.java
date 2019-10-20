public class AList {
    private int[] items;
    private int size;

    /** Creates an empty list. */
    public AList() {
        items = new int[3];
        size = 0;
    }

    /**Resize the underlying array to the target capacity.*/
    public void resize(int capacity){
        int[] a = new int[capacity];
        System.arraycopy(items, 0, a, 0, size);
        items = a;
    }

    /** Inserts X into the back of the list. */
    public void addLast(int x) {
        if(size == items.length){
            resize(size*5);
        }

        items[size] = x;
        size = size + 1;
    }

    /** Returns the item from the back of the list. */
    public int getLast() {
        return items[size - 1];
    }
    /** Gets the ith item in the list (0 is the front). */
    public int get(int i) {
        return items[i];
    }

    /** Returns the number of items in the list. */
    public int size() {
        return size;
    }

    /** Deletes item from back of the list and
     * returns deleted item. */
    public int removeLast() {
        int x = getLast();
        size = size - 1;
        return x;
    }

    /** main method*/
     public static void main(String[] args){
        AList d1 = new AList();
        d1.addLast(3);
        d1.addLast(4);
        d1.addLast(5);
        d1.addLast(6);

        System.out.println(d1.size);
        System.out.println(d1.getLast());
        System.out.println(d1.get(0));

        d1.removeLast();
        System.out.println(d1.size);
        System.out.println(d1.getLast());
        System.out.println(d1.get(0));
    }
}
