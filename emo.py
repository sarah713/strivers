class Solution(object):
    def longestConsecutive(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if len(nums) == 0:
            return 0
        if len(nums) == 1:
            return 1
        s = set(nums)
        longestStreak=0
        for i in range(len(nums)):
            if nums[i]-1 not in s:
                streak=0
                cur=nums[i]
                while (cur+1) in s:
                    streak+=1
                    cur+=1
                longestStreak = max(longestStreak,streak)

        return longestStreak+1
                