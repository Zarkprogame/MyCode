def Seleccion(info:dict)->list:
    promedios_ponderados = []
    correo = ""
    documento_correo = ""
    nombre_correo = ""
    apellido_correo = ""
    apellido_temp = ''
    apellido_correo_lista = []
    numerador = []
    denominador = []
    datos_est = []
    estudiantes = []
    for cod_student in info:    
        codig_estudent = info[cod_student]['materias']
        name_est = info[cod_student]['nombres']
        lastName_est = info[cod_student]['apellidos']
        documento_est = str(info[cod_student]['documento'])
        programa_est = info[cod_student]['programa']
#------------------------------------------------------------------        
        for document in documento_est:
            ultimo_dig = documento_est[-1]
            penultimo_dig = documento_est[-2]
            documento_correo = penultimo_dig + ultimo_dig 
        for nombre in  name_est:
            if nombre.isupper():
                nombre_correo += nombre.lower()
            a,b = 'áéíóú', 'aeiou'
            transform = str.maketrans(a,b)
            nombre_trans = nombre_correo.translate(transform)
        if len(nombre_correo) == 2:              # Si el nombre tiene dos nombres
            apellido_trans = ""
            apellido_correo_lista.clear()
            for apellido in lastName_est:
                apellido_correo_lista.append(apellido.lower())
                if apellido == ',':
                    apellido_correo_lista.pop()
                    break
            apellido_correo = "".join(apellido_correo_lista)
            a,b = 'áéíóú', 'aeiou'
            transform = str.maketrans(a,b)
            apellido_trans = apellido_correo.translate(transform)
            correo = nombre_trans + '.' + apellido_trans + documento_correo   
            nombre_correo = ""   
        elif len(nombre_correo) == 1:
            for apellido in reversed(lastName_est):
                apellido_temp += apellido.lower()
                if apellido == ' ':
                    break
                a,b = 'áéíóú', 'aeiou'
                transform = str.maketrans(a,b)
                apellido_trans = apellido_temp.translate(transform)[::-1]
                apellido_trans1 = (lastName_est[0].lower()).translate(transform)
            apellido_correo = nombre_trans + apellido_trans1 + '.' + apellido_trans + documento_correo
            correo = (apellido_correo)
            nombre_correo = ""


#-----------------------------------------------------
        for materias in codig_estudent:        
            materia_est = materias['retirada']
            if materia_est == 'No': 
                numerador.append((materias['creditos'])*(materias['nota']))
                denominador.append(materias['creditos'])
                sum_numerator = sum(numerador)
                sum_denominator = sum(denominador)
                try:
                    promedio_ponderado = sum_numerator / sum_denominator
                except:
                    sum_demominator = [1]
        promedios_ponderados.append(promedio_ponderado)
        numerador.clear()
        denominador.clear()
        datos_est.clear()
        datos_est.append(cod_student)
        datos_est.append(name_est)
        datos_est.append(lastName_est)
        datos_est.append(int(documento_est))
        datos_est.append(programa_est)
        datos_est.append(promedio_ponderado)
        datos_est.append(correo)
        datos_est_copy = datos_est.copy()
        estudiantes.append(datos_est_copy) 
        codigo = str(cod_student)
        year = codigo[0:4]   
    max_prom = max(promedios_ponderados)
    ganadores = []
    lista_anosCodigos = []
    for listas in estudiantes:
        if listas[5] == max_prom:
            ganadores.append(listas)
    ganador = min(ganadores)
    print(ganador)

Seleccion({
 20180218013:{
"nombres" : "Julio Nicolas",
"apellidos" : "Pardo, Ramírez",
"documento" : 77780207,
"programa" : "ISIS",
"materias" : [
{
"facultad" : "Ingenieria",
"codigo" : "ISIS-2485",
"nota" : 4.49,
"creditos" : 2,
"retirada" : "No",
},
{
"facultad" : "Ingenieria",
"codigo" : "ISIS-6565",
"nota" : 2.44,
"creditos" : 3,
"retirada" : "No",
},
{
"facultad" : "Ingenieria",
"codigo" : "ISIS-2485",
"nota" : 4.17,
"creditos" : 2,
"retirada" : "No",
},
{
"facultad" : "Ingenieria",
"codigo" : "ISIS-6565",
"nota" : 2,
"creditos" : 3,
"retirada" : "Si",
},
{
"facultad" : "Ingenieria",
"codigo" : "ISIS-6565",
"nota" : 3.29,
"creditos" : 3,
"retirada" : "No",
},
 ]
},
 20120153166:{
"nombres" : "Maria Camila",
"apellidos" : "Gómez, Suárez",
"documento" : 13060098,
"programa" : "MEDI",
"materias" : [
{
"facultad" : "Medicina",
"codigo" : "MEDI-6474",
"nota" : 4.48,
"creditos" : 3,
"retirada" : "No",
},
{
"facultad" : "Medicina",
"codigo" : "MEDI-1652",
"nota" : 3.63,
"creditos" : 2,
"retirada" : "No",
},
{
"facultad" : "Medicina",
"codigo" : "MEDI-9490",
"nota" : 3.61,
"creditos" : 3,
"retirada" : "No",
},
{
"facultad" : "Historia del Arte",
"codigo" : "HART-8458",
"nota" : 3.0,
"creditos" : 3,
"retirada" : "No",
},
 ]
},
 20180294370:{
"nombres" : "Andres Oscar",
"apellidos" : "Martínez, Guitiérrez",
"documento" : 38221530,
"programa" : "DISE",
"materias" : [
{
"facultad" : "Diseño",
"codigo" : "DISE-5161",
"nota" : 3.18,
"creditos" : 3,
"retirada" : "No",
},
{
"facultad" : "Diseño",
"codigo" : "DISE-4199",
"nota" : 3.31,
"creditos" : 3,
"retirada" : "No",
},
{
"facultad" : "Arquitectura",
"codigo" : "ARQD-2553",
"nota" : 2.67,
"nota" : 3.93,
"creditos" : 2,
"retirada" : "No",
},
 ]
},
 20140227848:{
"nombres" : "Jose Nicolas",
"apellidos" : "Díaz, Romero",
"documento" : 21403906,
"programa" : "IQUI",
"materias" : [
{
"facultad" : "Ingenieria",
"codigo" : "IQUI-3859",
"nota" : 3.94,
"creditos" : 3,
"retirada" : "No",
},
{
"facultad" : "Ingenieria",
"codigo" : "IQUI-9815",
"nota" : 3.68,
"creditos" : 1,
"retirada" : "No",
},
{
"facultad" : "Ingenieria",
"codigo" : "IQUI-9702",
"nota" : 2.7,
"creditos" : 4,
"retirada" : "No",
},
{
"facultad" : "Ingenieria",
"codigo" : "IQUI-2859",
"nota" : 4.05,
"creditos" : 2,
"retirada" : "No",
},
 ]
},
 20170115295:{
"nombres" : "Maria Paula",
"apellidos" : "Córdoba, Ramírez",
"documento" : 43182695,
"programa" : "ICIV",
"materias" : [
{
"facultad" : "Ingenieria",
"codigo" : "ICIV-8615",
"nota" : 4.43,
"creditos" : 3,
"retirada" : "No",
},
{
"facultad" : "Ingenieria",
"codigo" : "ICIV-1020",
"nota" : 3.12,
"creditos" : 4,
"retirada" : "No",
},
{
"facultad" : "Ingenieria",
"codigo" : "ICIV-1020",
"nota" : 3.18,
"creditos" : 4,
"retirada" : "No",
},
 ]
},
 20140186272:{
"nombres" : "Gabriel Nicolas",
"apellidos" : "Cuellar, López",
"documento" : 55100972,
"programa" : "DIMD",
"materias" : [
{
"facultad" : "Diseño",
"codigo" : "DIIN-5413",
"nota" : 3.69,
"creditos" : 0,
"retirada" : "Si",
},
{
"facultad" : "Diseño",
"codigo" : "DIMD-8304",
"nota" : 4.98,
"creditos" : 4,
"retirada" : "No",
},
{
"facultad" : "Diseño",
"codigo" : "DIMD-7666",
"nota" : 3.23,
"creditos" : 2,
"retirada" : "No",
},
{
"facultad" : "Diseño",
"codigo" : "DIMD-3018",
"nota" : 3.67,
"creditos" : 3,
"retirada" : "No",
},
 ]
},
 } )