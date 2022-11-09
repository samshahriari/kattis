def siffersumma(n):
    sum = 0
    while(n > 0):
        sum += n%10
        n=n//10
    return sum



l = int(input())
d = int(input())
x = int(input())

min = d
max = l

for i in range(l, d+1):
    if siffersumma(i) == x:
        min = i
        break

for i in range(d, l-1, -1):
    if siffersumma(i) == x:
        max = i
        break

print(min)
print(max)
