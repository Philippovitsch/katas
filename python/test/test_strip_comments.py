import unittest

from main import strip_comments as comments


class TestStripComments(unittest.TestCase):

    def test_strip(self):
        self.assertEquals('', comments.strip('', ['#', '!']))
        self.assertEquals('', comments.strip('#', ['#', '!']))
        self.assertEquals('\n', comments.strip('\n§', ['#', '§']))
        self.assertEquals('a\nc\nd', comments.strip('a #b\nc\nd $e f g', ['#', '$']))
        self.assertEquals(
            'apples, pears\ngrapes\nbananas',
            comments.strip('apples, pears #and bananas\ngrapes\nbananas !apples', ['#', '!'])
        )
        self.assertEquals(
            'apples, pears\ngrapes\nbananas',
            comments.strip('apples, pears #and bananas\ngrapes\nbananas !#apples', ['#', '!'])
        )
        self.assertEquals(
            'apples, pears\ngrapes\nbananas',
            comments.strip('apples, pears #and bananas\ngrapes\nbananas #!apples', ['#', '!'])
        )
        self.assertEquals(
            'apples, pears #and bananas\ngrapes',
            comments.strip('apples, pears #and bananas\ngrapes @bananas', ['@', '!'])
        )
        self.assertEquals(
            'apples, pears\ngrapes\navocado',
            comments.strip('apples, pears §and bananas\ngrapes\navocado *apples', ['*', '§'])
        )
        self.assertEquals(
            '\tapples, pears\navocado',
            comments.strip('\tapples, pears §and bananas\navocado *apples', ['*', '§'])
        )
        self.assertEquals(
            '  apples, pears\navocado',
            comments.strip('  apples, pears §and bananas\navocado *apples', ['*', '§'])
        )
        self.assertEquals(
            'apples, pears # and bananas\nbananas !apples',
            comments.strip('apples, pears # and bananas\nbananas !apples', [])
        )


if __name__ == "__main__":
    unittest.main()
