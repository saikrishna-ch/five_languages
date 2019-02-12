Number = int(input("Enter a number to multilply to itself by it's number of times:"))
print("{} power {} is".format(Number, Number), end = "")
Product = 1
for Counter in range(Number):
  Product = Product * Number
print(" {}.".format(Product))
  