def ValidadorDeSenha(senha):
    senha_split = senha
    senha_split.split()

    numeros = 0
    maiuscula = 0
    especial = 0

    message_tamanho = 'A senha deve ter pelo menos 8 caracteres'
    message_numeros = 'A senha deve conter pelo menos 2 números'
    message_maiuscula = 'A senha deve conter pelo menos uma letra maiúscula'
    message_especial = 'A senha deve conter pelo menos um caractere especial'
    message = ''

    for cactere in senha:
        if cactere.isdigit():
            numeros += 1
        if cactere.isupper():
            maiuscula += 1
        if cactere.isalnum() == False:
            especial += 1


    if len(senha) < 8:
        message += message_tamanho 
        if numeros < 2:
            message += '\n' + message_numeros
        if maiuscula < 1:
            message += '\n' + message_maiuscula
        if especial < 1:
            message += '\n' + message_especial
        return message
    elif numeros < 2:
        message += message_numeros
        if maiuscula < 1:
            message += '\n' + message_maiuscula
        if especial < 1:
            message += '\n' + message_especial
        return message
    elif maiuscula < 1:
        message += message_maiuscula
        if especial < 1:
            message += '\n' + message_especial
        return message
    elif especial < 1:
        message += message_especial
        return message

texto = ValidadorDeSenha('ertvrtfvdA22ff')
print(texto)

    

    
    
