public class temp {
    public static void main(String[] args) {
        IntList A = IntList.of(1, 2, 3);
        IntList B = IntList.of(4, 5, 6);

        IntList x = IntList.catenate(A, B);
        IntList y = IntList.dcatenate(A,B);


        System.out.println(x);
        System.out.println(y);
    }
}
