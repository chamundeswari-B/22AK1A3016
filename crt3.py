"""
def catfood(n,c,u,arr):
          if n == 0:
                    return 0
          cf = 0
          rf = c*u

          for i in range(n):
                    cf = cf +arr[i]
                    if cf >= rf:
                              return i+1
          if  cf < rf:
                    return - 1
n = int(input())
c = int(input())
u = int(input())
arr = []
for i in range(n):
        arr.append(int(input()))
print(catfood(n,c,u,arr))"""


"""def missingDigits(num):
          li=[False]*10
          while num:
                  li[num %10]=True
                  num=num//10
          return li
num=int(input())
result=missingDigits(num)
for i in range(10):
        if not result[i]:
                print(i,end=" ")"""

"""a1=[1,2,3]
a2=a1.copy()
a2.append(21)
print(a2)
print(a1)"""


y=int(input("year:"))

if (y%4==0):
        if(y%100==0):
             if(y%400==0):
                    print('leap year')
             else:
                    print('not a leap year')
        else:
                print('leap year')
else:
        print('not leap year')