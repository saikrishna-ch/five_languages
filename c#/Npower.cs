using System;

class MainClass {
  public static void Main (string[] args) {
    Console.Write ("Enter a number to multilply to itself, by it's number of times:");
    long Counter, Product = 1;
    int Number = int.Parse(Console.ReadLine());
    Console.Write (Number + " power "+ Number + " is ");
    for(Counter = 1; Counter <= Number; Counter++) {
      Product = Product * Number;
    }
    Console.Write (Product+ ".");
  }
}