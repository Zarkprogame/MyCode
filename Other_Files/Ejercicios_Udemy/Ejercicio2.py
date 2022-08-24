#Ingresar Nombre y Apellido e imprimirlo al reves

nombre = input('Ingrese Su Nombre: ')
apellido = input('Ingrese Su Apellido: ')
nom_ape = nombre + ' ' + apellido
reverse = ""
for x in reversed(nom_ape):
    reverse += x
print(reverse)
