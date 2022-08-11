# Libraries
from Dark_TitleBar import *
from tkinter import *
import os

class App(Tk):

    LARGURA = 780
    ALTURA = 520

    pastaApp = os.path.dirname(__file__)

    def __init__(self):
        super().__init__()

        # Especificações e Aparência
        self.title("Dashboard Financeiro")
        self.geometry(f"{App.LARGURA}x{App.ALTURA}")
        self.resizable(False,False)
        self.configure(background='#36393f')
        self.iconbitmap('Projeto\\image\\porco.ico')
        
        # Frames
        abas = Frame(width=App.LARGURA*0.2,height=App.ALTURA).grid(row=0, column=0)

        layout = Frame(width=App.LARGURA*0.8,height=App.ALTURA, bg='#36393f').grid(row=0, column=1)

        # Subframe Layout
        layout_1 = Frame(layout, width=App.LARGURA*0.8, height=App.ALTURA*0.33333, bg='#36393f').grid(row=0, column=1, sticky="nswe")
        layout_2 = Frame(layout, width=App.LARGURA*0.8, height=App.ALTURA*0.33333, bg='#36393f').grid(row=1, column=1, sticky="nswe")
        layout_3 = Frame(layout, width=App.LARGURA*0.8, height=App.ALTURA*0.33333, bg='#36393f').grid(row=2, column=1, sticky="nswe")

        # Imagem
        img_logo = PhotoImage(file='Projeto\\image\\Logo GipeTech.png')
        
        

app = App()
dark_title_bar(app)
app.mainloop()