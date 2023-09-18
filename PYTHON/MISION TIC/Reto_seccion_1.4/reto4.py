import pandas as pd
file = pd.read_csv('Casos_positivos_de_COVID-19_en_ColombiaDiezMil.csv', header = 0)

#####################################################################################################################

def percentage_by_sex(sex_age): 
    sex = file['Sexo']
    
    genders = []
    for sexo in sex:
        genders.append(sexo)
    average_age_male = (genders.count('M')+genders.count('m'))*100/len(genders)
    average_age_female = (genders.count('F')+genders.count('f'))*100/len(genders)
    dictionary = {
        'F': round(average_age_female,4),
        'M' : round(average_age_male,4),
    }
    return dictionary

#####################################################################################################################

def percentage_by_deparment(deparment_age):
    deparment = file['Departamento o Distrito']
    age = file['Edad']
    deparment_list = list(set(deparment))
    deparment_list.sort()
    ages_by_department = {}
    dictionary = {}
                
    for lista_departamentos in deparment_list:
        ages_by_department[lista_departamentos] = []
    for departamento,edad in zip(deparment,age):
        ages_by_department[departamento].append(edad)
    
    for dict_key in ages_by_department:
        percentage = round(sum(ages_by_department[dict_key]) / len(ages_by_department[dict_key]),4)
        dictionary[dict_key] = percentage
    return dictionary

#####################################################################################################################

def percentage_by_origin(origin_age):
    origin = file['País de procedencia']
    tipo = file['Tipo']
    ages_by_origin = {}
    serie = pd.Series(origin)
    serie.fillna('COLOMBIA', inplace = True)
    origin_list = list(set(origin))
    origin_list.sort()
    imported = 0
    dictionary = {}
    for lista_origen in origin_list:
        ages_by_origin[lista_origen] = []
    del ages_by_origin['COLOMBIA']
    del ages_by_origin['PERÚ']

    for origen,tipos in zip(origin,tipo):
        if tipos == 'Importado':
            ages_by_origin[origen].append(origen)
            imported += 1

    for dict_key in ages_by_origin:
        average = (len(ages_by_origin[dict_key]) * 100) / imported
        dictionary[dict_key] = round(average,4)
    return dictionary

#####################################################################################################################

def casos(archivo):
    list_cases = [percentage_by_sex(file),percentage_by_deparment(file),percentage_by_origin(file)]
    return print(list_cases)






