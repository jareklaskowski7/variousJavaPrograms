/*
    You are given a string text consisting of English letters and spaces.
    Find all the capital and lowercase Fs in it and insert a capital K right before each one of them.
    For
    text = "force", the output should be addKbeforeFs(text) = "Kforce";
    text = "fluffy", the output should be addKbeforeFs(text) = "KfluKfKfy".
     */

public class Kforce {
    public static StringBuilder addKbeforeFs(String text) {
        StringBuilder modText = new StringBuilder();
        if (text.length() >= 1 && text.length() <= Math.pow(10, 5))
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == 'f' || text.charAt(i) == 'F')
                    modText.append('K');
                modText.append(text.charAt(i));
            }

        return modText;
    }

    public static void main(String[] args) {
        StringBuilder result1 = Kforce.addKbeforeFs("force");
        System.out.println(result1);
        StringBuilder result2 = Kforce.addKbeforeFs("fluffy");
        System.out.println(result2);
    }
}
