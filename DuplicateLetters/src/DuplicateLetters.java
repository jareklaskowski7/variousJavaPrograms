import java.util.*;

public class DuplicateLetters {
    public static String removeDuplicateLetters(String str) {
        Set<Character> uniqueChars = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++)
            uniqueChars.add(str.charAt(i));

        StringBuilder word = new StringBuilder();
        for (Character uniqueChar : uniqueChars)
            word.append(uniqueChar);

        return word.toString();
    }

    public static void main(String[] args) {
        String word = removeDuplicateLetters("heyhwklepqhzzaum");
        System.out.println("word == " + word);
    }
}
