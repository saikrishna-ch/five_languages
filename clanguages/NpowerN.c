#include <stdio.h>
long int power (long int a); 
int main(void) {
  long int Number;
  printf("Enter a number to multilply to itself by it's number of times:");
  scanf("%ld", &Number);
  printf("%ld power %ld is ", Number, Number);
  printf("%ld.", power(Number));
  return 0;
}
long int power(long int a) {
 long int Product = 1, Counter;
  for(Counter = 1; Counter <= a; Counter++) {
    Product = Product * a;
  }
  return Product;
}