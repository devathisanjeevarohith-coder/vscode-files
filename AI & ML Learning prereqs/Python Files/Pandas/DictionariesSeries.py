import pandas as pd

calories = { "Day 1" : 1750, "Day 2" : 2001, "Day 3" : 1700}

series = pd.Series(calories)

print(series)   # We dont need to input the index this way

series.iloc[2] = 500    # Used iloc instead of loc
series.loc["Day 3"] = 740   # Used loc to locate the value of the key of "Day 3"

print(series)

# Let's Filter by value
print(series[series >= 1000])
print(series[series > 2500])    # does not return a digit or value since there is no value that satisfies the conditon
                                # returns a empty set of braces ( square braces )
