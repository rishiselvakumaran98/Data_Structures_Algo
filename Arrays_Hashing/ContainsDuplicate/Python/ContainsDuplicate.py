class Solution:
    def containsDuplicate(self, nums) -> bool:
        ''' 
        Implementation using the most brute force method:
        Hashing --> 
            store the visited variables in a HashSet
            and then if we revisit them then it means its 
            a duplicate!
        '''
        visited = set()

        for num in nums:
            if num not in visited:
                visited.add(num)
            else:
                return True
        return False

test1 = [1,2,3,1] # true
test2 = [1,2,3,4] # false
test3 = [1,1,1,3,3,4,3,2,4,2] # true

assert Solution().containsDuplicate(test1)==True, "Assertion came out False"
assert Solution().containsDuplicate(test2)==False, "Assertion came out True"
assert Solution().containsDuplicate(test3)==True, "Assertion came out False"