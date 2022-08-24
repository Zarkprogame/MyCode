
print('Bienvenido')
print('Elige 1 para ingresar un usuario')
print('Elige 2 para canncelar la operacion')
n = input('Eleccion: ')
lista = []

if n == '1':
    while n == '1':
        diccionario = {
            "nombre":"",
            "sexo":"",
            "edad":""
        }
#-------------------------------------------------------------------------------------------------------------------------
        nombre = input('ingrese el nombre del usuario: ')
        for i in nombre:
            while i.isdigit():
                nombre = input('Ingrese nuevamente el nombre: ')
        diccionario['nombre'] = nombre


#-------------------------------------------------------------------------------------------------------------------------
        sexo = input('ingrese el sexo del usuario(solo M o F): ')
        if sexo == 'M':
            diccionario['sexo'] = sexo
        elif sexo == 'F':
            diccionario['sexo'] = sexo
        else:
            while sexo != 'F' or 'M':
                sexo = input('No es un sexo contemplado. Ingrese nuevamente el sexo: ')
                if sexo == 'M':
                    diccionario['sexo'] = sexo
                elif sexo == 'F':
                    diccionario['sexo'] = sexo
#-------------------------------------------------------------------------------------------------------------------------
        edad = input('Ingrese la edad del usuario: ')
        nn = input('Quieres agregar otro usuario? 1 para si, 2 para no:  ')
        if nn == '2':
            n += 1
            print('Gracias')
        elif nn == '1':
            continue
        else:
            print('no es un valor contemplado')
elif n == 2:
    print('Finalizo la ejecucion')

else:
    print('No es un valor contemplado')