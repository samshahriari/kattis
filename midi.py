import sys
n = int(input())
stack = list()
for i in range(n):
    a = input()
    stack.append(a[::-1])
print("".join(reversed(stack)))
