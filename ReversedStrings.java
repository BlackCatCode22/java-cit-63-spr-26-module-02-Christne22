// Christine Tobias CIT-63 SPR2026 - 2/7/2026
/* Take a user's input "string" and reverse it so the letters will appear backwards
 */

import java.util.Scanner;

public class ReversedStrings {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Type a single word (between 5 and 8 letters long): ");
    String originalStr = input.nextLine();

    String reversedStr = new StringBuilder(originalStr).reverse().toString();

    System.out.println("The original string is: " + originalStr);
    System.out.println("The reverse string is: " + reversedStr);
  }
}
