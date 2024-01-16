#Yosef AgeCheck model 1
#This program will check if you are able to ride this rollercoaster


def AgeCheck():
    Age = eval(input("What is your age?"))

    if Age < 60 and Age > 7:
        print ("you are eligable to ride")

    else:
        if Age<=7:
            print("You are too young to ride")

        elif Age>=60:
            print("you are too old to ride")


        else:
            print("Bru are you an alien or something?")
        
