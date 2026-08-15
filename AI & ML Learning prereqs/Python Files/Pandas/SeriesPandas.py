import pandas as pd

# print(pd.__version__)     To check the version of the 'pandas'

# Series  =  A Pandas 1-Dimensional labled array that can hold any data type 
#            Think of it like a single column in a spreadsheet ( 1 - Dimensional )
# 
# The index should be same size of the data we pass in

data = [100,102,104]
data1 = [101.1,102.3,108.9]
data2 = ["A", "B", "c"]
data3 = [ True, False, True ]

series = pd.Series(data)
series1 = pd.Series(data1)
series2 = pd.Series(data2)
series3 = pd.Series(data3)

print(series)
print(series1)
print(series2)
print(series3)


ser = pd.Series(data, index = ["A", "B", "C"])
ser1 = pd.Series(data, index = ["Apartment #1", "Apartment #2", "Apartment #3"])
print(ser)
print(ser1)

# loc --> Location By Label
print(ser.loc["A"]) #  Returns the value stored at a particcular label
print(ser.loc["B"])

ser.loc["C"] = 200      # Changed the original value
print(ser.loc["C"])

print(ser.iloc[0])      # iloc is called as integer loc, which returns the value at the poisition of the integer we pass
                        # starts from '0' --> similar to index's in arrays

Data = [100,102,104,200,202]
seri = pd.Series(Data, index = ["a","b","c","d","e"])
print(seri[seri >= 200])    # It is for filtering
print(seri[seri <= 200])