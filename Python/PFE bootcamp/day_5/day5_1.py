
number=0
total=0


game_on=True

while game_on:
    x= input("Please insert a number: ")
    if x=="done":
        break
    
    try: 
        fx=float(x)
    except:
        print("Invalid input!!!")

    number = number+1
    total=total+fx

print("All done")
print(f"The total is: {total} the count is {number}, and the average is {total/number}")
   
    
    