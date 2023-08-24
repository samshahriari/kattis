import math


def p_distance(x, y, x1, y1, x2, y2):
    # från https://stackoverflow.com/questions/849211/shortest-distance-between-a-point-and-a-line-segment
    A = x - x1
    B = y - y1
    C = x2 - x1
    D = y2 - y1

    dot = A * C + B * D
    len_sq = C * C + D * D
    param = -1
    if len_sq != 0:
        param = dot / len_sq

    if param < 0:
        xx = x1
        yy = y1
    elif param > 1:
        xx = x2
        yy = y2

    else:
        xx = x1 + param * C
        yy = y1 + param * D

    dx = x - xx
    dy = y - yy
    return math.sqrt(dx * dx + dy * dy)


inp = input().split()
x = int(inp[0])
y = int(inp[1])
x1 = int(inp[2])
y1 = int(inp[3])
x2 = int(inp[4])
y2 = int(inp[5])

print(min(p_distance(x, y, x1, y1, x1, y2), p_distance(x, y, x1, y1, x2, y1),
      p_distance(x, y, x2, y1, x2, y2), p_distance(x, y, x1, y2, x2, y2)))
