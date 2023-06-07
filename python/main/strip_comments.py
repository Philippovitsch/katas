# Source: https://www.codewars.com/kata/51c8e37cee245da6b40000bd

def strip(text, markers):
    lines = text.split("\n")
    stripped_lines = []
    for line in lines:
        stripped_line = strip_line(line, markers)
        stripped_lines.append(stripped_line)
    return "\n".join(stripped_lines)


def strip_line(line, markers):
    for marker in markers:
        if marker in line:
            line = line[0:line.find(marker)]
    return line.rstrip()
