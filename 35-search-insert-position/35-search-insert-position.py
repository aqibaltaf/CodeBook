class Solution(object):
    def searchInsert(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        
        if(target in nums):
            return(nums.index(target))
        else:
            for index, elem in enumerate(nums):
                if elem > target:
                    return(index)

        return(len(nums))
        
        