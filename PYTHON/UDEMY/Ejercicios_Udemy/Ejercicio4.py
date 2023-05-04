#Encontrar el volumen de un esfera por su radio

# radio = int(input('Ingrese radio de la esfera: '))

# volumen = 4/3 * 3,1416 * (radio*radio*radio)

# print(volumen)

def calcular_volumen(radio):
    volumen = 4/3 * 3.1416 * radio**3
    return print(volumen)


calcular_volumen(6)