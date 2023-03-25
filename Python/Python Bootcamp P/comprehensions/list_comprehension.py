'''
number =[]

for i in range(1,11):
    number.append(i)

print(number)

numbers = [i*i for i in range(1,11)]

print(numbers)
'''

number =[]

for i in range(1,11):
    if i %2 == 0:
        number.append(i)

print(number)

numbers = [i for i in range(1,11) if i %2 ==0]

print(numbers)