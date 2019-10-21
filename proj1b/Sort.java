public class Sort {

    /** findSmallest() method */
    public static int findSmallest(String[] x, int start){
        int smallestIndex = start;
        for(int i = start; i < x.length; i++){
            int cmp = x[i].compareTo(x[smallestIndex]);
            if(cmp < 0){
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    /** swap() method */
    public static void swap(String[] x, int start, int smallest){
        String temp = x[start];
        x[start] = x[smallest];
        x[smallest] = temp;
    }

    /** Sort() method*/


    public static void sort(String[] x, int start){
        if(start == x.length){
            return;
        }
        int smallestIndex = findSmallest(x, start);
        swap(x, start, smallestIndex);
        sort(x, start + 1);
    }

}
