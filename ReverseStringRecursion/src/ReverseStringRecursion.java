// Write a program to reverse a string using recursive methods.
// You should not use any string reverse methods to do this.

import java.util.Scanner;

public class ReverseStringRecursion {
    private static String str;
    private static String reversedStr = "";

    public static void setStr(String str) {
        ReverseStringRecursion.str = str;
    }

    public static String reverseStringRecursion(String str) {
        if (str.length() > 0) {
            reversedStr += str.charAt(str.length() - 1);
            str = str.substring(0, str.length() - 1);
            return reverseStringRecursion(str);
        } else {
            return reversedStr;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Please enter the string to reverse: ");
            setStr(scan.nextLine());
            String reversedStr = reverseStringRecursion(str);
            if (str.length() > 0)
                System.out.println("reversedStr == " + reversedStr);
        } while (str.length() == 0);
        scan.close();
    }
}
