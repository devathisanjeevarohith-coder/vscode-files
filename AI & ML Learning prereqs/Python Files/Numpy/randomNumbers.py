import numpy as np

rng = np.random.default_rng();
# can also be written as
# rng = np.random.default_rang(seed = 1)

# The SECOND number is exclusive
print(rng.integers(low = 1, high = 101, size = (3,2)))
print(rng.integers(low = 1, high = 50, size = 5))

# Floating point Numbers

np.random.seed(seed = 1)
print(np.random.uniform(low = -1, high = 1, size = 4))  # By uniform it wont repeat the same number


#To shuffle the numbers in av array
array = np.array([1,2,3,4,5])
rng.shuffle(array)
print("Shuffle : ",array)

fruits = np.array(["Apple", "Orange", "Banana", "Pineapple", "Coconut"])
fruits = rng.choice(fruits, size =2)
fruits = rng.choice(fruits, size = (3,2) )
fruit  = rng.choice(fruits)
print(fruit)
print(fruits)