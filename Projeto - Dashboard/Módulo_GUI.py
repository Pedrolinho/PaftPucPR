import ctypes as ct
import requests
from tkinter import *


# Função que modifica o tema da title bar
# Referência: https://gist.github.com/Olikonsti/879edbf69b801d8519bf25e804cec0aa
def dark_title_bar(window):
    window.update()
    DWMWA_USE_IMMERSIVE_DARK_MODE = 20
    set_window_attribute = ct.windll.dwmapi.DwmSetWindowAttribute
    get_parent = ct.windll.user32.GetParent
    hwnd = get_parent(window.winfo_id())
    rendering_policy = DWMWA_USE_IMMERSIVE_DARK_MODE
    value = 2
    value = ct.c_int(value)
    set_window_attribute(hwnd, rendering_policy, ct.byref(value), ct.sizeof(value))  

# Função que muda o valor bool dos ativadores de aba
def AtivarAba(aba):
        if aba == 'portfolio':
            portfolio = True
            transacoes = False
            cotacoes = False
            print('Portfólio foi acessado')
            abas_list = [portfolio, transacoes, cotacoes]
            return abas_list
        elif aba == 'transacoes':
            portfolio = False
            transacoes = True
            cotacoes = False
            print('Transações foi acessado')
            abas_list = [portfolio, transacoes, cotacoes]
            return abas_list
        elif aba == 'cotacoes':
            portfolio = False
            transacoes = False
            cotacoes = True   
            print('Cotações foi acessado')
            abas_list = [portfolio, transacoes, cotacoes]
            return abas_list

def priceCoin(moeda):
    base = 'BRL'
    simbolo = moeda + base
    url = f'https://api.binance.com/api/v3/ticker/price?symbol={simbolo}'
    
    requisição = requests.get(url)
    resposta = requisição.json()

    preço = float(resposta['price'])

    return preço