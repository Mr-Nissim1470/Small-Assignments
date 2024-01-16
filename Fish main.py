#Fish main

'''
First - 1 mahimahi that weighs 3 pounds is 6  inches and has a ppp of 3 dollars
second - 9 inch salmon weighing 5 pounds and a ppp of 2.1
print each fish details and compare teh 2 to see which is more expensive 
'''
import FishClass

def main(Name,Weight,Length,PricePerPound):
    Fish = FishClass.Fish(Name,Weight,Length,PricePerPound)

    N = str(Fish.get_kind())
    
    print("Fish: ", Fish.get_kind())

    print("Weight: ", Fish.get_weight())

    print("Length: ", Fish.get_len(),"in")

    P = Fish.calp(PricePerPound)
    
    print("Price Per Pound: $",P )

    print(" ")

    

    return P,N
    
if __name__== "__main__":

    main("MahiMahi",3,6,3)

    main("Salmon",5,9,2.1)



'''
    MahiMahi,NM= main("MahiMahi",3,6,3)

    Salmon,NS = main("Salmon",5,9,2.1)

def Compare(X,Z,Y,O):
    if X > Y:
        print(O,"is the beter choice to buy")
    if X < Y:
        print(Z,"is the beter choice to buy")

    else:
        print("Neither differ in their price \n Buy what you'd like")
    
Compare(MahiMahi,NM,Salmon,NS)
'''
