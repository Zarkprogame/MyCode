#Write a Program which displays the sum of the STRICT SIVISORS of an integers given by the user
counter = 1
number = int(input('Enter a Number: '))
strict_divisors = []
while counter < number:
    if number % counter == 0:
        strict_divisors.append(counter)
        counter += 1
    else:
        counter += 1
print(f'The sum of the Divisors of {number} are : {sum(strict_divisors)}')

#Lo que mas me costo fue identificar el: else y era cuando no haya un divisor hay que sumarle 1
#a contador para que siga su ejecucion.