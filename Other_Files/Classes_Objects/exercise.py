class Animal:
    def __init__(self,nombre,sonido):
        self.nombre = nombre
        self.sonido = sonido

    def saludo(self):
        print('Hola, soy un', self.tipo, 'me llamo', self.nombre, 'y mi sonido es', self.sonido)

class Gato(Animal):
    tipo = 'gato'

class Perro(Animal):
    tipo = 'perro'

gato = Gato('SELMA', 'MIAW')
gato.saludo()

perro = Perro('ROCKE', 'GUAU')
perro.saludo()