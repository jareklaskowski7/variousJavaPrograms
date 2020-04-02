/*
Write a Java program to print all permutations of a given String.
For example, if given String is "GOD" then your program should print all 6 permutations of this string e.g.
"GOD", "OGD", "DOG", "GDO", "ODG", and "DGO".
*/

public class AllPermutationsStringRecursion {
    private static StringBuilder allPermutations;

    static {
        allPermutations = new StringBuilder("All Permutations of the given String:\n");
    }

    public static void stringPermutation(String strPerm, String str) {
        //if (!str.isEmpty()) {
        if (str.length() > 0)
            for (int i = 0; i < str.length(); i++)
                stringPermutation(strPerm + str.charAt(i), str.substring(0, i) + str.substring(i + 1));
        else
            allPermutations
                    .append(strPerm)
                    .append("\n");
    }

    public static void main(String[] args) {
        stringPermutation("", "GOD");
        System.out.println(allPermutations.toString());
    }
}
