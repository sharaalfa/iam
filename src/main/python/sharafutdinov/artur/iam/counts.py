import CSV
func = CSV.Producer()
func.removeCSV('amount.csv')
for i in range(1, 318):
    amount = func.getCount('/home/first/pfr/', i)
    if amount == 0:
        print i
    else:
        func.writeCSV2('amount.csv', amount)

