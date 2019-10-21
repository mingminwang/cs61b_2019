import org.junit.Test;
import static org.junit.Assert.*;

public class TestPalindrome {
    // You must use this palindrome, and not instantiate
    // new Palindromes, or the autograder might be upset.
    static Palindrome palindrome = new Palindrome();

    @Test
    public void testWordToDeque() {
        Deque d = palindrome.wordToDeque("persiflage");
        String actual = "";
        for (int i = 0; i < "persiflage".length(); i++) {
            actual += d.removeFirst();
        }

        assertEquals("persiflage", actual);
    }

    @Test
    public void testIsPalindrome(){
        String word1 = "r";
        String word2 = "racecac";

        assertFalse(palindrome.isPalindrome(word2));
        assertTrue(palindrome.isPalindrome(word1));
    }

    @Test
    public void testIsPalindromecc(){
         CharacterComparator offByOne = new OffByOne();
         CharacterComparator offByFive = new OffByN(5);

        assertTrue(offByOne.equalChars('a', 'b'));
        assertTrue(offByFive.equalChars('a', 'f'));

        assertFalse(offByOne.equalChars('x', 'z'));
        assertFalse(offByFive.equalChars('a', 'c'));

    }

}

//Uncomment this class once you've created your Palindrome class.