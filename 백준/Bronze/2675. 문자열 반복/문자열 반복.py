N=int(input())
for _ in range(N):
    R,S=map(str,input().split())
    result = ''  
    for letter in S:
        result += letter * int(R)
    print(result)