ReadList = []
ReadList.append(int(input("To find the greatest number amoung ten numbers, enter the first number:")))
for Counter in range(1, 10):
  ReadList.append(int(input("Enter next number: ")))
Max = ReadList[0]
for Counter in range(1, 10):
  if Max < ReadList[Counter]:
    Max = ReadList[Counter]
print("The greatest of ten numbers is {}.".format(Max))
  