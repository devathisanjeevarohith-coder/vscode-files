import numpy as np

# Scalar Arthmetic
# Scalar --> Singular algebric term --> means single simple operation

array = np.array([1,2,3])

print(array + 1)    # It increases the each element value in the array by 1
print(array - 2)    # It decreases the each element value in the array by 2
print(array * 3)    # It multiplies the each element value in the array by 3
print(array / 4)    # It divides the each element value in the array by 4
print(array ** 5)   # It raises the power of each element in the array ny 5

# Vectorized math Functions

arr = np.array([1.01 , 2.5 , 3.8])

print(np.sqrt(arr))     # to square root the elements value
print(np.round(arr))    # to round up the elements value
print(np.floor(arr))    # to round down the number or value
print(np.ceil(arr))     # ROUND Up the Number, ceil --> means ceiling

radii = np.array([1,2,3,4])

print("The area : ",np.pi * (radii ** 2))


# ELEMENT - Wise Arthmetic

array1 = np.array([1,2,3])
array2 = np.array([4,5,6])

print(array1 + array2)  # Addition
print(array1 - array2)  # Subtraction
print(array1 * array2)  # Multiplication
print(array1 / array2)  # Division
print(array1 ** array2) # Raising the element to power


# COMPARISION OPERATORS

scores = np.array([91,55,100,73,82,64])

print(scores >= 60)
print(np.where(scores >= 60, "Pass", "Fail"))

scores[scores < 60] = 0
print(scores)   # as Points

