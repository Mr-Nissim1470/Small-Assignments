
Phrase = str(input("Give a string "))

numbers = 0
Cletters = 0
Lletters = 0
other = 0
space = 0

for l in Phrase:
    if l == " ":
        space+=1 
    if l.isdigit():
        numbers+=1
    if l.isupper():
        Cletters+=1
    if l.islower():
        Lletters+=1
    else:
        other+=1

print("This statement has: ")
print(numbers,"Digits")
print(Cletters," Capital lettes")
print(Lletters," Lower case letters")
print("And ",other," special characters")
print("(and ",space," spaces)")

number = input("Fill in a number and format it as such: ###-###-####")

Nnumber = number.replace("-","")

print("proceding to dial ",Nnumber)
