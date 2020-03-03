import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        if (checkIfPalindrome(word,0) == true) {
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is not a palindrome. Better luck next time!");
        }

    }

    private static Boolean checkIfPalindrome(String word, int round) {
        int start = round;
        int end = word.length()-1-round;
        Boolean isPalindrome = true;
        if (end-start>0) {
            if (word.toCharArray()[start] == word.toCharArray()[end]) {
                round++;
                checkIfPalindrome(word, round);
            } else {
                isPalindrome = false;
            }
        }
        return isPalindrome;
    }
}

