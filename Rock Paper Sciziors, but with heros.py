# Yosef Nahon
# Hero RPS program
# Model 1



def RPS_Heros():

    AuquaMan = "Auqua Man"
    TheHumanTorch = "Human Torch"
    SwampThing = "Swamp Thing" 

    def YourPick():
        PlayerPick = str(input("Pick your Hero:\n -Auqua Man \n -Human Torch \n -Swamp Thing \n "))

        while PlayerPick[0] != "A" and PlayerPick[0] != "a" and PlayerPick[0] != "H" and PlayerPick[0] != "h" and PlayerPick[0] != "S" and PlayerPick[0] != "s":

            print("Not a valid input. Please put in only one of the listed inputs (don't start with a space)")
            PlayerPick = input("Pick a Hero: \n -Auqua Man \n -Human Torch \n -Swamp Thing \n ")

        else:

            if PlayerPick[0] == "A" or PlayerPick[0] == "a":
                PlayerPick = AuquaMan

            elif PlayerPick[0] == "H" or PlayerPick[0] == "h":
                PlayerPick = TheHumanTorch

            elif PlayerPick[0] == "S" or PlayerPick[0] == "s":
                PlayerPick = SwampThing

            print("You chose ",PlayerPick)
            
        return PlayerPick

    def OponentPick():

        import random
        
        FO = random.randrange(100,400,100)

        if FO == 100:
            FO = AuquaMan

        elif FO == 200:
            FO = TheHumanTorch

        elif FO == 300:
            FO = SwampThing

        print("The CPU chose ", FO)

        return FO


    def Decision():

        P1 = YourPick()

        CPU = OponentPick()

        if P1 == AuquaMan and CPU == TheHumanTorch: 
            print("Aqua Man extinguished the Human Torch, You Win")
            print("Thanks for Playing")

        elif P1 == TheHumanTorch and CPU == SwampThing:
            print("The Human Torch burned Swamp Thing, You Win")
            print("Thanks for Playing")

        elif P1 == SwampThing and CPU == AuquaMan:
            print("Swamp Thing Drowned Aqua Man, You Win")
            print("Thanks for Playing")

        elif P1 == TheHumanTorch and CPU == AuquaMan:
            print("Aqua Man extinguished the Human Torch, You Lose")
            print("Thanks for Playing")

        elif P1 == SwampThing and CPU == TheHumanTorch:
            print("The Human Torch burned Swamp Thing, You Lose")
            print("Thanks for Playing")

        elif P1 == AuquaMan and CPU == SwampThing:
            print("Swamp Thing Drowned Aqua Man, You Lose")
            print("Thanks for Playing")
            
        else:
            print("You tied with the CPU. \n Play again to try and win")
            
            RPS_Heros()

            
    
    #YourPick()
    #OponentPick()
    Decision()
    
    
    
RPS_Heros()
