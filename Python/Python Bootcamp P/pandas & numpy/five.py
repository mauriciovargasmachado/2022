import numpy as np

x = np.random.randint(1,10,(5,5))

print(x)

print(x.shape)

print(x.reshape(1,25))

print(x.reshape(5,5))

print(np.reshape(x,(5,5),'A'))
