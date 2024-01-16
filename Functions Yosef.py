# Yosef Nahon
# Assignment 8
# Model 1

def YosefList():
    
    List = []
    PList = []
    CopyList = []

    def Present(PL,AR,AS,AA,AM,CL,L):
        print("-----Fianl Results-----")
        print("Your starting list is ", PL)
        print("The Range of the list is ",AR)
        print("The sum of the list is ",AS)
        print("The average of the list is ",AA)
        print("The Median of the list is ",AM)
        print("The clipped list using the number",CL,"is ",L)
    
    A = int(input("How many numbers will we be working with?"))
    
    while A <= 0:
        
        if A == 0:
            print("You have an empty list \n There's nothing to calculate")

        elif A < 0:
            print("That doesn't amount ot anything \n There is nothing to calculate")

        YorN = input("Would you like to re-input your list amount? ")
    
        while YorN[0] != "Y" and YorN[0] != "y" and YorN[0] != "N" and YorN[0] != "n":

            print("Only YES or NO please")

            YorN = input("Would you like to re-input your list amount? (Yes/No) ")
            
        else:

            if YorN[0] == "Y" or YorN[0] == "y":
                A = int(input("How many numbers will we be working with?"))

            elif YorN[0] == "N" or YorN[0] == "n":

                if A < 0:
                    print("Nothing is able to be calculated the program will close")
                    exit()

                else:
                    Present(A,A,A,A,A,A,A)
                    print("-----Calculation Complete-----")
                    exit()

        
    

    print("You'll procede to input ",A," number(s)")
        
    def NumberUp():
        for N in range(0,A):
            Num = float(input("input a number "))
            List.append(Num)

        List.sort()
        
        print("Your list is",List)
        
    
    def RangeList(List):
        
        Range = max(List)-min(List)

        return Range

    

    def SumList(List):
        total = 0
        for X in List:
            total+= X

        if total == sum(List):
            return total

        else:
            print("there's a problem")

    

    def Average(List):
        Av = ASum/len(List)
        return Av

    

    def Median(CopyList):
        CopyList.sort()
        if len(CopyList) < 3:

            if len(CopyList) == 1:

                Middle = "NA"

            if len(CopyList) == 2:

                Middle = sum(CopyList)/2
        
        elif len(CopyList)%2 == 1:

            Med = (len(CopyList)//2)+1

            Middle = CopyList[Med]
            
        else:
            
            Med = int(len(CopyList)/2)

            Mid1 = CopyList[Med]
            Mid2 = CopyList[Med+1]

            Middle = (Mid1+Mid2)/2
        
        return Middle

    

    
    def Haircut(List):
        clip = int(input("Provide a number to clip "))
        while clip < 0:
            print("Positive numbers only")
            clip = int(input("Provide a POSITIVE number to clip "))

        else:
            for Number in range(0,A):
                if List[Number]>clip:
                    List[Number] = clip
                
                else:
                    continue
        return clip
        
        
    NumberUp()
    PList+= List
    CopyList+= List
    ARange = RangeList(List)
    ASum = SumList(List)
    AAverage = Average(List)
    AMedian = Median(List)
    Clipped = Haircut(List)
    
    Present(PList,ARange,ASum,AAverage,AMedian,Clipped,List)

    print("-----Calculation Complete-----")

    Q = input("Quit?")
    if Q[0] == "Y" or Q[0] == "y":
            exit()
    else:
        print("Fine, stay as long as youd like")

                
YosefList()
