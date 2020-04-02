/*
 Please implement this method to capitalize all first letters of the words in the given String.
 All other symbols shall remain intact. If a word does not start with a letter, it shall remain intact also.
 Assume that the parameter String can only contain spaces and alphanumeric characters.
 NOTE: please keep in mind that the words can be divided by single or multiple spaces.
 The spaces also can be found at the beginning or the end of the parameter string, and you need to preserve them.
 */

public class CapitalizeFirstLetters {
    public static String capitalizeFirstLetters(String str) {
        StringBuilder finalString = new StringBuilder();
        finalString
                .append(String.valueOf(str.charAt(0))
                        .toUpperCase());
        for (int i = 1; i < str.length(); i++)
            //is letter? && String.valueOf(str.charAt(i - 1)).isLetter???
            if (String.valueOf(str.charAt(i - 1)).isBlank())
                finalString.append(String.valueOf(str.charAt(i)).toUpperCase());
            else
                finalString.append(str.charAt(i));

        return finalString.toString();
    }

    public static void main(String[] args) {
        String finalString1 = capitalizeFirstLetters("     I woUld like      to             g%jH5awp    learn     7java                  $rograMming    ");
        System.out.println(finalString1);
        String finalString2 = capitalizeFirstLetters("     I woUld like      to             K%jH5awp    learn     8java                  PrograMming    ");
        System.out.println(finalString2);
    }
}
