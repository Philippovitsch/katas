import unittest

from main import move_zeros_to_the_end as mover


class TestMoveZerosToTheEnd(unittest.TestCase):

    def test_move(self):
        self.assertEquals([], mover.move([]))
        self.assertEquals([0], mover.move([0]))
        self.assertEquals([0, 0], mover.move([0, 0]))
        self.assertEquals([1, 1, 2, 1, 3, 0, 0], mover.move([1, 0, 1, 2, 0, 1, 3]))
        self.assertEquals([1, 2, 1, 1, 3, 1, 0, 0, 0, 0], mover.move([1, 2, 0, 1, 0, 1, 0, 3, 0, 1]))
        self.assertEquals(
            [9, 9, 1, 2, 1, 1, 3, 1, 9, 9, 0, 0, 0, 0, 0, 0],
            mover.move([9, 9, 1, 2, 0, 1, 0, 1, 0, 3, 0, 1, 9, 0, 0, 9])
        )


if __name__ == "__main__":
    unittest.main()
