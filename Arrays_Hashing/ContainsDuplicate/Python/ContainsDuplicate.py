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
