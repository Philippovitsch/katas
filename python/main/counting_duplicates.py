# Source: https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1

def count(text):
    unique_letters = get_unique_letters(text)
    duplicate_letters = [letter for letter in unique_letters.values() if letter > 1]
    return len(duplicate_letters)


def get_unique_letters(text):
    letters = [letter for letter in text]
    unique_letters = {}
    for letter in letters:
        if letter.lower() in unique_letters:
            unique_letters[letter.lower()] += 1
        else:
            unique_letters[letter.lower()] = 1
    return unique_letters
