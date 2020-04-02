import java.util.Scanner;

public class ReverseString {
    private static String str;

    public static void setStr(String str) {
        ReverseString.str = str;
    }

    public static String reverseString(String str) {
        StringBuilder reversedString = new StringBuilder();
        for (int idx = str.length() - 1; idx >= 0; idx--)
            reversedString.append(str.charAt(idx));
        return reversedString.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the string to reverse: ");
        setStr(scan.nextLine());
        if (str.length() > 0) {
            String reversedString = reverseString(str);
            System.out.println("The reversed string is: " + reversedString);
        }
        scan.close();
    }
}
