import math

n = int(input())
for i in range(n):
    x = input()
    rot = int(math.sqrt(len(x)))
    for j in range(rot-1, -1, -1):
        for a in range (j, len(x), rot):
            print(x[a], end='')
    print()
