import java.util.HashMap;
import java.util.Map;

public class EqualStrings {
    public static boolean equalStrings(String s1, String s2) {
        boolean areEqualStrings = false;
        if (s1.length() == s2.length()) {
            Map<Character, Integer> uniqueCharsOccurrences = new HashMap<>();
            for (int i = 0; i < s1.length(); i++) {
                if (!uniqueCharsOccurrences.containsKey(s1.charAt(i)))
                    uniqueCharsOccurrences.put(s1.charAt(i), 1);
                else
                    uniqueCharsOccurrences.put(s1.charAt(i), uniqueCharsOccurrences.get(s1.charAt(i)) + 1);
            }

            for (int i = 0; i < s2.length(); i++)
                if (!uniqueCharsOccurrences.containsKey(s2.charAt(i)))
                    break;
                else
                    uniqueCharsOccurrences.put(s2.charAt(i), uniqueCharsOccurrences.get(s2.charAt(i)) - 1);

            areEqualStrings = true;
            for (int value : uniqueCharsOccurrences.values())
                if (value != 0) {
                    areEqualStrings = false;
                    break;
                }
        }

        return areEqualStrings;
    }

    public static void main(String[] args) {
        boolean areEqualStrings1 = equalStrings("radar", "daras");
        System.out.println(areEqualStrings1);
        boolean areEqualStrings2 = EqualStrings.equalStrings("radar", "darar");
        System.out.println(areEqualStrings2);
    }
}
