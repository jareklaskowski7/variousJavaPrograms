import java.util.LinkedHashMap;
import java.util.List;
import java.util.*;

public class PascalTriangle {
    private static int heightPTriangle;
    private static List<Integer> levelElements;
    private static Map<Integer, List<Integer>> pascalTriangle;
    private static StringBuilder pTriangle;

    static {
        levelElements = new LinkedList<>();
        pascalTriangle = new LinkedHashMap<>();
        pTriangle = new StringBuilder();
    }

    public static void setHeightPTriangle(int heightPTriangle) {
        PascalTriangle.heightPTriangle = heightPTriangle;
    }

    public static List<Integer> calculateLevelElements(int levelNumber, List<Integer> levElements) {
        List<Integer> tempLevElements = new LinkedList<>(levElements);
        levElements.clear();
        // Calculate all elements on each particular level of Pascal's Triangle
        for (int idx = 0; idx <= levelNumber; idx++)
            if (idx > 0 && idx < levelNumber)
                // Add middle elements
                levElements.add(tempLevElements.get(idx - 1) + tempLevElements.get(idx));
            else
                // Add 1 at the beginning and at the end of each level (first and last elements)
                levElements.add(1);

        return levElements;
    }

    public static void calculatePascalTriangle(int hPTriangle) {
        for (int levelNumber = 0; levelNumber < hPTriangle; levelNumber++) {
            List<Integer> levElements = new LinkedList<>(calculateLevelElements(levelNumber, levelElements));
            pascalTriangle.put(levelNumber, levElements);
        }
    }

    public static void printPascalTriangle() {
        String space = " ";
        // Print all elements on all levels of Pascal's Triangle
        for (Map.Entry<Integer, List<Integer>> level : pascalTriangle.entrySet()) {
            // This is one level of Pascal's Triangle (in the print format):
            /////////////////////////////////////////////////////////////////////////////////////////////////////

            // Get the level number
            int levelNumber = level.getKey();
            // Print number of spaces before all elements on each particular level
            pTriangle.append(space.repeat(Math.max(0, heightPTriangle - levelNumber - 1)));

            // Print all elements on particular level
            levelElements = level.getValue();
            for (int idx = 0; idx < levelElements.size(); idx++) {
                pTriangle.append(levelElements.get(idx));
                // Print space character after each element except last one
                if (idx < levelElements.size() - 1)
                    pTriangle.append(space);
            }

            // Print newline character after each level except last one
            if (levelNumber < heightPTriangle - 1)
                pTriangle.append("\n");

            /////////////////////////////////////////////////////////////////////////////////////////////////////
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many levels of Pascal's Triangle would you like to see? ");
        setHeightPTriangle(scan.nextInt());
        calculatePascalTriangle(heightPTriangle);
        printPascalTriangle();
        System.out.println(pTriangle);
        scan.close();
    }
}
