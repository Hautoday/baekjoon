number = int(input())
answer = []
answer = list(map(int, input().split()))
for i in range (1,number):
    answer[i] = max(answer[i], answer[i]+answer[i-1])
print(max(answer))