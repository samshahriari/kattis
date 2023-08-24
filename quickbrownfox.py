import string


for i in range(int(input())):
    letters = list(string.ascii_lowercase)
    for c in input():
        try:
            letters.remove(c.lower())
        except:
            pass
    if len(letters) == 0:
        print("pangram")
    else:
        print("missing", ''.join(letters))
