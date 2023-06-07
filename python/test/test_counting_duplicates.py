import unittest

from main import counting_duplicates as duplicates


class TestCountingDuplicates(unittest.TestCase):

    def test_count(self):
        self.assertEquals(0, duplicates.count(""))
        self.assertEquals(0, duplicates.count("abcde"))
        self.assertEquals(1, duplicates.count("abcdeaa"))
        self.assertEquals(2, duplicates.count("abcdeaB"))
        self.assertEquals(2, duplicates.count("Indivisibilities"))


if __name__ == "__main__":
    unittest.main()
