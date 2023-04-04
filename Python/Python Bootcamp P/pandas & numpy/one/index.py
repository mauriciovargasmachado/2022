import numpy as np

list = [1,2,3,4,5,6,7,8,9,10]

variable_1 = np.array(list)

print(list)
print(variable_1)
print(type(variable_1))

mat = [[1,2,3],[4,5,6],[7,8,9]]
mat = np.array(mat)

print(mat)
print(mat[0,0])
print(mat[0,0:2])
print(mat[-1])
print(mat[0:,1:2])
print(mat[1:,1:2])
print(mat[2:,1:2])