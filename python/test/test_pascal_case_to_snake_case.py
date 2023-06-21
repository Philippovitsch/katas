import unittest

from main import pascal_case_to_snake_case as converter


class TestPascalCaseToSnakeCase(unittest.TestCase):

    def test_to_underscore(self):
        self.assertEquals("", converter.to_underscore(""))
        self.assertEquals("1", converter.to_underscore(1))
        self.assertEquals("a", converter.to_underscore("A"))
        self.assertEquals("aa", converter.to_underscore("Aa"))
        self.assertEquals("aa_b", converter.to_underscore("AaB"))
        self.assertEquals("aa_bb", converter.to_underscore("AaBb"))

        # Tests from Codewars:
        self.assertEquals("test_controller", converter.to_underscore("TestController"))
        self.assertEquals("this_is_beautiful_day", converter.to_underscore("ThisIsBeautifulDay"))
        self.assertEquals("am7_days", converter.to_underscore("Am7Days"))
        self.assertEquals("my3_code_is4_times_better", converter.to_underscore("My3CodeIs4TimesBetter"))
        self.assertEquals("5", converter.to_underscore(5))


if __name__ == "__main__":
    unittest.main()
