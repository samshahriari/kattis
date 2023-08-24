import heapq

tasks, coworkers = map(int, input().split())

annoyance = []
largest = -1

for i in range(coworkers):
    start, addition = map(int, input().split())
    if largest < start:
        largest = start
    annoyance.append((start+addition, addition))

heapq.heapify(annoyance)

tasks_done = 0
while tasks_done < tasks:
    smallest = heapq.heappop(annoyance)
    if largest < smallest[0]:
        largest = smallest[0]
    heapq.heappush(annoyance, (smallest[0]+smallest[1], smallest[1]))
    tasks_done += 1
print(largest)
