import java.util.*;
class Main {
  public static void main(String[] args) {
    int FirstNumber, SecondNumber, Sum;
    Scanner ScannerObject = new Scanner(System.in);
    System.out.print("To find the sum of two numbers, enter the first number:");
    FirstNumber = ScannerObject.nextInt();
    System.out.print("Enter the SecondNumber number:");
    SecondNumber = ScannerObject.nextInt();
    Sum = FirstNumber + SecondNumber;
    System.out.print("The sum of " + FirstNumber + " and " + SecondNumber + " is " + Sum + ".");
  }
}