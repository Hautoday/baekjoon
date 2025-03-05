num = int(input())
numbers = list(map(int, input().split()))
max_num = max(numbers)
total = 0

for i in numbers:
    test = i/max_num*100
    total = total + test
print(total/num)
    

