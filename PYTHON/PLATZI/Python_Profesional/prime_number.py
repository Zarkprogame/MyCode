from __future__ import division


def is_prime(number: int) -> bool:
    divisors : list = [x for x in range(2, number) if number % x ==0 ]
    return len(divisors) == 0

def run():
    number = int(input('Ingresa un Numero:'))
    if is_prime(number):
        print(number, 'es un Numero Primo')
    else: 
        print(number, "no es un numero primo")

if __name__ == '__main__':
    run()