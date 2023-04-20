
def squares():
    naturals_numbers_squared = [i**2 for i in range(1,101) if i % 2 == 1]
    print(naturals_numbers_squared)

def multiplies4():
    pass



if __name__ == '__main__':
    squares()
    multiplies4()