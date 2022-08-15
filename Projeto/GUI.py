# Libraries
from Módulo_GUI import *
from tkinter import *
from time import *

class App(Tk):

    # Cores
    azul_bebe = '#EEF8F7'
    cinza_claro = '#777575'
    cinza_escuro = '#434343'
    laranja = '#FF5606'

    # Dimensões
    D_GUI = [720, 520]
    D_ABAS = [D_GUI[0]/4.5, 520]
    D_LAYOUT = [D_GUI[0]-D_ABAS[0], 520]

    # Outros
    dashboard = False
    transacoes = False
    cotacoes = False

    def __init__(self):
        super().__init__()

        # Especificações e Aparência
        self.title("Dashboard Financeiro")
        self.geometry(f"{App.D_GUI[0]}x{App.D_GUI[1]}")
        self.resizable(False,False)
        self.configure(background='#36393f')
        self.iconbitmap('Projeto\\image\\porco.ico')
        dark_title_bar(self) # Módulo_GUI

        # Imagens
        self.img_port_inact    = PhotoImage(file='Projeto\\Image\\aba buttons\\port_inactive.png')
        self.img_transac_inact = PhotoImage(file='Projeto\\Image\\aba buttons\\transac_inactive.png')
        self.img_cot_inact     = PhotoImage(file='Projeto\\Image\\aba buttons\\cot_inactive.png')

        #### Frames - Inicialização
        self.abas   = Frame(self, width=App.D_ABAS[0],   height=App.D_ABAS[1],   bg=App.cinza_claro)
        self.layout = Frame(self, width=App.D_LAYOUT[0], height=App.D_LAYOUT[1], bg=App.cinza_escuro)

        ## SubFrames Abas - Inicialização
        self.aba_1   = Frame(self.abas,  width=App.D_ABAS[0], height=App.D_ABAS[1]/3,     bg=App.cinza_claro)
        self.aba_2   = Frame(self.abas,  width=App.D_ABAS[0], height=(App.D_ABAS[1]*2)/3, bg=App.cinza_claro)
        self.aba_1_1 = Frame(self.aba_1, width=App.D_ABAS[0], height=App.D_ABAS[1]/9,     bg=App.cinza_claro)
        self.aba_1_2 = Frame(self.aba_1, width=App.D_ABAS[0], height=App.D_ABAS[1]/9,     bg=App.cinza_claro)
        self.aba_1_3 = Frame(self.aba_1, width=App.D_ABAS[0], height=App.D_ABAS[1]/9,     bg=App.cinza_claro)

        # Buttons
        self.button_1 = Button(self.aba_1_1, image=self.img_port_inact,    command=lambda:AtivarAba('portfolio'),  bg=App.cinza_claro, fg=App.azul_bebe, anchor=CENTER, bd=0, activebackground=App.cinza_claro).grid(row=0, column=0, sticky=NSEW, padx=5, pady=8) # Módulo_GUI
        self.button_2 = Button(self.aba_1_2, image=self.img_transac_inact, command=lambda:AtivarAba('transacoes'), bg=App.cinza_claro, fg=App.azul_bebe, anchor=CENTER, bd=0, activebackground=App.cinza_claro).grid(row=1, column=0, sticky=NSEW, padx=5, pady=8) # Módulo_GUI
        self.button_3 = Button(self.aba_1_3, image=self.img_cot_inact,     command=lambda:AtivarAba('cotacoes'),   bg=App.cinza_claro, fg=App.azul_bebe, anchor=CENTER, bd=0, activebackground=App.cinza_claro).grid(row=2, column=0, sticky=NSEW, padx=5, pady=8) # Módulo_GUI
        
        ## SubFrames Abas - Grid
        self.aba_1_1.grid(row=0, column=0, sticky=NSEW)
        self.aba_1_2.grid(row=1, column=0, sticky=NSEW)
        self.aba_1_3.grid(row=2, column=0, sticky=NSEW)
        self.aba_1.grid(row=0, column=0, sticky=NSEW)
        self.aba_2.grid(row=1, column=0, sticky=NSEW)

        ## Subframes Layout - Inicialização
        

        #### Frames - Grid
        self.abas.grid(row=0, column=0, sticky=NSEW)
        self.abas.grid(row=0, column=1, sticky=NSEW)

           

app = App()
app.mainloop()