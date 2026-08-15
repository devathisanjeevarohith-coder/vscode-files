import pandas as pd

#  Converting dictionary into a DataFrame

data = {"Name" : ["Spongebob", "Patrick", "Squidward"],
        "Age" : [30,35,50]
        }

df = pd.DataFrame(data, index = ["Employee 1", "Employee 2", "Employee 3"])

print(df)

# To access a single row, we can use 'loc' and 'iloc'
print(df.loc["Employee 2"])
print(df.iloc[2])

# To add a new Column
df["Job"] = ["Cook", "N/A", "Cashier"]
print(df)

# Add a new Row
new_row = pd.DataFrame([{"Name" : "Sandy", "Age" : 28, "Job": "Engineer"}], index = ["Employee 4"])
df = pd.concat([df,new_row])
print(df)

# We can add new Rows by increasing the lists
new_rows = pd.DataFrame([{"Name" : "Mai", "Age" : 28, "Job": "Doctor"},
                         {"Name" : "Eugene", "Age" : 34, "Job" : "Manager"}], index = ["Employee 5", "Employee 6"])

df = pd.concat([df,new_rows])
print(df)


