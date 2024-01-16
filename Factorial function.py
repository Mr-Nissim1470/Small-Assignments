# factorial

def main():
    num = int(input("posotive intiger: "))

    result = factorial(num)

    print(result," is the factorial of ",num)

def factorial(n):

    if n == 0:
        return 1
    else:
        return n*factorial(n-1)

# Fibonachi
def main1():
    num = int(input("posotive intiger: "))

    result2 = fibonachi(num)
    
    print(result2)


def fibonachi(n):

    if n == 0:
        return 0
    if n== 1:
        return 1
    else:
        return fibonachi(n-1) + fibonachi(n-2)

    
main()
main1()
