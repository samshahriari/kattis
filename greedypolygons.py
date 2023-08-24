import math

for i in range(int(input())):
    inp = input().split()
    n = int(inp[0])
    l = int(inp[1])
    d = int(inp[2])
    g = int(inp[3])

    inner_area = 1/4*n*l*l*1/math.tan(math.pi/n)
    circle = ((g*d)**2)*math.pi
    outer_area = l*g*d*n
    print(inner_area+circle+outer_area)
