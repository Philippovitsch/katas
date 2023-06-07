# Source: https://www.codewars.com/kata/52449b062fb80683ec000024

def generate_hashtag(words):
    if words == "" or len(words) > 140:
        return False

    split_words = filter(lambda word: word != "", words.split(" "))
    capitalized_words = map(lambda word: word.capitalize(), split_words)
    return "#" + "".join(list(capitalized_words))
