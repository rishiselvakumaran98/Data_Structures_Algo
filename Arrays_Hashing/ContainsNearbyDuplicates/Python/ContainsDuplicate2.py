from typing import List

class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        visitedHash = {}
        for i in range(len(nums)):
            if nums[i] in visitedHash:
                j = visitedHash[nums[i]]
                if(abs(i-j) <= k):
                    return True
            visitedHash[nums[i]] = i
        return False
        
assert Solution().containsNearbyDuplicate([1,2,3,1],3)== True, "Not true, Hahaha  you Failed!"
assert Solution().containsNearbyDuplicate([1,0,1,1],1)== True, "Not true, Hahaha  you Failed!"
assert Solution().containsNearbyDuplicate([1,2,3,1,2,3],2)== False, "Not False, Hahaha  you Failed!"