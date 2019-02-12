#include <stdio.h>

int main(void) {
  int FirstNumber, SecondNumber, Sum;
  printf("To find the sum of two numbers, enter the first number:");
  scanf("%d", &FirstNumber);
  printf("Enter the second number:");
  scanf("%d", &SecondNumber);
  Sum = FirstNumber+SecondNumber;
  printf("The sum of %d and %d is %d.", FirstNumber, SecondNumber, Sum);
  return 0;
}