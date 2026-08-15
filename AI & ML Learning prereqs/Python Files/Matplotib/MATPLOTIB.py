import matplotlib.pyplot as mp
import numpy as np

# Numpy arrays are faster than pyhton lists

# Pyplot = It provides a User friendly interface for plotting. Its in matplotib

# print(mp.__version__) --- > Gives version info

x = np.array([2023,2024,2025,2026])
y = np.array([15,25,35,50])


mp.plot(x,y)
mp.show()