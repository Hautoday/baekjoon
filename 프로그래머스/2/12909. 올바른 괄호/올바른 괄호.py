def solution(s):
    count = 0
    if s[0] == '(' and s[-1] == ')': 
        for char in s:
            if char  == '(':
                count += 1
            else:
                count -= 1
            if count < 0:
                return False
        if count == 0:
            return True
    return False