#main test
import Final_Python
List = []
def recite():

    Pat = Final_Python.Person("Patrick","Nahon","147","Is a friend to the end!")
    List.append(Pat)
    Me = Final_Python.Person("Yosef","Nahon","21","is a pretty cool guy")
    List.append(Me)
    Ava = Final_Python.Person("Ava","Russo","19","...")
    List.append(Ava)
    Seri = Final_Python.Person("Serenity","Payne","19","wannabe girlfriend")
    List.append(Seri)

    Ava.SetFact("Cant help but crush over")    
    
    for N in List:
        print(N)
recite()
