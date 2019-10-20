public class SppedTestAList {
    public static void main(String[] args){
        AList L = new AList();
        int i = 0;
        while(i < 100000000){
            L.addLast(i);
            i = i + 1;
        }

        System.out.println(L.size());

    }
}
