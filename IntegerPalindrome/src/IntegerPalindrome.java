// An integer is called palindrome if its equal to its reverse e.g. 1001 is a palindrome but 1234 is not because the reverse of 1234 is 4321
// which is not equal to 1234. You can use divide by 10 to reduce the number and modulus 10 to get the last digit. This trick is used to solve this problem.

public class IntegerPalindrome {
    public static boolean checkIntegerPalindrome1(int number) {
        boolean isIntegerPalindrome = false;
        int palindrome = number;
        int reversedNumber = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            System.out.println("remainder == " + remainder);
            reversedNumber = reversedNumber * 10 + remainder;
            System.out.println("reversedNumber == " + reversedNumber);
            palindrome /= 10;
            System.out.println("palindrome == " + palindrome);
            System.out.println();
        }

        if (number == reversedNumber)
            isIntegerPalindrome = true;

        return isIntegerPalindrome;
    }

    public static boolean checkIntegerPalindromeFrontBack(int number) {
        boolean isIntegerPalindrome = false;
        String integerPalindrome = String.valueOf(number);
        StringBuilder frontToBack = new StringBuilder();
        StringBuilder backToFront = new StringBuilder();
        for (int i = 0, j = integerPalindrome.length() - 1; i < integerPalindrome.length() && j >= 0; i++, j--) {
            frontToBack.append(integerPalindrome.charAt(i));
            backToFront.append(integerPalindrome.charAt(j));
        }
        if (frontToBack.toString().equals(backToFront.toString()))
            isIntegerPalindrome = true;

        return isIntegerPalindrome;
    }

    public static void main(String[] args) {
        int number1 = 1001;
        int number2 = 1234;
        int number3 = 57864;
        int number4 = 74247;
        boolean isIntegerPalindrome = checkIntegerPalindrome1(number2);
        if (isIntegerPalindrome)
            System.out.println(number2 + " is Integer Palindrome");
        else
            System.out.println(number2 + " is not Integer Palindrome");
    }
}
