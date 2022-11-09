word = input()
for i in range(len(word)):
    if word[i] == ':' or word[i] == ';' :
        if i+1 < len(word):
            if word[i+1] == ')':
                print(i)
            elif i+2 < len(word):
                if word[i+1] == '-' and word[i+2] == ')':
                    print(i)
