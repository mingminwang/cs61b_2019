public class Palindrome {

    /** convert string word to character deque*/
    public Deque<Character> wordToDeque(String word){
        LinkedListDeque<Character> deque = new LinkedListDeque<>();
        for (int i = 0; i < word.length(); i++) {
             deque.addLast(word.charAt(i));
        }
        return deque;

    }

    /** isPalindrome method */
    public boolean isPalindrome(String word){
        Deque d = wordToDeque(word);
        while (d.size() > 1) {
            if (d.removeFirst() != d.removeLast()) {
                return false;
            }
        }
        return true;
    }

    /** another isPalindrome() method*/
    public boolean isPalindrome(String word, CharacterComparator cc){
        Deque<Character> d = wordToDeque(word);
        while(d.size() > 1){
            Character a = d.removeFirst();
            Character b = d.removeLast();
            if(!cc.equalChars(a , b)){
                return false;
            }
        }
        return true;
    }


}
