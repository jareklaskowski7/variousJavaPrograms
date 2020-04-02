import java.util.Scanner;

public class Triangle01 {
    private static int triangle01Height;

    public static void setTriangle01Height(int triangle01Height) {
        Triangle01.triangle01Height = triangle01Height;
    }

    public static String createTriangle01() {
        StringBuilder triangle01Sb = new StringBuilder();
        for (int x = 0, rowNum = 0; rowNum < triangle01Height; rowNum++) {
            for (int rowLength = 0; rowLength <= rowNum; rowLength++) {
                triangle01Sb.append(x);
                x = x == 0 ? 1 : 0;
            }
            if (rowNum < triangle01Height - 1)
                triangle01Sb.append("\n");
        }

        return triangle01Sb.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How high of the triangle would you like to see? ");
        setTriangle01Height(scan.nextInt());
        String triangle01 = createTriangle01();
        System.out.println(triangle01);
        scan.close();
    }
}
