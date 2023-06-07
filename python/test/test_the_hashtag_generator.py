import unittest

from main import the_hashtag_generator as generator


class TestTheHashtagGenerator(unittest.TestCase):

    def test_generate_hashtag(self):
        self.assertEquals('#Codewars', generator.generate_hashtag("Codewars"))
        self.assertEquals('#Codewars', generator.generate_hashtag("Codewars    "))
        self.assertEquals('#Codewars', generator.generate_hashtag("    Codewars"))
        self.assertEquals("#CodewarsIsNice", generator.generate_hashtag("Codewars Is Nice"))
        self.assertEquals("#CodewarsIsNice", generator.generate_hashtag("codewars is nice"))
        self.assertEquals("#CodewarsIsNice", generator.generate_hashtag("Codewars iS niCe"))
        self.assertEquals("#CodewarsIsNice", generator.generate_hashtag("    Codewars    Is    Nice    "))
        self.assertEquals("#CIN", generator.generate_hashtag("c i n"))
        self.assertEquals(
            "#HelloThereThanksForTryingMyKata",
            generator.generate_hashtag(" Hello there thanks for trying my Kata")
        )

        long_cat = ("Looooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo" +
                    "oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooong Cat")
        self.assertFalse(generator.generate_hashtag(long_cat))
        self.assertFalse(generator.generate_hashtag(""))


if __name__ == "__main__":
    unittest.main()
