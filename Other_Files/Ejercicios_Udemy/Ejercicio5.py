def mayor_edad(edad):
    if edad < 0:
        print('La Edad no Existe')
    elif edad < 18:
        print('Menor de Edad')
    elif edad >= 18:
        print('Mayor de Edad')
    

mayor_edad(1)