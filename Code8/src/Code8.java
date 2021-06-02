import java.util.Scanner;

public class Code8 {
    private static String phoneNumber;

    public static void setPhoneNumber(String phoneNumber) {
        Code8.phoneNumber = phoneNumber;
    }

    public static String convertPhoneNumber(String phoneNumber) {
        StringBuilder convertedPhoneNumber = new StringBuilder();
        for (int idx = 0; idx < phoneNumber.length(); idx++)
            if (Character.isDigit(phoneNumber.charAt(idx)))
                convertedPhoneNumber.append(phoneNumber.charAt(idx));

        return convertedPhoneNumber.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the phone number to convert: ");
        setPhoneNumber(scan.nextLine());
        if (phoneNumber.length() > 0)
            System.out.println("The converted phone number is: " + convertPhoneNumber(phoneNumber));
        scan.close();
    }
}
