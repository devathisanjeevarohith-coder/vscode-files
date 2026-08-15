import matplotlib.pyplot as mp
import numpy as np


# Scatter Graphs = Shows the relationship between two variables
#                  Helps to identify a co-relation ( +, -, None )
#                  Example : Study Hours vs Test Scores


x = np.array([0,1,1,2,3,4,5,6,7,7,8,9])   # Hours
y = np.array([55,63,87,64,94,65,25,56,70,56,34,38])   # Marks or Grades

x1 = np.array([0,1,2,2,3,4,5,6,7,8,8])
y1 = np.array([50,58,65,70,72,78,83,88,92,95,97])


# We use 'c' instead of "color"
mp.scatter(x,y, c = "skyblue", alpha = 0.5, s = 100, label = "Class A")
mp.scatter(x1,y1, c = "salmon", alpha = 0.5, s = 100, label = "Class B")

mp.title("Test Results", size = 20)
mp.xlabel("Hours Studied", size = 15)
mp.ylabel("Marks", size = 15)


mp.legend(fontsize = 10, framealpha = 0.4)
mp.show()