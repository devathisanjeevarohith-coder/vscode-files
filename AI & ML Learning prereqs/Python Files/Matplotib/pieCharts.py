import matplotlib.pyplot as mp
import numpy as np


# Pie Chart =   Circular chart divided into slices to show percentages of the total
#               Good for visualizing distribution among categories


categories = ["Freshmen", "Sophomores", "Juniors", "Seniors"]
values = np.array([300,250,275,225])
colors = ["red", "blue", "green", "orange"]


mp.pie(values, labels = categories, autopct='%1.1f%%', colors = colors,
                                explode = [0,0,0,0.2], shadow = True,
                                startangle = 180)
mp.title("College")

mp.show()