from Exercício_1 import *
from Exercício_2 import *
from Exercício_3 import *

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