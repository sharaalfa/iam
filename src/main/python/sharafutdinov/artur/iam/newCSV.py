import os
import pandas

data = pandas.read_csv('/home/first/Pictures/snils_04_2017_trud.csv')

data = pandas.DataFrame({'06592381488': data[u'065-923-814 88'].values})

print data.describe()
try:
    os.remove('/home/first/042017trud_2.csv')
except:
    pass
with open('/home/first/042017trud_2.csv', 'a') as f:
    f.write('06592381488')

for i in range(0, 3695580):
    snils = data['06592381488'].loc[i]
    f = open('/home/first/042017trud_2.csv', 'a')
    f.write('\n' + (str(snils).replace("-", "")).replace(" ", ""))
    f.close()
    print i