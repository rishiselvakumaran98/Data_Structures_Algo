import unittest
from ContainsDuplicate2 import Solution
class TestSolution(unittest.TestCase):
    def setUp(self):
        self.s = Solution()

    def test_contains_nearby_duplicate(self):
        nums = [1, 2, 3, 1]
        k = 3
        self.assertTrue(self.s.containsNearbyDuplicate(nums, k))

        nums = [1, 0, 1, 1]
        k = 1
        self.assertTrue(self.s.containsNearbyDuplicate(nums, k))

        nums = [1, 2, 3, 1, 2, 3]
        k = 2
        self.assertFalse(self.s.containsNearbyDuplicate(nums, k))

if __name__ == '__main__':
    unittest.main()