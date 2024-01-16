

import os

def FileReWrite(File):
    print("Checking ",str(File))
    Document = open(File,"r")
    Line = Document.readline()

    while Line != "":
        List = []
        
        Line = Line.rstrip("\n")
        print("Reading: \n",Line)

        Words = Line.strip(" ")
        for Words in Line:
            STR = ""
            for n in Words:
                
                STR+= n
            List.append(STR)
                
        print(List[0]," is ",List[1]," Shaped \n") 
        Line = Document.readline()
    print("---Process Completed---")
    Document.close()
    A.close()
    
FileReWrite("YosefShape.txt")


'''
class Song:

    def __init__(self,O,Det):
        self.1 = O
        self.D = Det
        self.D = " is a good song"
        

    def __str__(self):
        P = str(self.1)+ "has qualities like " + str(self.D)

    
def Main():
    S1 = LQ.Song(self,O,Det)
'''
