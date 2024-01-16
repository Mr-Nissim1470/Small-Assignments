

class Fish:

    def __init__(self,tp,wt,ln,ppp):
        self.__kind = tp
        self.__weight = wt
        self.__length = ln
        self.__P = ppp
        self.__typ = "SeaFish"


    def get_kind(self):
        return self.__kind

    def get_weight(self):
        return self.__weight

    def get_len(self):
        return self.__length

    def get_type(self):
        return self.__typ

    def setname(self,nm):
        self.__name = nm

    def setweight(self,w):
        self.__weight = w

    def setlength(self,lng):
        self.__length = lng

    def settyp(self,tp):
        self.__typ = tp

    def calp(self,ppp):
        price = self.__weight*self.__length*self.__P
        return price
        
