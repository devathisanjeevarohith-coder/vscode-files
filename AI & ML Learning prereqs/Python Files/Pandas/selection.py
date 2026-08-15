import pandas as pd

df = pd.read_csv("data.csv", index_col = "name")

# Selection by Column

# print(df["name"].to_string())
# print(df["type"])
# print(df["hp"])
print(df[["type", "hp"]])   # If the data is large you can use '.tostring()' function


# Selection by Rows

print(df.loc["Pikachu"])
# print(df.iloc["name"])
print(df.loc["Charizard" : "Blastoise" , ["hp", "attack"]])

print(df.iloc[0:11])
print(df.iloc[0:11:2, 0:3])     # WE can also choose hoe many colums to print

pokemon = input("Enter a pokemon Name : ")
try:
    print(df.loc[pokemon])
except KeyError:
    print("Error. Not Found. Try Again!! ")

