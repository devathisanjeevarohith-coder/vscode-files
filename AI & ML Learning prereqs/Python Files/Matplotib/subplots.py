import matplotlib.pyplot as mp
import numpy as np


# Figure  =  The entire cancvas
# Ax = A Single plot (subplot)


x = np.array([1, 2, 3, 4, 5])

figure, axes = mp.subplots(2,2)

axes[0,0].plot(x, x^2, color = "red")
axes[0, 0].set_title('x * 2')


axes[0, 1].plot(x, x**2, color='blue')
axes[0, 1].set_title('x to the power of 2')

axes[1, 0].plot(x, x**3, color='green')
axes[1, 0].set_title('x to the power of 3')


axes[1, 1].plot(x, x**4, color='purple')
axes[1, 1].set_title('x to the power of 4')

mp.tight_layout()

mp.show()