import unittest

from main import array_diff as arrays


class TestArrayDiff(unittest.TestCase):

    def test_get_diff(self):
        self.assertEquals([2], arrays.get_diff([1, 2], [1]))
        self.assertEquals([2, 2], arrays.get_diff([1, 2, 2], [1]))
        self.assertEquals([1], arrays.get_diff([1, 2, 2], [2]))
        self.assertEquals([1, 2, 2], arrays.get_diff([1, 2, 2], []))
        self.assertEquals([], arrays.get_diff([], [1, 2]))
        self.assertEquals([3], arrays.get_diff([1, 2, 3], [1, 2]))


if __name__ == "__main__":
    unittest.main()
