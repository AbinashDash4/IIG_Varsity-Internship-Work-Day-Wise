"""
        Write a python program t draw a diamond of astricks? 
                                   *
                                  ***
                                 *****
                                *******
                               *********
                              ***********
                             *************
                            ***************
                           *****************
                            ***************
                             *************
                              ***********
                               *********
                                *******
                                 *****
                                  ***
                                   *
"""

space = 35
star = 1
for x in range(0,17):
	for y in range(0,space):
		print(" ",end="")
	for z in range(0,star):
		print("*",end="")	
	print()
	if x>=8:
		space+=1
		star-=2
	else:
		space-=1
		star+=2




