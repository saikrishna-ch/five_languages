using System;

class MainClass {
  public static void Main (string[] args) {
    int Counter;
    Console.Write ("To find the greatest number amoung ten numbers, enter the first number:");
    long [] Numbers = new long [10];
    Numbers[0] = long.Parse(Console.ReadLine());
    for(Counter = 1; Counter < 10; Counter++) {
      Console.Write ("Enter next number:");
      Numbers[Counter] = long.Parse(Console.ReadLine());
    }
    long Max = Numbers[0];
    for(Counter = 1; Counter < 10; Counter++) {
      if(Max < Numbers[Counter]) {
        Max = Numbers[Counter];
      }
    }
    Console.Write ("The greatest of ten numbers is {0}.", Max);
  }
}