# Import math Library
import math
inp = input().split()

h = int(inp[0])
v = int(inp[1])

if v <= 180:
    print("safe")
else:
    v -= 180
    print(int(h/math.sin(math.radians((v)))))
