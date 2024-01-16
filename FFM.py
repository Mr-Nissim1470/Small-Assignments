

import Final

def main():

    C1 = Final.Course("CSIS1470","My calss",10)

    print(C1)
    print(C1.GCN())



    iFile = open("Final.txt","r")

    line = iFile.readline()

    while line != "":
        print(line)
        line = line.rstrip("\n")
        Items = line.split(" ")
        CoNu = Items[0]
        Name = Items[1]
        Creds = int(Items[2])
        C = Final.Course(CoNu,Name,Creds)
        print(C)

        line = iFile.readline()
    print("scan complete")

    iFile.close()
main()
