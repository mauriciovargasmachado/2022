user_input=input("Enter the file name: ")

if len(user_input)<1:
    print("file cant be found!!!")

file=open(user_input)

dictionary=dict()


for line in file:
    single_line=line.rstrip()

    words=single_line.split()

    for word in words:
        if word in dictionary:
            dictionary[word]=dictionary[word]+1
        else:
            dictionary[word]=1
           
print(dictionary)

#x=sorted(dictionary.items())
#print(x[:10])

temporal= list()

for a,b in dictionary.items():
#    print(a,b)
    new=(b,a)
    temporal.append(new)

print(temporal)
