# Source: https://www.codewars.com/kata/55c45be3b2079eccff00010f

def sort(sentence):
    if sentence == "":
        return ""

    indexed_words = get_indexed_words(sentence)
    ordered_words = dict(sorted(indexed_words.items()))
    return " ".join(ordered_words.values())


def get_indexed_words(sentence):
    words = sentence.split(" ")
    indexed_words = {}
    for word in words:
        position = [int(letter) for letter in word if letter.isnumeric()][0]
        indexed_words[position] = word
    return indexed_words
