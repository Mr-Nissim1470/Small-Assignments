#YosefNahon Ultrasum program Modle1 9/9/2020
#This Program will take an imput and add up the range of numbers it produces


def UltraSum():

    rebound = 0

    Pick = int(input("What number shall we add the range values of?"))

    for Pick in range(1,Pick+1):
        rebound = rebound + Pick

    print ("The final sum to all the values of ",Pick,"is",rebound)

UltraSum()
