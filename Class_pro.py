#class practice


class Rectangle:

    def __init__ (self,l,w):

        self.length = l
        self.width = w

    def calarea(self):
        area = self.length * self.width
        return area

    def calcperm(self):

        per = 2*(self.length + self.width)

        return per

    def print(self):
        Str = ""

        Str+= "Length of rectangle: " + str(self.length)
        Str+= "Width of rectangle: " + str(self.width)
        print(Str)
        '''
        #access
        def getl
            return self.__length
        #mutator
        def setw
            self.__width = w
        '''
