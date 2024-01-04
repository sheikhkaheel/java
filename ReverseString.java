public class ReverseString {
    public boolean checkReverse(String input) {
        int str = input.length();
        String pallindromeStr = "";
        for (int i = str - 1; i >= 0; i--) {
            pallindromeStr = pallindromeStr + input.charAt(i);
        }
    
        if (input.equals(pallindromeStr)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        boolean result = rs.checkReverse("racecar");
        if (result) {
            System.out.println("Is Palindrome String");
        } else {
            System.out.println("Is not Palindrome String");
        }
    }
}
