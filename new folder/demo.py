s=input().split()
for i in range(len(s)):
        if i%2==0:
                int(s[i])+=2
        else:
                int(s[i])-=1
print(s)