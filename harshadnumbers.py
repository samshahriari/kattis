def numberSum(numb):
    sum =0
    for i in str(numb):
        sum += int(i)
    return sum

def isHarshad(numb):
    if numb% numberSum(numb) == 0:
        print(numb)
    else: 
        isHarshad(numb+1)

isHarshad(int(input()))

