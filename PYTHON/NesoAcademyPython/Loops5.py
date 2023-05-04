#Write a Program which reads a sequence of positive numbers. The program stops when the user fills a negative
# value and shows the maximun and minimum of these numbers.

number = 0
numbers = []
try:
    while number >= 0:
        number = int(input('Enter a number:'))
        if number > 0:
            numbers.append(number)
    number = -1
    if number < 0:
        print(f'The maximum number is: {max(numbers)} and the minimum: {min(numbers)}')

except:
    print('Was an Error with some data introduces')
