import pandas as pd

# Aggregate Functions = Reduces a set of values into a single summary value
                    #  Used to summarize and analyze data
                    #  Often used with the groupby() function


df = pd.read_csv("c:\\Users\\devat\\OneDrive\\Desktop\\VScode files\\AI & ML Learning prereqs\\Python Files\\Pandas\\data.csv")

# Apply to Whole Data Frame
print("Avg : \n",df.mean(numeric_only = True))
print("Sum of all: \n",df.sum(numeric_only = True))
print("Min : \n", df.min(numeric_only = True))
print("Max : \n", df.max(numeric_only = True))
print(df.count())


# Single Column
print("Avg : \n",df[["hp", "attack"]].mean)
print("Sum of all: \n",df["defense"].sum)
print("Min : \n", df["speed"].min)
print("Max : \n", df["speed"].max)
print("Count: " ,df["type"].count())


#  Grouping by Type
group = df.groupby("type")
print(group["attack"].mean())
print(group["defense"].min())
print(group["attack"].max())
print(group["hp"].count())
