import matplotlib.pyplot as mp
import numpy as np


x = np.array([2023,2024,2025,2026])
y1 = np.array([15,25,35,50])
y2 = np.array([10,20,30,40])
y3 = np.array([12,15,17,18])


# WE could also have just copy paste the same details in the other 3 y-axis co ordinates

line_style = dict(marker = "." ,
             markersize = 15,
             markerfacecolor = "#10E8E8",    # we could also use names like "cyan"  or "red"
             markeredgecolor = "Red",
             linestyle = "solid",           # we could also use dashed, dotted, dashdot and None(refers to noline)
             linewidth = 4,
             )

# we can use 'ms' instead of markersize
# we can use 'mfc' instead of markerfacecolor
# we can use 'mec' instead of markeredgecolor

mp.plot(x,y1,color = "black", **line_style)   
mp.plot(x,y2,color = "green",**line_style)
mp.plot(x,y3,color = "grey",**line_style)

mp.show()




