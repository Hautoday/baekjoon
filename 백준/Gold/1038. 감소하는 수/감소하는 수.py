from itertools import combinations
num = int(input())
result = list()

for x in range(1,11):
    for y in combinations (range ( 0, 10 ), x):
        y = ''.join(list(map(str, reversed(list(y)))))
        result.append(int(y))


result.sort()

if num >= len(result):
	print(-1)
else:
	print(result[num])
