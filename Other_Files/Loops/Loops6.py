#Write a Program which displays the sum of digits of an integer read from the user

numer = input('Enter a Number: ')
sum = 0
try:
    for counter in numer:
        sum += int(counter)
    print(sum)
except:
    print('Was an Error with some numer introduced')

