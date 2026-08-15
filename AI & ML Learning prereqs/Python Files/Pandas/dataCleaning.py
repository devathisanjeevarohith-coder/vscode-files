import pandas as pd

# Data Cleaning =   the process of fixing/removing:
                #   incomplete, incorrect, or irrelevant data.
                #   ~75% of work done with Pandas is data cleaning


df = pd.read_csv("c:\\Users\\devat\\OneDrive\\Desktop\\VScode files\\AI & ML Learning prereqs\\Python Files\\Pandas\\data.csv")

# 1. Drop irrelevant columns
df = df.drop(columns = ["total", "id"])

# 2. Handle missing data
df = df.dropna(subset = ["hp"])     
# Since there are no missing values in any row of the data, it wont drop the entire row

df =  df.fillna({"hp" : " None "})      # to replace any missing values


# 3. Fix inconsistent values
df["type"] = df["type"].replace({"Grass" : "GRASS", 
                                 "Fire" : "FIRE"})


# 4. Standardize text
df["name"] = df["name"].str.lower()



# 5. Fix Data Types
# We do this if you have 0/1 in your columns values
# I  dont have so I wnot do
# df["Legendry"] = df["Legendry"].astype(bool)
# Above statement if we had Legendry column


# 6. Remove Dulpicate values
# df = df.drop_duplicates()
# Above statement to remmove duplicates


print(df)

