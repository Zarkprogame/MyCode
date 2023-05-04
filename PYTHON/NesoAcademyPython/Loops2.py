#Write a Program which reads a sequence of integers from the user and stop by displaying "Done" When the sum
#of these valuers exceeds 100

sum_numbers = 0
while sum_numbers <= 100:
    sum_numbers += int(input("Put a Integer Number: "))
    if sum_numbers > 100:
        print("Done")

