    import org.junit.Test;
    import static org.junit.Assert.*;


public class TestSort {
    /** Tests the sort method of the Sort class. */
    @Test
    public void testSort(){
        String[] input = {"i", "have", "an", "egg"};
        String[] expected = {"an", "egg", "have", "i"};
        Sort.sort(input, 0);

        assertArrayEquals(expected, input);
    }


    @Test
    public void testfindSmallest(){
        String[] input = {"i", "have", "an", "egg"};
        int expected = 2;
        int actual = Sort.findSmallest(input, 0);
        assertEquals(expected, actual);
    }

    @Test
    public void  testswap(){
        String[] input = {"i", "have", "an", "egg"};
        String[] expected = {"an", "have", "i", "egg"};
        Sort.swap(input,0, 2);

        assertArrayEquals(expected, input);
    }

}
