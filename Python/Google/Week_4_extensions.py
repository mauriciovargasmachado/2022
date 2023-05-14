file_counts = {"jpg":10,"txt":35,"csv":88,"py":18}

for i in file_counts:
    print(i)

for ext, amount in file_counts.items():
    print("There are {} files with the .{} extension".format(amount,ext))


cool_beasts = {"octopuses":"tentacles", "dolphins":"fins", "rhinos":"horns"}
for item,ext in cool_beasts.items():
    print("{} have {}".format(item,ext))