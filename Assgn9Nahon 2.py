# Yosef Nahon
# Assignment 9
# Model 1



def yNReplace():

    Ostring = input("Provide a string to manipulate: ")
    print(Ostring)
    portion = input("what portion of the string are we looking for?: ")
    print("\"",portion,"\"")
    NewPiece = input("what should the replavement be for the portion above?: ")
    print("Replacing ","\"",portion,"\" with \"",NewPiece,"\"")

    A = -1

    breaks = Ostring.count(portion)

    NString = Ostring.split(portion)

    num = 0
    for p in range(1,breaks+1):
        if p == breaks:
            NString.insert(p+num,NewPiece)
            num+=1
        else:
            
            NString.insert(p+num,portion)
            num+=1
            
    Final = "".join(NString)
        
    print("Original String: \n \t",Ostring,)

    print("New string after replacing the last ",portion," with ",NewPiece,"is: \n \t", Final)

yNReplace()

def yNNumberConverter():
    
    Number = input(str("Enter your phone number as formated (X-)(XXX-) XXX-XXXX \n "))
    Z = len(Number)
    PN = ""
    def Convert(L):
                
        if L == "A" or L == "a" or L == "B" or L == "b"or L == "C" or L == "c":
            L = 9
        if L == "D" or L == "d"  or L == "E" or L == "e" or L == "F" or L == "f":
            L = 8
        if L == "G" or L == "g" or L == "H" or L == "h" or L == "I" or L == "i":
            L = 7
        if L == "J" or L == "j" or L == "K" or L == "k" or L == "L" or L == "l":
            L = 6
        if L == "M" or L == "m" or L == "N" or L == "n" or L == "O" or L == "o":
            L = 5
        if L == "P" or L == "p" or L == "Q" or L == "q" or L == "R" or L == "r" or L == "S" or L == "s":
            L = 4
        if L == "T" or L == "t" or L == "U" or L == "u" or L == "V" or L == "v":
            L = 3
        if L == "W" or L == "w" or L == "X" or L == "x" or L == "Y" or L == "y" or L == "Z" or L == "z":
            L = 2
        else:
            L = L

        return L

    index = -1    
    for n in Number:
        if n == "-":
            continue
        else:
            index+= 1
            if Z > 10:
                if index == 1 or index == 4 or index == 7:
                    PN+="-"
            elif Z > 8:
                if index == 3 or index == 6:
                    PN+="-"
            else:
                if index == 3:
                    PN+="-"
                
            N = str(Convert(n))
            
            PN+= str(N)
            
    print(PN)

yNNumberConverter()


def yNPigLatin():

    Ophrase = input(str("Provide a sentence: \n "))

    lphrase = Ophrase.casefold()
    
    Editor = lphrase.split()

    Print = ""
    
    
    
    for W in Editor:
        Count = -1
        Z = len(W)-1
        Cap = str(W[Z])
        Print+=Cap.capitalize()
        for L in W:
            Count+=1
            NL = W[Z]
            if L == NL and Count == len(W)-1:
                continue
            else:
                Print+=str(L)
        Print+="XX "            
    print(Print)
            
yNPigLatin()



'''




        A = "A"
        a = "a"
        B = "B"
        b = "b"
        C = "C"
        c = "c"
        D = "D"
        d = "d"
        E = "E"
        e = "e"
        F = "F"
        f = "f"
        G = "G"
        H = "H"
        h = "h"
        I = "I"
        i = "i"
        J = "J"
        j = "j"
        K = "K"
        k = "k"
        L = "L"
        l = "l"
        M = "M"
        m = "m"
        N = "N"
        n = "n"
        O = "O"
        o = "o"
        P = "P"
        p = "p"
        Q = "Q"
        q = "q"
        R = "R"
        r = "r"
        S = "S"
        s = "s"
        T = "T"
        t = "t"
        U = "U"
        u = "u"
        V = "V"
        v = "v"
        W = "W"
        w = "w"
        X = "X"
        x = "x"
        Y = "Y"
        y = "y"
        Z = "Z"
        z = "z"

        "A" = "a" = "B" = "b" = "C" = "c" = 9
        "D" = "d"  = "E" = "e" = "F" = "f" = 8
        "G" = "g" = "H" = "h" = "I" = "i" = 7
        "J" = "j" = "K" = "k" = "L" = "l" = 6
        "M" = "m" = "N" = "n" = "O" = "o" = 5
        "P" = "p" = "Q" = "q" = "R" = "r" = "S" = "s" = 4
        "T" = "t" = "U" = "u" = "V" = "v" = 3
        "W" = "w" = "X" = "x" = "Y" = "y" = "Z" = "z" = 2
        
        A = a = B = b = C = c = 9
        D = d = E = e = F = f = 8
        G = g = H = h = I = i = 7
        J = j = K = k = L = l = 6
        M = m = N = n = O = o = 5
        P = p = Q = q = R = r = S = s = 4
        T = t = U = u = V = v = 3
        W = w = X = x = Y = y = Z = z = 2
        
        '''
