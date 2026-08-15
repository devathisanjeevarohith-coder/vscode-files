import pandas as pd

df = pd.read_csv("data.csv")

# Filtering =  Keeping the rows that match a condition

print(df)

attack_pow = df[df["attack"]> 90]
speed = df[df["speed"] > 90]
total_pow = df[df["total"] > 500]
water_poke = df[df["type"] == "Water"]      
# We can also use logical operators for conditioning annd filtering
# If we are goinng to use the logical operators, make sure to put brackets at the condition


print(water_poke)