using System;

class MainClass {
  public static void Main (string[] args) {
    int FirstNumber, SecondNumber, Sum;
    Console.Write ("To find the sum of two numbers, enter the first number:");
    FirstNumber = int.Parse(Console.ReadLine());
    Console.Write ("Enter the SecondNumber number:");
    SecondNumber = int.Parse(Console.ReadLine());
    Sum = FirstNumber + SecondNumber;
    Console.Write ("The sum of " + FirstNumber + " and " + SecondNumber + " is " + Sum + ".");
  }
}