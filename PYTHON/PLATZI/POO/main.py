from car import Car
from account import Account

if __name__ == "__main__":
    car = Car("ABC-1234", Account("John", "123.456.789-10"))
    print(vars(car))
    print(vars(car.driver))