import java.util.*;

public class Anagrams {

    public static boolean checkAnagrams(String s1, String s2) {
        boolean areAnagrams = true;

        Map<Character, Integer> uniqueCharsOccurrences = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            if (!String.valueOf(s1.charAt(i)).isBlank()) {
                Character smallCharacter = String.valueOf(s1.charAt(i)).toLowerCase().charAt(0);
                if (!uniqueCharsOccurrences.containsKey(smallCharacter))
                    uniqueCharsOccurrences.put(smallCharacter, 1);
                else
                    uniqueCharsOccurrences.put(smallCharacter, uniqueCharsOccurrences.get(smallCharacter) + 1);
            }
        }

        for (int i = 0; i < s2.length(); i++) {
            if (!String.valueOf(s2.charAt(i)).isBlank()) {
                Character smallCharacter = String.valueOf(s2.charAt(i)).toLowerCase().charAt(0);
                if (!uniqueCharsOccurrences.containsKey(smallCharacter))
                    break;
                else
                    uniqueCharsOccurrences.put(smallCharacter, uniqueCharsOccurrences.get(smallCharacter) - 1);
            }
        }

        for (int value : uniqueCharsOccurrences.values())
            if (value != 0) {
                areAnagrams = false;
                break;
            }

        return areAnagrams;
    }

    public static void main(String[] args) {
        boolean areAnagrams = checkAnagrams("William Shakespeare", "I am a weakish speller");
        System.out.println(areAnagrams);
    }
}
