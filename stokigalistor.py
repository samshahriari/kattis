input()
l = input().split()
l = [int(i) for i in l]
sorted = l.copy()
sorted.sort()
count = 0
for i in range(len(l)):
    if l[i] != sorted[i]:
        count += 1
print(count)
