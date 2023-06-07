# Source: https://www.codewars.com/kata/54b42f9314d9229fd6000d9c

def encode(word):
    unique_letters = {letter: word.lower().count(letter) for letter in word.lower()}
    encoded_letters = [")" if unique_letters[letter] > 1 else "(" for letter in word.lower()]
    return "".join(encoded_letters)
