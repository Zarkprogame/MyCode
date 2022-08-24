#Multiplar 2 numeros sin usar el operador *

a = int(input("Ingrese el primer numero: "))
b = int(input("Ingrese el segundo numero: "))
result = 0

for x in range(b):
    result += a
print(result)