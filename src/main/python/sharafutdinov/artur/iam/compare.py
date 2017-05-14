import pandas

data = pandas.read_csv('amount.csv')
data1 = pandas.read_csv('amount.csv')

data = pandas.DataFrame({'8243': data['8243'].values})
data1 = pandas.DataFrame({'8243': data1['8243'].values})

for i in range(1, 162):
    for j in range(1, 315):
        if data['8243'].loc[i] == data1['8243'].loc[j]:
            print data['8243'].loc[i], j, i

