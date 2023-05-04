import json
#----------------------------------------------------------------------------------------
def mostrar_menu():
    print("Mostar Estudiantes = 1")
    print("Añadir Estudiante = 2")
    print("Buscar Estudiante = 3")
    print("Eliminar Estudiante = 4")

#----------------------------------------------------------------------------------------
        #opcion 1
def mostrar_numero_estudiantes():
    file = open('libro.json','r')
    try:
        leer_cantidad = json.load(file)
    except:
        leer_cantidad = []
    file.close()
    if len(leer_cantidad) > 0:
            print("El numero de estudiantes es:",len(leer_cantidad))
    elif len(leer_cantidad) == 0:
        print('No hay Estudiantes')

#----------------------------------------------------------------------------------------
        #opcion 2
def crear_estudiante():
    print("Ingrese los datos del Estudiante: ")
    datos = []
    datos = json.load(open('libro.json','r')) 
    datos_est={
        'nombre': input("Ingrese el nombre: ") ,
        'apellido' : input("Ingrese el apellido: ") ,
        'documento' : int(input("Ingrese el documento: ")) , 
        'sexo' : input("Ingrese el sexo: ")
        }
    datos.append(datos_est)
    subir_a_json = open('libro.json', 'w')
    subir_a_json.write(json.dumps(datos, indent = 4, sort_keys = True))

#----------------------------------------------------------------------------------------    
        #opcion 3
def buscar_estudiantes(search_name):
    checking = False
    base_de_datos = json.load(open('libro.json', 'r'))
    for contador in base_de_datos:
        if contador['nombre'] == search_name:
            print(contador)
            checking = True
    if checking == False:
         print("No se Encuentra al Estudiante")
 
#----------------------------------------------------------------------------------------      
        #opcion 4      
def eliminar_estudiante(estudiantes, borrar_est):
    lista_est = json.load(open('libro.json', 'r'))
    for contador1 in lista_est:
        if contador1['documento'] == borrar_est:
            print("¿Estas seguro de borrar este Estudiante?, si = 1 , no = 2")
            checking = input(" Si o No: ")
            if checking == "1":
                lista_est.remove(contador1)
                print("Estudiante eliminado")
                subir_a_json = open('libro.json', 'w')
                subir_a_json.write(json.dumps(lista_est, indent = 4, sort_keys = True))
            else:
                print("Estudiante no Eliminado")

#----------------------------------------------------------------------------------------
