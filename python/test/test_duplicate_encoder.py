import unittest

from main import duplicate_encoder


class TestDuplicateEncoder(unittest.TestCase):

    def test_encode(self):
        self.assertEquals("(((", duplicate_encoder.encode("din"))
        self.assertEquals("()()()", duplicate_encoder.encode("recede"))
        self.assertEquals(")())())", duplicate_encoder.encode("Success"))
        self.assertEquals("))((", duplicate_encoder.encode("(( @"))
        self.assertEquals(")()))()))))()(", duplicate_encoder.encode("Supralapsarian"))


if __name__ == "__main__":
    unittest.main()
