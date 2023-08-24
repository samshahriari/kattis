import heapq

n = int(input())

a_stat = []
b_stat = []
c_stat = []


har_använts = set()

for i in range(n):
    rad = input()
    namn = rad.split()[0]
    a, b, c = map(int, rad.split()[1:])
    a_stat.append((-a, namn))
    b_stat.append((-b, namn))
    c_stat.append((-c, namn))


heapq.heapify(a_stat)
heapq.heapify(b_stat)
heapq.heapify(c_stat)
for i in range(n//3):
    a_namn = heapq.heappop(a_stat)[1]
    while a_namn in har_använts:
        a_namn = heapq.heappop(a_stat)[1]
    har_använts.add(a_namn)

    b_namn = heapq.heappop(b_stat)[1]
    while b_namn in har_använts:
        b_namn = heapq.heappop(b_stat)[1]
    har_använts.add(b_namn)

    c_namn = heapq.heappop(c_stat)[1]
    while c_namn in har_använts:
        c_namn = heapq.heappop(c_stat)[1]
    har_använts.add(c_namn)

    svar = [a_namn, b_namn, c_namn]
    svar.sort()
    print(svar[0], svar[1], svar[2])
