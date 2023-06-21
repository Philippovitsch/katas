# Source: https://www.codewars.com/kata/529b418d533b76924600085d

import re


def to_underscore(string):
    if isinstance(string, int):
        return str(string)

    words = re.findall('[A-Z][^A-Z]*', string)
    words = [word.lower() for word in words]
    return "_".join(words)
