import funciones
import json
estudiantes = []
funciones.mostrar_menu()
while True:
    eleccion = input("Elije un Numero para realizar una Accion: ")
    if eleccion == "1":
        funciones.mostrar_numero_estudiantes()
    elif eleccion == "2":
        funciones.crear_estudiante()
        print("Datos Guardados con Exito" )
    elif eleccion == "3":
        search_name = input("Ingrese Nombre del Estudiante a Buscar: ")
        est_founded = funciones.buscar_estudiantes(search_name)
    elif eleccion == "4":
        borrar_est = int(input("Ingresa el Documento del estudiante a Borrar: "))
        funciones.eliminar_estudiante(estudiantes, borrar_est)
    else:
        print("Coloca un Numero contemplado")