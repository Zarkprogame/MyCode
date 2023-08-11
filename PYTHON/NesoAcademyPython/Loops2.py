#Write a Program which reads a sequence of integers from the user and stop by displaying "Done" When the sum
#of these valuers exceeds 100

def run():
    user_number = int(input("Write a number: "))
    for sum in range(0, sum <= 100):
        if sum > 100:
            print("Done")

if __name__ == '__main__':
    run()


sum_numbers = 0
while sum_numbers <= 100:
    sum_numbers += int(input("Put a Integer Number: "))
    if sum_numbers > 100:
        print("Done")

