// Christine Tobias CIT-63 SPR2026 - 2/7/2026
/* Use 3 functions: getAnIntFromTheUser, compareTwoInts, sumTwoInts
 * Show: how functions are used to break down a problem into smaller and/or more manageable parts
 */

import java.util.Scanner;

public class MaddnessWithMethods {

  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    //Get a 1st and 2nd Integer input From the User (getAnIntFromTheUser)
    System.out.println("Type an number (between 5 and 50) :");
    int firstInt = myObj.nextInt();

    System.out.println("Type another number (between 5 and 50) :");
    int secondInt = myObj.nextInt();

    System.out.println(
      "The numbers that you have input are: " + firstInt + " and " + secondInt
    );
    //Sum of Two Integers (sumTwoInts)
    int sumTotal = firstInt + secondInt;

    System.out.println("The sum of these numbers is: " + sumTotal);
    //Comparison of Two Integers (compareTwoInts)
    if (firstInt > secondInt) {
      System.out.println("The 1st integer is GREATER THAN the 2nd integer");
    } else if (firstInt < secondInt) {
      System.out.println("The 1st integer is LESS THAN the 2nd integer");
    } else {
      System.out.println("The 1st integer is EQUAL TO the 2nd integer");
    }
  }
}
