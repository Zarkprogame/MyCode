#Write a Program which prints the even numbers between 1 and 100 in an increasing order

def run():
    for number in range(101):
        if (number % 2) == 0:
            print(number)

if __name__ == '__main__':
    run()

#Write a Program which prints the even numbers between 1 and 100 in an decreasing order

# number = 100
# while number > 0:
#     if (number % 2) == 0:
#         print(number)
#     number -= 1