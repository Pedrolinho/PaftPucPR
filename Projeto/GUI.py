# Libraries
from Módulo_GUI import *
from tkinter import *
import os
from time import *

class App(Tk):

    LARGURA = 780
    ALTURA = 520
    dashboard = False
    transacoes = False
    cotacoes = False

    def __init__(self):
        super().__init__()

        # Especificações e Aparência
        self.title("Dashboard Financeiro")
        self.geometry(f"{App.LARGURA}x{App.ALTURA}")
        self.resizable(False,False)
        self.configure(background='#36393f')
        self.iconbitmap('Projeto\\image\\porco.ico')
        dark_title_bar(self) # Módulo_GUI
        
        # Grid Layout
        self.grid_columnconfigure(1, weight=1)
        self.grid_rowconfigure(0, weight=1)

        # Frames
        self.abas = Frame(width=App.LARGURA/5).grid(row=0, column=0, sticky='nswe')
        self.layout = Frame(bg='#36393f').grid(row=0, column=1)

        # Subframe Abas
        self.button_1 = Button(self, text='Dashboard', command=lambda:AtivarAba('dashboard')).grid(row=0, column=0, sticky='nswe') # Módulo_GUI
        self.button_2 = Button(self, text='Transações', command=lambda:AtivarAba('transacoes')).grid(row=1, column=0, sticky='nswe') # Módulo_GUI
        self.button_3 = Button(self, text='Cotações', command=lambda:AtivarAba('cotacoes')).grid(row=2, column=0, sticky='nswe') # Módulo_GUI

        # Subframe Layout
        self.layout_1 = Frame(self.layout, width=App.LARGURA*0.8, height=App.ALTURA*0.33333, bg='#36393f').grid(row=0, column=1, sticky="nswe")
        self.layout_2 = Frame(self.layout, width=App.LARGURA*0.8, height=App.ALTURA*0.33333, bg='#36393f').grid(row=1, column=1, sticky="nswe")
        self.layout_3 = Frame(self.layout, width=App.LARGURA*0.8, height=App.ALTURA*0.33333, bg='#36393f').grid(row=2, column=1, sticky="nswe")

        # Imagem
        self.img_logo = PhotoImage(file='Projeto\\image\\Logo GipeTech.png')
        self.label_1 = Label(self.layout_1, image=self.img_logo, bg='#36393f').grid(row=0, column=1, sticky='nswe')
    
app = App()
app.mainloop()