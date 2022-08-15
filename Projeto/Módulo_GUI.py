import ctypes as ct
from tkinter import *

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

def AtivarAba(aba):
        if aba == 'portfolio':
            transacoes = False
            cotacoes = False
            dashboard = True
            print('Portfólio foi acessado')
        elif aba == 'transacoes':
            dashboard = False
            cotacoes = False
            transacoes = True
            print('Transações foi acessado')
        elif aba == 'cotacoes':
            dashboard = False
            transacoes = False
            cotacoes = True   
            print('Cotações foi acessado')
