import matplotlib.pyplot as mp
import numpy as np


# Histogram = A visulal representation of the distribution of quantitative data.
#             They group values into bins (intervals)
#             and counts how many fall in each range


scores = np.random.normal(loc = 80, scale = 10, size = 100)
scores = np.clip(scores, 0, 100)

mp.hist(scores, bins = 20, color = "lightgreen", edgecolor = "black")

mp.title("Exam Scores")
mp.xlabel("Score")
mp.ylabel("No of Students")


mp.show()