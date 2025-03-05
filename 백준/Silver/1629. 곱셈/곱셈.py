num1,num2,num3 = map(int, input().split())

def power(a, b):
    if b == 1:
        return a % num3
        
    x = power(a, b//2)
 
    if b % 2 == 0:
        return x**2 % num3
    else:
        return x**2 * a % num3

print (power(num1,num2))