import unittest

from main import find_the_party_outlier as outlier


class TestFindThePartyOutlier(unittest.TestCase):

    def test_finf(self):
        self.assertEquals(1, outlier.find([0, 1, 2]))
        self.assertEquals(2, outlier.find([1, 2, 3]))
        self.assertEquals(3, outlier.find([2, 6, 8, 10, 3]))
        self.assertEquals(1, outlier.find([2, 6, 8, 200, 700, 1, 84, 10, 4]))
        self.assertEquals(17, outlier.find([17, 6, 8, 10, 6, 12, 24, 36]))
        self.assertEquals(2, outlier.find([2, 1, 7, 17, 19, 211, 7]))
        self.assertEquals(44, outlier.find([1, 1, 1, 1, 1, 44, 7, 7, 7, 7, 7, 7, 7, 7]))
        self.assertEquals(1000, outlier.find([3, 3, 3, 3, 3, 3, 3, 3, 35, 5, 5, 5, 5, 5, 5, 5, 5, 7, 7, 7, 7, 1000]))


if __name__ == "__main__":
    unittest.main()
