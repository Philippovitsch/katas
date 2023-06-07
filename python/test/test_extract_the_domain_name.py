import unittest

from main import extract_the_domain_name as domain_name


class TestExtractTheDomainName(unittest.TestCase):

    def test_extract(self):
        self.assertEquals("google", domain_name.extract("http://google.com"))
        self.assertEquals("google", domain_name.extract("http://google.co.jp"))
        self.assertEquals("123", domain_name.extract("https://123.net"))
        self.assertEquals("hyphen-site", domain_name.extract("https://hyphen-site.org"))
        self.assertEquals("codewars", domain_name.extract("http://codewars.com"))
        self.assertEquals("xakep", domain_name.extract("www.xakep.ru"))
        self.assertEquals("youtube", domain_name.extract("https://youtube.com"))
        self.assertEquals("codewars", domain_name.extract("http://www.codewars.com/kata/"))
        self.assertEquals("icann", domain_name.extract("icann.org"))
        self.assertEquals("github", domain_name.extract("http://github.com/carbonfive/raygun"))
        self.assertEquals("zombie-bites", domain_name.extract("http://www.zombie-bites.com"))
        self.assertEquals("cnet", domain_name.extract("https://www.cnet.com"))


if __name__ == "__main__":
    unittest.main()
