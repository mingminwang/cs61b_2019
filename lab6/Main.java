public class Main {
    public static void main(String[] args){
        UnionFind input = new UnionFind(9);
        input.union(1, 0);
        input.union(2, 0);
        input.union(3, 0);
        input.union(4, 3);
        input.union(5, 3);

        input.union(7, 6);
        input.union(8, 6);

        System.out.println("Is 1 connected with 3? " + input.connected(1, 3));
        System.out.println("Is 0 connected with 8? " + input.connected(0, 8));

        input.union(0, 6);
        System.out.println("Is 0 connected with 8? " + input.connected(0, 8));


    }
}
