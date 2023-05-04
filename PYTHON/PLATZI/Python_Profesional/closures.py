def make_multiplier(x):
    def multiplier(n):
        return x * n
    return multiplier


def nombre(name: str):
    assert type(name) == str, "Solo Cadenas"
    def reps(reps: int):
        return name * reps
    return reps


def make_division_by(n):
    def division(x):
        return x / n
    return division


def run():
    nombre1 = nombre("Camilo")
    print(nombre1(5))

    x10 = make_multiplier(10)
    print(x10(3))

    division_by_18 = make_division_by(18)
    print(division_by_18(54))

if __name__ == "__main__":
    run()
