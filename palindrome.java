package interfaces;

public class palindrome {
    public static boolean isPalindrome(String word) {
        int n = word.length();
        String lowerCaseWord = word.toLowerCase(); // This is to convert to lowercase
        for (int i = 0; i < n / 2; i++) {
          if (lowerCaseWord.charAt(i) != lowerCaseWord.charAt(n - i - 1)) {
            return false;
          }
        }
        return true;
      }
      public static void main(String[] args) {
        String dword = "Mom"; // Input any word of your desire
        boolean isPalindrome = isPalindrome(dword);
        if (isPalindrome) {
          System.out.println(dword + " is a palindrome.");
        } else {
          System.out.println(dword + " is not a palindrome.");
        }
      }
}
