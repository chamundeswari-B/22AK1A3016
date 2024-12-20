'''
a=1
b=1
m=1
n=1
def k1():
    a=10
    b=10
    c=a+b
    print(c)
k1()
'''
'''
import sys
print(sys.getrecursionlimit())
print(sys.setrecursionlimit(500))
c=1
def great():
    global c
    print("hi guys",c)
    c+=1
    if c<=500:
        return
    great()
great()
'''
'''
def fact(n):
    if(n==0):
        return 1
    return n*fact(n-1)
re=fact(5)
print(re)
'''
#linear linearsearch
'''
pos=-1
def linearsearch(list,n):
    i=0
    while (i<len(list)):
        if(list[i] == n):
            globals()['pos']=i
            return True
        i += 1
    return False
list=[3,6,8,5,9,11]
n=9
if linearsearch(list,n):
    print("it is found:",pos+1)
else:
    print("it is not found")
'''
def binarysearch(list,n):
    low=0
    high=len(list)
    while (low<=high):
        mid=(low+high)//2
        if(list[mid]<n):
            l=mid+1
        else:
            u=mid-1
    return False
list=[-11,4,6,9,33,45]
n=6
if binarysearch(list,n):
    print("it is found:",pos+1)
else:
    print("it is not found")





