/*
 Note- Floyd Triangle is like
        1
        2 3
        4 5 6
        7 8 9 10
    */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FloydTriangle {
    private static int floydTriangleHeight;

    public static void setFloydTriangleHeight(int floydTriangleHeight) {
        FloydTriangle.floydTriangleHeight = floydTriangleHeight;
    }

    public static String createFloydTriangle() {
        StringBuilder floydTriangleSb = new StringBuilder();

        List<Integer> rowContent = new ArrayList<>();
        rowContent.add(1);
        for (int i = 0; i < FloydTriangle.floydTriangleHeight; i++) {
            for (int j = 0; j < rowContent.size(); j++) {
                floydTriangleSb.append(rowContent.get(j));
                if (j != rowContent.size() - 1)
                    floydTriangleSb.append(" ");
            }
            floydTriangleSb.append("\n");

            rowContent.add(i + 1, rowContent.get(rowContent.size() - 1) + 1);
            for (int k = 0; k < rowContent.size(); k++)
                rowContent.set(k, rowContent.get(rowContent.size() - 1) + k);
        }

        return floydTriangleSb.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the height of the Floyd Triangle: ");
        setFloydTriangleHeight(scan.nextInt());
        String floydTriangle = createFloydTriangle();
        System.out.println("Floyd Triangle:");
        System.out.println(floydTriangle);

        /*
        int n = 0;
        for (int i = 0; i < fT.floydTriangleheight; i++) {
            for (int j = 0; j <= i; j++)
                System.out.print(++n + " ");
            System.out.println();
        }
        */
    }
}
