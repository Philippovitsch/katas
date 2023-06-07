# Source: https://www.codewars.com/kata/52597aa56021e91c93000cb0

def move(numbers):
    sorted_numbers = [number for number in numbers if number != 0]
    sorted_numbers += [0] * (len(numbers) - len(sorted_numbers))
    return sorted_numbers
