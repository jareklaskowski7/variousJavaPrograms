public class CodedNumbers {
    public static int codeNumber(int number) {
        String str = String.valueOf(number);
        int halfLength = str.length() / 2;
        StringBuilder codedString = new StringBuilder();

        for (int i = 0; i < halfLength; i++) {
            codedString.append(str.charAt(i));
            if (str.length() % 2 != 0 && codedString.length() == halfLength)
                codedString.append(str.charAt(halfLength));
            codedString.append(str.charAt(str.length() - 1 - i));
        }

        return Integer.parseInt(codedString.toString());
    }

    public static void main(String[] args) {
        int number = 1238456;
        int codedNumber = codeNumber(number);
        System.out.println(codedNumber);
    }
}
