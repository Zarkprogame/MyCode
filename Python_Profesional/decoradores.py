from datetime import date, datetime

"""def decorador(func):
    def wrapper(*args, **kwargs):
        print('Realizacion del Calculo: ')
        func(*args, **kwargs)
        print('Calculo Finalizado.')
    return wrapper

@decorador
def suma(num1, num2, num3):
    print(num1 + num2 + num3)

@decorador
def resta(num1, num2):
    print(num1 - num2)

@decorador
def potencia(base, exponente):
    print(pow(base, exponente))

suma(5,6,7)

resta(30,20)

potencia(exponente = 2, base = 5)"""

def execution_time(func):
    def wrapper():
        initial_time = datetime.now()
        func()
        final_time = datetime.now()
        time_elapsed = final_time - initial_time
        print("Pasaron " + str(time_elapsed.total_seconds()) + " segundos")
    return wrapper

@execution_time
def random_func():
    for _ in range(1, 100000000):
        pass

random_func()