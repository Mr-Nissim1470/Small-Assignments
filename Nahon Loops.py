


def NahonLoops():
#The following lines will demonstrate the first part of the assignment
    x=10
    while x>=0:
        print(x,end=" ",sep=,)
        x=x-1
    print("")
    
#The following lines will demonstrate the second part of the assignment
    for y in range (3,31,3):
        print(y, end=" ")
    print("")

# The following lines will count down evenly from even numbers
    Z = int(input("type an even number to count down from: "))

    while Z % 2 !=0:
        print("Thats not an even number, try again:")
        Z = int(input("type an even number: "))

    else:
        for Z in range (Z,-2,-2):
            print(Z, end=" ")
    print("")
    
# This final program will count from one input to another in only odd numbers
    A,B = eval(input("give a number range, seperated by a comma EX: 3,9 -  "))

    while A % 2 != 1 and B % 2 != 1 or A <= 0 or B <= 0 or A>B:
        print("Inacurate calculation, try again \n Avoid using zero and start with a small number to build up to a big number")
        A,B = eval(input("give a number range, seperated by a comma EX: 1,7 -  "))

    else:
        for A in range(A,B+1,2):
            print(A, end=" ")

    
NahonLoops()




