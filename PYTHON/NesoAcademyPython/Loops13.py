#Write a program that reads a positive integer N from the user and displays the following
#   *
#  * *
# *   *
#*******

def solution(user_number):
    for row in range(1, user_number + 1):
        for space in range(user_number - row):
            print(" ", end="")
        for star in range(1, 2 * row):
            if row == user_number:
                print("*", end="")
            else:
                if space == user_number or (row * 2)-1:
                    print("*", end="")
                else:
                    print(" ", end="")
        print("")

def run():
    user_number = int(input("Write a positive number: "))
    if user_number > 0:
        solution(user_number)
    else:
        print("A positive number!!!")

if __name__ == '__main__':
    run()