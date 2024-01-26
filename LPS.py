class Solution:
    def longest(self,s):
        res=""
        for i in xrange(len(s)):
            odd = self.helper(s,i,i)
            even = self.helper(s,i,i+1)

            if len(odd) > len(res):
                res = odd
            if len(even) > len(res):
                res = even

        return res

    def helper(self,s,i,j):
        while i>=0 and r<len(s) and s[i] == s[r]:
            i-=1
            j+=1
        return s[i+1:j]