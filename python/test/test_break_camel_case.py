import unittest

from main import break_camel_case


class TestBreakCamelCase(unittest.TestCase):

    def test_split(self):
        test_cases = [
            ("", ""),
            ("a", "a"),
            ("ab", "ab"),
            ("a B", "aB"),
            ("aa Bb", "aaBb"),
            ("aa Bb Cc", "aaBbCc"),

            # Test cases from Codewars:
            ("word", "word"),
            ("camel Casing", "camelCasing"),
            ("break Camel Casing", "breakCamelCasing"),
            ("this Is A Longer Test String", "thisIsALongerTestString")
        ]

        for test_case in test_cases:
            self.assertEquals(test_case[0], break_camel_case.split_v1(test_case[1]))
            self.assertEquals(test_case[0], break_camel_case.split_v2(test_case[1]))


if __name__ == "__main__":
    unittest.main()
