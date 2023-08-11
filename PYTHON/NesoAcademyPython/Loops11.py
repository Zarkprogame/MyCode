#Write a program that reads a positive integer N from the user and displays the following
#1
#22
#333
#NNNN...N

def run():
    user_numer = int(input("Write a positive numer: "))

    if user_numer > 0:
        for i in range(1, user_numer + 1):
            for j in range(1, i + 1):
                print(i, end=" ")
            print("")
    else:
        print("A positive number!!!")

if __name__ == '__main__':
    run()