import numpy as np

# WE LEARN SLICING
 
array = np.array([[1,2,3,4],
                 [5,6,7,8],
                 [9,10,11,12],
                 [13,14,15,16]])

#   array[start:end:step]
#   We can use negative indexing
# '0' is exclusive and Ending Index is Exclusive

# print(array[0:3])
# print(array[1:4])

print(array[0:4:2])    # Here we Skipped 2 row
print(array[::2])      # An alternative representation FOR above print statement

print(array[::-1])  # It will print the array rows in reverse order
print(array[::-2])  # Skips the 2nd row from the last and print in reverse

# COLUMN SELECTION n above is ROW SELECTION
# COLUMN SELECTION
print("Column : ",array[:,0])   # ' :, ' represents all rows --> means in all rows
print(array[:,-1])      # It returns last column
print(array[:,0:3])     # It means in all rows, start from 0 index column to 2 index column
                        # The end is exclusive of Zero ---> NOTE This point

print(array[:,1:4])
print(array[:, ::2])
print(array[:, 1::2])
print(array[:, ::-1])   # To print the columns in reverse

# COMBINE BOTH ROW AND COLUMN SELECTION
print(array[0:2, 0:2])
print(array[0:2, 2:4])  # we can omit the number 4
print(array[2:4, 0:2])  # we can omit the number 4
print(array[2: , 2: ])  # we can put 4 in the empty spaces

