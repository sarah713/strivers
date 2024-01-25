class Solution(object):
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if len(nums) == 1:
            return nums[0]
        maxSum=0
        maxTillNow=float('-inf')
        for i in nums:
            maxSum += i
            if maxSum > maxTillNow:
                maxTillNow = maxSum
            if maxSum <= 0:
                maxSum=0
        return maxTillNow
        