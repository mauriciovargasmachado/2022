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
        
        count=dictionary.get(word,0)
        
        if word in dictionary:
            count+count+1

            print(count)
        
        