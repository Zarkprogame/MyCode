#Write a Program which reads a positive number N from the user then indicates if N is prime or not.

try:
    number = int(input('Enter an Integer: '))
    integers = []
    counter = 1
    while counter <= number:
        if number % counter == 0:
            integers.append(counter)
            counter += 1
        elif number % counter != 0:
            counter += 1
    if len(integers) == 2:
        print('Prime Number')

    else:
        print('Not Prime Number')
except:
    print('This wasnt an integer')
