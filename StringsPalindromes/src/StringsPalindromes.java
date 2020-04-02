/*
    carrac
    karan
    madam
    tom
    honda
    civic
    radar
    sexes
    jimmy
    kayak
    john
    refer
    billy
    did
    prawkarp
    flaxalf
    0
    t
    ps
    rr
    mistake
    ""
    */

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class StringsPalindromes {
    private static int numPalindromes;
    private static String palindrome;
    private static List<String> palindromes;

    static {
        palindromes = new LinkedList<>();
    }

    public static void setNumPalindromes(int numPalindromes) {
        StringsPalindromes.numPalindromes = numPalindromes;
    }

    public static void setPalindrome(String palindrome) {
        StringsPalindromes.palindrome = palindrome;
    }

    public static boolean checkPalindrome(String word) {
        boolean isPalindrome = true;
        for (int idx = 0; idx < word.length() / 2; idx++) {
            if (word.charAt(idx) != word.charAt(word.length() - 1 - idx)) {
                isPalindrome = false;
                break;
            }
        }

        return isPalindrome;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many palindromes would you like to check? ");
        setNumPalindromes(scan.nextInt());
        while (numPalindromes > 0) {
            System.out.print("Please enter a word: ");
            setPalindrome(scan.next());
            if (checkPalindrome(palindrome))
                palindromes.add(palindrome);
            numPalindromes--;
        }

        if (palindromes.size() > 0)
            System.out.println("Palindromes:");
        for (String palindrome : palindromes)
            System.out.println(palindrome);
        scan.close();
    }
}
