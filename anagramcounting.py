import math
import sys

for line in sys.stdin:
    letters = dict()
    for c in line.strip():
        if c not in letters:
            letters[c] = 1
        else:
            letters[c] += 1
    divisor = 1
    for v in letters.values():
        divisor *= math.factorial(v)
    print((math.factorial(len(line.strip())))//divisor)
