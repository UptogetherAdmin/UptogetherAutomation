import pandas as pd
from pandas import ExcelWriter
from pandas import ExcelFile

df = pd.read_excel('WRDP_Report Automation (Do Not Touch)_Proposal 1.xlsx', sheet_name='By Line Item')
f = open("result.txt",'a')


for i in range(len(df.columns)):
        f.write("Assert.assertEquals(arrayList5.get(0).get(%s).get(0).get(0),\"%s\")"% (df.columns[i], df[df.columns[i]][0]))
        f.write("\n")
        f.write("Assert.assertEquals(arrayList5.get(0).get(%s).get(0).get(1),\"%s\")" % (
        df.columns[i], df[df.columns[i]][1]))
        f.write("\n")
f.close()
