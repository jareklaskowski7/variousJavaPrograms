import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/*
Programming Challenge Description:
Credits: This problem appeared in the Facebook Hacker Cup 2013 Hackathon.

Your friend John uses a lot of emoticons when you talk to him on Messenger.
In addition to being a person who likes to express himself through emoticons, he hates unbalanced parenthesis so much that it makes him go :(.

Sometimes he puts emoticons within parentheses, and you find it hard to tell if a parenthesis really is a parenthesis or part of an emoticon.
A message has balanced parentheses if it consists of one of the following:

- An empty string ""
- One or more of the following characters: 'a' to 'z', ' ' (a space) or ':' (a colon)
- An open parenthesis '(', followed by a message with balanced parentheses, followed by a close parenthesis ')'.
- A message with balanced parentheses followed by another message with balanced parentheses.
- A smiley face ":)" or a frowny face ":("

Write a program that determines if there is a way to interpret his message while leaving the parentheses balanced.
Input:
Your program should read lines from standard input. Each line contains a message that you got from John.
Output:
Print out the string "YES"/"NO" (all quotes for clarity only) stating whether or not it is possible that the message had balanced parentheses.
 */

public class Emoticons {
    /**
     * Iterate through each line of input.
     */
    //i am sick today (:()
    //(:)
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while ((line = in.readLine()) != null) {
            int numberOfFaces = 0;
            int numberOfParentheses = 0;
            String evenOddParentheses = "";
            String evenOddFaces = "";
            for (int i = 0; i < line.length(); i++) {
                System.out.print(line.charAt(i) + ", ");
                if (String.valueOf(line.charAt(i)).equals("(") || String.valueOf(line.charAt(i)).equals(")")) {
                    numberOfParentheses += 1;
                }

                if (String.valueOf(line.charAt(i)).equals(":") && String.valueOf(line.charAt(i + 1)).equals(")") ||
                        String.valueOf(line.charAt(i)).equals(":") && String.valueOf(line.charAt(i + 1)).equals("(")) {
                    numberOfFaces += 1;
                }
            }

            int halfNumberOfParentheses = numberOfParentheses / 2;
            if (halfNumberOfParentheses * 2 == numberOfParentheses)
                evenOddParentheses = "evenParentheses";
            else
                evenOddParentheses = "oddParentheses";

            int halfNumberOfFaces = numberOfFaces / 2;
            if (halfNumberOfFaces * 2 == numberOfFaces)
                evenOddFaces = "evenFaces";
            else
                evenOddFaces = "oddFaces";

            System.out.println();

            if (evenOddParentheses.equals("evenParentheses") && evenOddFaces.equals("evenFaces") ||
                    evenOddParentheses.equals("oddParentheses") && (evenOddFaces.equals("oddFaces")) ||
                    evenOddParentheses.equals("evenParentheses")) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
