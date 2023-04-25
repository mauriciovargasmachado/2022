
def es_divisible(n,d):

    if n%(2*d)==0: 
        return 2
    elif (n % d ==0):
        return 1
    else:
        return 0
    
print(es_divisible(int(input("number 1: ")),int(input("number 2: "))))
