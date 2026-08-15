import numpy as np

###
#   Broadcasting allows Numpy to perform operations on arrays
#   with different shapes by virtually expanding dimensions
#   so they match the larger array's shape
# 
#   We read them right to left.
#
#   The dimensions have the same size.
#   OR
#   One of the dimensions has the size of 1.
###

array1 = np.array([[1,2,3,4], [5,6,7,8],
                   [9,10,11,12], [13,14,15,16]])
array2 = np.array([[1],[2],[3],[4]])

print(array1.shape)
print(array2.shape)

print(array1 * array2)

# An additional Excercise

arr = np.array([[1,2,3,4,5,6,7,8,9,10]])
arr2 = np.array([[1],[2],[3],[4],[5],[6],[7],[8],[9],[10]])

print(arr.shape)
print(arr2.shape)
# They are broadcastable
print(arr * arr2)


