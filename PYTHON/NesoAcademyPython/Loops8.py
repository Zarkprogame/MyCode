#Write a program which displays a string with a space after each character

text = input('WRITE A STRING: ')
new_text = ''

for word in text:
    new_text += word + " "

print(new_text)