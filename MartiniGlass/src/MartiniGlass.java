/*
Write the code to support the printing of a martini glass to the console using ASCII characters.
It should support the taking of an integer value that represents the size of martini glass to output.
The output should look like the examples below.

Example Output: PrintGlass(4);
0000000
 00000
  000
   0
   |
   |
   |
   |
=======

Example Output: PrintGlass(5);
000000000
  0000000
    00000
      000
        0
        |
        |
        |
        |
        |
=========
 */

import java.util.Scanner;

public class MartiniGlass {
    private static int sizeMartiniGlass;
    private static StringBuilder martiniGlassTop = new StringBuilder();
    private static StringBuilder martiniGlassBottom = new StringBuilder();

    public static void setSizeMartiniGlass(int sizeMartiniGlass) {
        MartiniGlass.sizeMartiniGlass = sizeMartiniGlass;
    }

    public static String createMartiniGlass(int sizeMartiniGlass) {
        int halfMinusOneCharMartiniGlass = sizeMartiniGlass;
        int topDiameterMartiniGlass = sizeMartiniGlass * 2 - 1;
        int currentDiameterMartiniGlass = topDiameterMartiniGlass;

        for (int level = 0; level < sizeMartiniGlass; level++) {
            // Top 0
            martiniGlassTop.append(" ".repeat(Math.max(0, sizeMartiniGlass - halfMinusOneCharMartiniGlass)));
            halfMinusOneCharMartiniGlass--;

            // Top 1
            martiniGlassTop.append("0".repeat(Math.max(0, currentDiameterMartiniGlass)));
            martiniGlassTop.append("\n");
            currentDiameterMartiniGlass -= 2;

            // Bottom 0
            martiniGlassBottom.append(" ".repeat(sizeMartiniGlass - 1));
            martiniGlassBottom
                    .append("|")
                    .append("\n");
        }

        // Bottom 1
        martiniGlassBottom.append("=".repeat(Math.max(0, topDiameterMartiniGlass)));
        martiniGlassBottom.append("\n");

        return martiniGlassTop.toString() + martiniGlassBottom.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Enter the size of the martini glass (2 or more): ");
            setSizeMartiniGlass(scan.nextInt());
            if (sizeMartiniGlass >= 2) {
                String martiniGlass = createMartiniGlass(sizeMartiniGlass);
                System.out.println(martiniGlass);
            }
        } while (sizeMartiniGlass < 2);
        scan.close();
    }
}
