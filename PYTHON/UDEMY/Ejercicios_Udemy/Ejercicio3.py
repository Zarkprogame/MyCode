#Encontrar el menor numero de una lista

lista = [4,54,1,43,75,24,52,62,-53,32,-14]
menor = 0

for x in lista:
    if x < menor:
        menor = x
print(menor)