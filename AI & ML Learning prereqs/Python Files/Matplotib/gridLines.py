import matplotlib.pyplot as mp


# grid()  = Helps make plots easier to read by adding reference lines



x = [1,2,3,4,5]
y = [5,10,15,20,25]


mp.grid( axis = "y" , linewidth = 2, color = "lightblue", linestyle = "dashed")


mp.plot(x, y)
mp.grid(True)
mp.show()
