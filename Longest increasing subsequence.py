class Solution:
    def lis(self, A):
        lisub=[1]*len(A)
        
        for i in range(1,len(A)):
            for j in range(i):
                if A[i]>A[j] and lisub[i]<lisub[j]+1:
                    lisub[i]=lisub[j]+1
        max=0
        
        for i in lisub:
            if i>max:
                max=i
        return max
        
        
