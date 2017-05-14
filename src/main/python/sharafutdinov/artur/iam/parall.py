import CSV


func = CSV.Producer()
for i in range(0, 3695580, 100001):
    func.getReduce(func.getSecond(i))


