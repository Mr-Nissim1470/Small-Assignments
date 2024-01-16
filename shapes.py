
import math

class shapes:

    def __init__(self,clr,filled):
        self.__color = clr
        self.__transparent = filled

    def get_color(self):
        return self.__color

    def is_transparent(self):
        return self.__transparent

    def set_color(self,cl):
        self.__color = cl

    def set_transparent(self,T):
        self.__transparent = T
        
    def calc_area(self):
        return 0
    
    def __str__(self):
        shapesstring=""
        shapesstring+= "Shape has a color of: " + self.__color+" and transparenct: "+str(self.__transparent)+"\n"
        return shapesstring

class Rectangle(shapes):
    def __init__(self,clr,filled,leng,wid):
        shapes.__init__(self,clr,filled)
        self.__length = leng
        self.__width = wid

    def get_length(self):
        returnself.__length

    def get_width(self):
        return self.__width

    def set_length(self,lng):
        self.__lenght = lng

    def set_width(self,w):
        self.__width = w

    #operations

    def CalcArea(self):
        return(self.__length*self.__width)

    def CalcPeri(self):
        return(2*(self.__length+self.__width))

    def __str__(self):

        str1 = shapes.__str__(self)
        str1+= "length: "+str(self.__length)+"\n"
        str1+= "width: "+str(self.__width)+"\n"

        return str1

class Circle(shapes):
    def __init__(self,clr,filled,rad):
        shapes.__init__(self,clr,filled)
        self.__radius = rad

    def get_radius(self):
        return self.__radius

    def set_radius(self,ra):
        self.__radius = ra

    def CalcArea(self):
        area = math.pi*self.__radius**2
        return area
    
    def CalPeri(self):
        peri = 2*math.pi*self.__radius
        return peri

    def __str__(self):
        str1 = shapes.__str__(self)
        str1+= "Radius: " + str(self.__radius)+"\n"

        return str1
            
        
