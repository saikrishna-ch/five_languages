import java.util.*;
class Maximum {
  public static void main(String[] args) {
    int Numbers[], Counter;
    System.out.print("To find the greatest number amoung ten numbers, enter the first number:");
    Numbers = new int[10];
    Scanner ScannerObject = new Scanner(System.in);
    Numbers[0] = ScannerObject.nextInt();
    for(Counter = 1; Counter < 10; Counter++) {
      System.out.print("Enter next number:");
      Numbers[Counter] = ScannerObject.nextInt();
    }
    int Max = Numbers[0];
    for(Counter = 1; Counter < 10; Counter++) {
      if(Max < Numbers[Counter]) {
        Max = Numbers[Counter];
      }
    }
    System.out.printf("The greatest of ten numbers is %d.", Max);
  }
} 