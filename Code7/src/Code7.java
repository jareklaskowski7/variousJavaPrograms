public class Code7 {
    public static void main(String[] args) {
        System.out.println("0 % 5 == " + 0 % 5);
        System.out.println("1 % 5 == " + 1 % 5);
        int counter = 0;
        for (int i = 0; i < 150; i++) {
            if (i % 5 == 0) {
                continue;
            }
            for (int j = 0; j < 100; j++) {
                System.out.print("here\n");
                counter++;
            }
        }
        System.out.println("counter == " + counter);
        // Counter equals 12,000 just what I thought
    }
}
