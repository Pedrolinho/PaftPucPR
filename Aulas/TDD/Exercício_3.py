def ValidadorDeSenha(senha):
    if senha.count(senha) < 8:
        return 'A senha deve ter pelo menos 8 caracteres'
