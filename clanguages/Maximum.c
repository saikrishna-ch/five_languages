#include <stdio.h>


int main(void) {
  
  int Counter = 0, Size;
  printf("enter a number:");
  scanf("%d", &Size);
  int Numbers[Size];
  printf("To find the greatest number amoung %d numbers, enter the first number:", Size);
  scanf("%d", &Numbers[Counter]);
  for(Counter = 1; Counter < Size; Counter++) {
    printf("Enter next number:");
    scanf("%d", &Numbers[Counter]);
  }
  int Max = Numbers[0];
  for(Counter = 1; Counter < Size; Counter++) {
    if(Max < Numbers[Counter]) {
      Max = Numbers[Counter];
    }
  }
  printf("The greatest of %d numbers is %d.",Size, Max);
  return 0;
}