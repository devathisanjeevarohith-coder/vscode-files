import numpy as np

# Filtering :  Refers to the process of selecting elements
#              from an array that match a given condition

ages = np.array([[21,17,19,20,16,30,18,65],
                 [39,22,15,99,18,99,20,21]])

teenagers = ages[ages < 18] # Boolean Indexing
adults = ages[(ages >= 18) & (ages < 65)]
seniors = ages[ages >= 65]
evens = ages[ages%2 == 0]
odds = ages[ages%2 != 0 ]

print("Teenagers : ",teenagers)
print("Seniors: ",seniors)
print("Adults : ",adults)
print("Even ages : ",evens)
print("Odd Ages : ",odds)

adult = np.where(ages >= 18, ages, 0)
print("Where: ", adult)
# IT changes the element outside its condition to a digit we add or fill
# We use it to preserve the original state of the data we have typed in or contained in it
