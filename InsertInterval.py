class Solution:
    def kadane(self,nums):
        maxSum=0
        maxTillNow=0
        for i in nums:
            maxSum += i
            if maxSum <= 0:
                maxSum=0
            maxTillNow = max(maxTillNow,maxSum)
        return maxTillNow
