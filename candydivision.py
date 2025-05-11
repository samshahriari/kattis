import math
n = int(input())
l = set()
for i in range(int(math.sqrt(n))):
    if n % (i+1) == 0:
        l.add(i)
        l.add(int(n/(i+1)-1))
l = list(l)
l.sort()
print(" ".join(l))
