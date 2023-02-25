# This program trace over a file and find an specific word in a line.


file=open('day_8.txt')

for line in file:
    single_line=line.rstrip()
    if single_line=="":
        continue
    word = single_line.split()
    if word[0] != "From":
        continue
    print(word[1])