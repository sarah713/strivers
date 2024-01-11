class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        nums.sort()
        i=0
        j=len(nums)-1
        while i < j:
            if nums[i]+nums[j] == target:
                return [i,j]
            elif nums[i]+nums[j] < target:
                i+=1
            else:
                j-=1
        return [-1,-1]
        