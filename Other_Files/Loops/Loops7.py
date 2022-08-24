#Write a program that reads an integers N and displays the N^th Fibonacci number

number1 = 1
number2 = 1
integer = int(input('Numero de la secuencia Fibonacci: '))
serie = [number1,number2]
for counter in range(2,integer):
    standby = number1 + number2
    number2 = number1
    number1 = standby
    serie.append(standby)
print(f'The {serie[-1]} is the {integer}th Fibonacci Number')