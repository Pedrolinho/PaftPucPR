from Exercício_1 import *
from Exercício_2 import *
from Exercício_3 import *
from Exercício_5 import *

# Exercício 1 - Exemplo

def test_Deve_Falhar_Quando_Numero_Menor_1():
    assert descrever_numero(-1) == 'Número inválido'


def test_Deve_Falhar_Quando_Numero_Maior_99():
    assert descrever_numero(100) == 'Em construção'


def test_Deve_Retornar_Unidades_Quando_Numero_1():
    assert descrever_numero(1) == '1 unidade'


def test_Deve_Retornar_1_Unidade_Quando_Numero_2_ao_9():
    for n in range(2, 10):
        assert descrever_numero(n) == f'{n} unidades'


def test_Deve_Retornar_Dezena_Quando_Numero_10():
    assert descrever_numero(10) == f'1 dezena'


def test_Deve_Retornar_Dezenas_Quando_Dezena_Exata():
    for n in range(20, 91, 10):
        assert descrever_numero(n) == f'{n//10} dezenas'


def test_Deve_Retornar_Dezenas_e_Unidades_Quando_Numero_99():
    assert descrever_numero(99) == '9 dezenas 9 unidades'


def test_Deve_Retornar_Dezenas_e_Unidade_Quando_Numero_1():
    assert descrever_numero(11) == '1 dezena 1 unidade'


# Exercício 2 - FizzBuzz

def test_Deve_Retornar_String_Quando_Numero_7():
    assert fizzBuzz(7) == '7'


def test_Deve_Retornar_Fizz_Quando_Numero_3():
    for n in range(3, 100, 3):
        assert 'Fizz' in fizzBuzz(n)


def test_Deve_Retornar_Buzz_Quando_Numero_5():
    for n in range(5, 101, 5):
        assert 'Buzz' in fizzBuzz(n)


def test_Deve_Retornar_FizzBuzz_Quando_Numero_15():
    assert fizzBuzz(15) == 'FizzBuzz'


# Exercício 3 - Validador de Senha

def test_Deve_Falhar_Quando_Caracteres_Menor_8():
    assert 'A senha deve ter pelo menos 8 caracteres' in ValidadorDeSenha('r')


def test_Deve_Falhar_Quando_Numeros_Menor_2():
    assert 'A senha deve conter pelo menos 2 números' in ValidadorDeSenha('njkv1ndjfvdkn')


def test_Deve_Mostrar_Multiplas_Falhas():
    assert 'A senha deve ter pelo menos 8 caracteres' and 'A senha deve conter pelo menos 2 números' in ValidadorDeSenha('er3')


def test_Deve_Falhar_Quando_Maiusculas_Menor_1():
    assert 'A senha deve conter pelo menos uma letra maiúscula' in ValidadorDeSenha('udhusd')


# Exercício 5 (Final) - Banco

def test_Deve_Mostrar_1000_Quando_Adicionar_1000():
    assert Conta.depositar(int(100)) == 'R$110,00 foi depositado ao saldo'


def test_Deve_Falhar_Quando_Adicionar_Número_Negativo():
    assert Conta.depositar(int(-3)) == 'Não é possível depositar um valor negativo'


def test_Deve_Falhar_Quando_Adicionar_0():
    assert Conta.depositar(int(0))  == 'Nenhum valor está sendo depositado'


def test_Deve_Falhar_Quando_Sacar_Mais_Que_O_Saldo():
    assert Conta.sacar(int(3535)) == 'Não há saldo suficiente para saque'


def test_Deve_Falhar_Quando_Sacar_Número_Negativo():
    assert Conta.sacar(int(-376558678575)) == 'Não é possível sacar um valor negativo'


def test_Deve_Mostrar_5_Quando_Sacar_5():
    assert Conta.sacar(int(5)) == 'R$5,00 foi retirado do saldo'


def test_Deve_Mostrar_Extrato_Quando_Chamar_Função():
    DATA = ['23/08/2022', '23/08/2022', '23/08/2022', '23/08/2022', '23/08/2022']
    QUANTIA = ['+R$100,00', '-R$5,00', '+R$100,00', '+R$100,00', '-R$50,00']
    SALDO = ['R$110,00', 'R$105,00', 'R$205,00', 'R$305,00', 'R$255,00']
    infos = list(zip(DATA, QUANTIA, SALDO))
    teste = pd.DataFrame(infos, columns=['DATA', 'QUANTIA', 'SALDO'])  

    assert Conta.imprimir().equals(teste) == True
