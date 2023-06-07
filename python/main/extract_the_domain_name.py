# Source: https://www.codewars.com/kata/514a024011ea4fb54200004b

def extract(url):
    url = url.replace("http://", "").replace("https://", "").replace("www.", "")
    end = url.find(".")
    return url[0:end]
