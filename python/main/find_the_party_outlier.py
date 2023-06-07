# Source: https://www.codewars.com/kata/5526fc09a1bbd946250002dc

def find(integers):
    integer_is_even = [number % 2 == 0 for number in integers]
    modulo_rest = 0 if integer_is_even.count(True) == 1 else 1
    filtered_integers = filter(lambda number: number % 2 == modulo_rest, integers)
    return list(filtered_integers)[0]
