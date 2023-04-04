sum = 0
input()

l = [int(x) for x in input().split()]
l.sort(reverse=True)
sum = 0

for i in range(2, len(l), 3):
    sum += l[i]

print(sum)