def makeAnagram(a, b):
    dicti={}
    count=0
    for i in a:
        if i in dicti:
            dicti[i]+=1
        else:
            dicti[i]=1
    for j in b:
        if j in dicti:
            dicti[j]-=1
        else:
            dicti[j]=-1
    for k in dicti:
        if dicti[k]!=0:
            count+=abs(dicti[k])
    return count
