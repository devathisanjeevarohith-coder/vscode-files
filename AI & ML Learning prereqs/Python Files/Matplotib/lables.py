import matplotlib.pyplot as mp
import numpy as np

x = np.array([2023,2024,2025,2026])
y1 = np.array([15,25,35,50])
y2 = np.array([10,20,30,40])
y3 = np.array([12,15,17,18])


mp.title("Class Size", fontsize = 20,
                        family = "Arial",
                        fontweight = "bold",
                        color = "black")

mp.xlabel("Year" , fontsize = 20, family ="Arial",
                        color = "Grey", fontweight = "bold")

mp.ylabel("Size of the class (Students)", fontsize = 20, family = "Arial", 
                        color = "#816767", fontweight = "bold")


mp.tick_params(axis = "both", colors = "Green")

mp.plot(x,y1, marker = ".")
mp.plot(x,y2, marker = ".")
mp.plot(x,y3, marker = ".")

mp.xticks(x)


mp.show()




