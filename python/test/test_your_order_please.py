import unittest

from main import your_order_please as order


class TestYourOrderPlease(unittest.TestCase):

    def test_sort(self):
        self.assertEquals("", order.sort(""))
        self.assertEquals("Thi1s is2 3a T4est", order.sort("is2 Thi1s T4est 3a"))
        self.assertEquals("Fo1r the2 g3ood 4of th5e pe6ople", order.sort("4of Fo1r pe6ople g3ood th5e the2"))
        self.assertEquals(
            "wha1t sh2all 3we d4o w5ith a6 dru7nken s8ailor",
            order.sort("d4o dru7nken sh2all w5ith s8ailor wha1t 3we a6")
        )
        self.assertEquals("1 2 3 4 5 6 7 8 9", order.sort("3 6 4 2 8 7 5 1 9"))


if __name__ == "__main__":
    unittest.main()
