

class Flight:
    def __init__(self,Airline,Number,FromTo,time):
        self.A = Airline
        self.__N = Number
        self.Path = FromTo
        self.T = time

    def GetNUM(self):
        return self.__N
        
    def SetTerm(self,Var):
        self.T = Var
        return self.T

    def __str__(self):
        string = ""
        string+= "Flight "+self.A+" Number "+self.__N+" Flies From "+self.Path+" in "+self.T+ " Minutes"
        return string
