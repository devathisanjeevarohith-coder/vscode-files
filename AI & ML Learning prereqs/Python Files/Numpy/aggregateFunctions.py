import numpy as np

#   Aggregate Functions :   summarize data and typically
#                           return a single value

array = np.array([[1,2,3,4,5], [6,7,8,9,10]])

print(np.sum(array))
print(np.mean(array))


#statistics functions
print(np.std(array))
print(np.var(array))

print(np.min(array))
print(np.max(array))

print(np.argmin(array))
print(np.argmax(array))


# SUM of columns
print(np.sum(array, axis =0))   # Summing all columns'


# SUM of rows
print(np.sum(array, axis = 1))  # Summinng of all rows



