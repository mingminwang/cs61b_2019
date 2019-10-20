public class LinkedListDeque<T> {
    private StuffNode sentinel;
    private int size;
    private StuffNode last;

    public class StuffNode {
        public StuffNode prev;
        public T item;
        public StuffNode next;

        public StuffNode(StuffNode p, T i, StuffNode n){
            prev = p;
            item = i;
            next = n;
        }
    }

    public LinkedListDeque(){
        sentinel = new StuffNode(null, null, null);
        sentinel.prev = sentinel;
        sentinel.next = sentinel;
        size = 0;
    }

    /**Add element x to the beginning of the list, by breaking old links and build new links
     * to form a loop of links of all elements of the list*/
    public void addFirst(T x){
        sentinel.next =  new StuffNode(sentinel, x, sentinel.next);
        sentinel.next.next.prev = sentinel.next;
        size += 1;

    }

    /**Add element x to the end of the list*/
    public void addLast(T x){
        sentinel.prev.next = new StuffNode(sentinel.prev, x, sentinel);
        sentinel.prev =  sentinel.prev.next;
        size +=1;
    }

    /** isEmpty() method*/
    public boolean isEmpty(){
        return size == 0;
    }

    /** size() method*/
    public int size(){
        return size;
    }

    /** print items of the list*/
    public void printDeque(){
        StuffNode temp = sentinel.next;
        for(int i = 0; i < size ; i++){

            System.out.print(temp.item + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    /** removeFirst() method
     * by breaking the links of the second node */
    public T removeFirst(){
        if(isEmpty()){
            return null;
        }

        T res = sentinel.next.item;
        sentinel.next = sentinel.next.next;
        sentinel.next.prev = sentinel;
        size -= 1;
        return res;
    }

    /** removeLast() method */
    public T removeLast(){
        if(isEmpty()){
            return null;
        }

        T res = sentinel.prev.item;
        sentinel.prev = sentinel.prev.prev;
        sentinel.prev.next = sentinel;
        size -= 1;
        return res;
    }

    /** get() method*/
    public T get(int index){
        StuffNode temp = sentinel.next;

        for(int i = 0; i < size; i++){

            if(i == index){
                return temp.item;
            }
            temp = temp.next;
        }
        return null;
    }

    /**
    public static void main(String[] args){
        LinkedListDeque<String> d1 = new LinkedListDeque<>();
        d1.addFirst("new");
        d1.addFirst("happy");
        d1.addLast("year!");
        d1.printDeque();
        System.out.println(d1.get(2));
        //System.out.println(d1.removeFirst());
        //System.out.println(d1.removeLast());
        //d1.printDeque();
        //System.out.println(d1.sentinel.next.item);
        //System.out.println(d1.sentinel.prev.item);
        d1.printDeque();
    }
    */
}
