# -*- coding: cp1251 -*-
from xml.dom import minidom
import os
import pandas

class Producer:
    def removeCSV(self, nameCSV):
        try:
            os.remove(nameCSV)
        except:
            pass
    def removeCSV2(self, nameCSV):
        try:
            os.remove(nameCSV)
        except:
            pass
        with open(nameCSV, 'a') as f:
            f.write('count' + '\n')

    def getCSV(self, n, m):

        nameXML = '/home/first/Documents/result/' + str(n) + '.xml'
        doc = minidom.parse(nameXML)
        snilses = doc.getElementsByTagName("Snils_pfr")

        snils = snilses[m].firstChild.nodeValue
        return snils

    def getCount(self, dir, n):
        with open(dir + str(n) + ".XML") as f:
            sum = 0
            for s in f:
                i = s.find('/Snils_pfr')
                if i > - 1:
                    sum += 1
            return sum
    def writeCSV(self, nameCSV, val):
        with open(nameCSV, 'a') as f:
            f.write(str(val)[0:11:1] + ' ' + str(val)[0:2:1] + ',' + '\n')

    def writeCSV2(self, nameCSV, val):
        with open(nameCSV, 'a') as f:
            f.write(str(val) + '\n')
    def getReduce(self, n):

        m = Producer().getM(n)

        Producer().removeCSV('/home/first/snils/' + str(n) + '.csv')
        data = pandas.read_csv('/home/first/Pictures/snils_04_2017_trud.csv')
        data = pandas.DataFrame({'06592381488': data[u'065-923-814 88'].values})

        for i in range(n, m):
            val = data['06592381488'].loc[i]
            with open('/home/first/snils/' + str(n) + '.csv', 'a') as f:
                f.write((str(val).replace("-", "")).replace(" ", "") + '\n')

    def getM(self, n):
        return n + 100000

    def getSecond(self, n):
        if n == 0:
            return 0
        else:
            return n - 1






