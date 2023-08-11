#Write a program that reads a positive integer N from the user and displays the following
#   *
#  ***
# *****
#*******

def first_solution(user_number):
    for i in range(1, user_number + 1):
        for j in reversed(range(1,user_number + 1)):
            if j > i:
                print(" ", end="")
            else:
                print("*", end="")                
        print("")


def second_solution(user_number):
    for row in range(1, user_number + 1):
        for space in range(user_number - row):
            print(" ", end="")
        
        for stars in range(1, 2 * row):
            print("*", end="")
            
        print("")
    

def run():
    user_number = int(input("Write a positive number: "))
    if user_number > 0:
        first_solution(user_number)
        second_solution(user_number)
    else:
        print("A positive number!!!")


if __name__ == '__main__':
    run()