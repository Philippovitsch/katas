# Source: https://www.codewars.com/kata/5208f99aee097e6552000148

def split_v1(words):
    split_string = ""

    for letter in words:
        if letter.isupper():
            split_string += " " + letter
        else:
            split_string += letter
    
    return split_string


def split_v2(words):
    return "".join([letter if letter.islower() else " " + letter for letter in words])
