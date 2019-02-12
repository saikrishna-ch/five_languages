import java.util.*;
class NpowerN {
  public static void main(String[] args) {
    Scanner ScannerObject = new Scanner(System.in);
    System.out.print("Enter a number to multilply to itself, by it's number of times:");
    long Counter, Product = 1;
    int Number;
    Number = ScannerObject.nextInt();
    System.out.print(Number + " power "+ Number + " is ");
    for(Counter = 1; Counter <= Number; Counter++) {
      Product = Product * Number;
    }
    System.out.print(Product+ ".");
  }
}
    