#!/usr/bin/env python
# -*- coding: utf-8-*-
import CSV
func = CSV.Producer()
func.removeCSV()
for i in range(1, 165):
    for j in range(2, func.getCount('/home/first/Documents/result/', 165)):
        val = func.getCSV(i, j)
        func.writeCSV(val)