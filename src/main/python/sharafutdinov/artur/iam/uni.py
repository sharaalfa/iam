import os
import pandas

data = pandas.read_csv('/home/first/Documents/result/work2.csv')

data = pandas.DataFrame({'06592381488': data['065-923-814 88'].values})

#print (str(data['00508772532'][2])).replace(' ', '')

try:
    os.remove('/home/first/Documents/result/work112.csv')
except:
    pass
with open('/home/first/Documents/result/work112.csv', 'a') as f:
    f.write('06592381488,')
for i in range(1, 460701):
    n = (str(data['00508772532'][i])).replace('-', '')
    f = open('/home/first/Documents/result/work112.csv', 'a')
    f.write('\n' + str(n) + ',')
    f.close()
