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