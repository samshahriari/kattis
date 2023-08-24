def neighbors(point, dist, n, m):
    l = []
    if point[0] - dist >= 0:
        l.append((point[0] - dist, point[1]))
    if point[0] + dist < n:
        l.append((point[0] + dist, point[1]))
    if point[1] - dist >= 0:
        l.append((point[0], point[1] - dist))
    if point[1] + dist < m:
        l.append((point[0], point[1] + dist))
    return l


def main():
    num_lines, num_cols = map(int, input().split())

    lines = []

    for i in range(num_lines):
        lines.append(input())

    explored = [[False for i in range(num_cols)] for j in range(num_lines)]

    explored[0][0] = True
    jumps = 0
    queue = [(0, 0), None]

    while len(queue) != 0:
        v = queue.pop(0)
        if v == None and len(queue) != 0:
            queue.append(None)
            jumps += 1
            continue
        if v == None:
            print(-1)
            return

        if v == (num_lines-1, num_cols-1):
            print(jumps)
            return

        for point in neighbors(v, int(lines[v[0]][v[1]]), num_lines, num_cols):
            if not explored[point[0]][point[1]]:
                explored[point[0]][point[1]] = True
                # set parent = v
                queue.append(point)
    print(-1)


main()
