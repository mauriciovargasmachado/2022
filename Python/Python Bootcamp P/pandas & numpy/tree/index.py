import numpy as np

scalar = np.array(1)
print(scalar)
print (scalar.ndim)
print('**********')


vector = np.array([1,2,3,4,5,6,7,8,9])
print(vector)
print (vector.ndim)
print('**********')


matrix = np.array([[1,2,3,4,5],[6,7,8,9,10],[11,12,13,14,15]])
print(matrix)
print (matrix.ndim)
print('**********')


tensor = np.array([[[1,2,3,4,5],[6,7,8,9,10],[11,12,13,14,15]],[[1,2,3,4,5],[6,7,8,9,10],[11,12,13,14,15]]])
print(tensor)
print (tensor.ndim)
print('**********')


expand = np.array([1, 2, 3], ndmin = 10)
print(expand)
print(expand.ndim)
print('**********')

expand = np.expand_dims(np.array([1, 2, 3]), axis = 0)
print(expand)
print(expand.ndim)
print('**********')

