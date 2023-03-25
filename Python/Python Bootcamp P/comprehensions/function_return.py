
def addition (a,b): 

    sum = 0 

    for i in range (a,b):
        sum += i

    return sum

result_1 = addition(0,100)
result_2 = addition(100,result_1)
result_3 = addition(result_1,result_2)

print(result_1,result_2,result_3)



    