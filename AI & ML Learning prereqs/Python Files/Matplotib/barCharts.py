import matplotlib.pyplot as mp
import numpy as np


# Bar Chart =  Compare categories of data by representing each category with a bar

# Let's create a food Chart regarding the categories

categories = np.array([ "Grains", "Fruit", "Vegetables", "Protien", "Dairy", "Sweets"])
values = np.array([4,3,2,5,3,1])


Bar = mp.bar(categories, values, color = "SkyBlue")
# Hbar =mp.barh(categories, values, color = "SkyBlue")
# Above for horizontal barchart


mp.title("Daily Consumption", size = 20)
mp.xlabel("Food", size = 15)
mp.ylabel("Quantity", size = 15)


mp.show()