import pandas as pd
from pathlib import Path

here = Path(__file__).parent
df = pd.read_csv(str(here / "Data.csv"))
df1 = pd.read_json(str(here / 'data.json.json'))

print(df1)

