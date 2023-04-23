

x1 = int(input("Please type a value fox x1: "))

x2 = int(input("Please type a value fox x2: "))

x3 = int(input("Please type a value fox x3: "))

temporal = x1

x1 = x3

x3 = x2

x2 = temporal

print(f'The numbers you have selected are: {x2},{x3},{x1}')