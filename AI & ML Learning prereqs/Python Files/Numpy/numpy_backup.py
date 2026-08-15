import numpy as np

#print(np.__version__)
#Python list
my_list = [1,2,3,4,5]
my_list *= 2
print(my_list)

array = np.array([1,2,3,4,5])
array *= 2
print(array)
#print(type(array))  --> Shows the type 

# Multi dimensional Array
# One dimensional Array
array1 = np.array(['A', 'B', 'C'])
print(array1)
print(array1.ndim)

# Two Dimensional Array
array2 = np.array([[1,2,3,4],
                   [5,6,7,8],
                   [9,10,11,12]])
print(array2)
print(array2.ndim)

#Three Dimensional Array
array3 = np.array([[['A','B','C'], ['D', 'E', 'F'], ['G','H','I']],
                   [['J','K','L'], ['M', 'N', 'O'], ['P','Q','R']],
                   [['S','T','U'], ['V', 'W', 'X'], ['Y','Z', ' ']]])
# Must have sequence, and consistent no of elements in the lists
print(array3.ndim)  #Gives Number: 3 ---> REFER to Three Dimensional Array
print(array3.shape)
print(array3[0,2,2])    #Multi Dimensional Indexing

word = array3[1,2,2] + array3[1,1,2] + array3[0,2,1] + array3[0,2,2] + array3[2,0,1] + array3[0,2,1]
print(word)