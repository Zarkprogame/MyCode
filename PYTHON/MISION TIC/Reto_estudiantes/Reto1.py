import funciones
import json
import os

os.system('cls')
estudiantes = []
funciones.mostrar_menu()

while True:

    eleccion = input("Elije un Numero para realizar una Accion: ")

    if eleccion == "1":
        os.system('cls')
        funciones.mostrar_menu()
        funciones.mostrar_numero_estudiantes()

    elif eleccion == "2":
        os.system('cls')
        funciones.mostrar_menu()
        funciones.crear_estudiante()
        print("Datos Guardados con Exito" )

    elif eleccion == "3":
        os.system('cls')
        funciones.mostrar_menu()
        search_name = input("Ingrese Nombre del Estudiante a Buscar: ")
        est_founded = funciones.buscar_estudiantes(search_name)

    elif eleccion == "4":
        os.system('cls')
        funciones.mostrar_menu()
        borrar_est = int(input("Ingresa el Documento del estudiante a Borrar: "))
        funciones.eliminar_estudiante(estudiantes, borrar_est)

    else:
        os.system('cls')
        funciones.mostrar_menu()
        print("Coloca un Numero contemplado")