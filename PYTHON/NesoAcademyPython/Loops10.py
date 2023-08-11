#Write a program which finds if a string is a palindrome string or not

def run():
    user_text = input("Write some text: ")
    if user_text == user_text[::-1]:
        return True
    else:
        return False


if __name__ == '__main__':
    if run():
        print("Palindrome")
    else:
        print("Not Palindorme")