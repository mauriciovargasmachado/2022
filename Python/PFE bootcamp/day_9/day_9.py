#This program start with the file data.txt in the same folders.

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
            print("new")

        print(word,dictionary[word])


