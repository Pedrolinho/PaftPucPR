oi = 'j34c32'
print(len(oi))

ola = 'JSCRT34T@@@HRT2HH'
x = 0
y = 0

for caractere in ola:
    if caractere.isupper():
        x += 1
    if caractere.isalnum() == False:
        y += 1

print(f'{x}, {y}')

numero = 838

print(type(numero))

if type(numero) == int:
    print('ola')