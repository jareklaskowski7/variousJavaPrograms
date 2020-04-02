/*
Given an input string, write a function that returns the Run Length Encoded string for the input string.
For example, if the input string is ‘wwwwaaadexxxxxx’, then the function should return ‘w4a3d1e1x6’.
Str = ‘abccccedfffghegggg’
 */

public class EncodeString {
    public static String encodeString(String word) {
        StringBuilder encodedWord = new StringBuilder();
        int counter = 1;
        for (int i = 0; i < word.length(); i++) {
            if (i != word.length() - 1 && word.charAt(i) == word.charAt(i + 1)) {
                counter++;
            } else {
                encodedWord
                        .append(word.charAt(i))
                        .append(counter);
                counter = 1;
            }
        }

        return encodedWord.toString();
    }

    public static void main(String[] args) {
        String str1 = "wwwwaaadexxxxxx";
        String str2 = "abccccedfffghegggg";
        String encodedString1 = encodeString(str1);
        System.out.println("encodedString1 == " + encodedString1);
        String encodedString2 = EncodeString.encodeString(str2);
        System.out.println("encodedString2 == " + encodedString2);
    }
}
