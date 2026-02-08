// Christine Tobias CIT-63 SPR2026 - 2/7/2026
/* Using CONDITIONAL statements:
 * 1. Ask user for 3 separate integers
 * 2. Determine the largest among them using nested if statements
 * 3. Output the largest integer.
 */

import java.util.Scanner;

public class LargestOfThree {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Type an integer (whole number)");
    int firstNum = input.nextInt();

    System.out.println("Type an integer (whole number different than the 1st)");
    int secondNum = input.nextInt();

    System.out.println(
      "Type an integer (whole number different than the 1st or 2nd)"
    );
    int thirdNum = input.nextInt();

    int largestNum;

    if (firstNum > secondNum) {
      if (firstNum > thirdNum) {
        largestNum = firstNum;
        System.out.println(
          "The largest number is the 1st number: " + largestNum
        );
      } else {
        largestNum = thirdNum;
        System.out.println(
          "The largest number is the 3rd number: " + largestNum
        );
      }
    } else {
      if (secondNum > thirdNum) {
        largestNum = secondNum;
        System.out.println(
          "The largest number is the 2nd number: " + largestNum
        );
      } else {
        largestNum = thirdNum;
        System.out.println(
          "The largest number is the 3rd number: " + largestNum
        );
      }
    }
  }
}
