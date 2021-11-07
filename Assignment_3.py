a = input("Enter the sentences: ")
b = input("Enter a single letter: ")
# TO make this program a non-case sensitive keeping a & b both in lower case 
c = a.casefold() 
d = b.casefold()
m = len(c)
if d not in c :
    print("Entered letter not found")
for i in range(0,m):
    if d == c[i]:
        print(a[i+1:m+1])
        break