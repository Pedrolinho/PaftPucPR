# Exercício Exemplo de Aula

def descrever_numero(n):
    resultado = ''

    if n < 1:
        resultado = 'Número inválido'
    elif n > 99:
        resultado = 'Em construção'
    else:
        d = n // 10

        if d == 1:
            resultado = f'{d} dezena'
        elif 0 < d <= 9:
            resultado = f'{d} dezenas'

        n = n % 10

        if d != 0 and n != 0:
            resultado += f' '

        if n == 1:
            resultado += f'{n} unidade'
        elif 0 < n <= 9:
            resultado += f'{n} unidades'

    return resultado