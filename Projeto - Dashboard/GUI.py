# Libraries
from Módulo_GUI import *
from tkinter import *
from time import *

class App(Tk):

    # Cores
    azul_bebe = '#EEF8F7'
    cinza_claro = '#777575'
    cinza_medio = '#A19B9B'
    cinza_escuro = '#434343'
    laranja = '#FF5606'

    # Dimensões
    D_GUI = [720, 520]                   # 720x520
    D_ABAS = [D_GUI[0]/4.5, 520]         # 160x520
    D_LAYOUT = [D_GUI[0]-D_ABAS[0], 520] # 560x520

    # Ativadores de Aba (condição inicial)
    portfolio = False
    transacoes = False
    cotacoes = False
    abasList_variable = [portfolio, transacoes, cotacoes]

    # Lista Crypto
    crypto_list = [['BTC', float(0)], ['ETH', float(0)], ['BNB', float(0)], ['USDT', float(0)], ['ADA', float(0)], ['DOT', float(0)], ['MATIC', float(0)], ['DOGE', float(0)], ['SOL', float(0)], ['SHIB', float(0)]]

    def __init__(self):
        super().__init__()

        # Especificações e Aparência da Janela
        self.title("Dashboard Financeiro")              # Modifica título na title bar
        self.geometry(f"{App.D_GUI[0]}x{App.D_GUI[1]}") # Modifica resolução
        self.resizable(False,False)                     # Bloqueia o resize
        self.configure(background=App.cinza_escuro)     # Modifica cor do backgroud
        self.iconbitmap('Projeto - Dashboard\\image\\porco.ico')    # Modifica o ícone
        dark_title_bar(self)                            # Modifica o tema da title bar para dark

        # Imagens
        self.img_port_inact      = PhotoImage(file='Projeto - Dashboard\\image\\aba buttons\\port_inactive.png')    # Botão do portfólio
        self.img_transac_inact   = PhotoImage(file='Projeto - Dashboard\\image\\aba buttons\\transac_inactive.png') # Botão do transações
        self.img_cot_inact       = PhotoImage(file='Projeto - Dashboard\\image\\aba buttons\\cot_inactive.png')     # Botão do cotações
        self.img_atualizar_cot   = PhotoImage(file='Projeto - Dashboard\\image\\aba buttons\\atualizar_cot.png')
        self.img_logo            = PhotoImage(file='Projeto - Dashboard\\image\\Logo.png')                          # Logo da GipeTech
        self.img_layout_porfolio = PhotoImage(file='Projeto - Dashboard\\image\\layouts\\Portfólio Layout.png')
        self.img_layout_cotacoes = PhotoImage(file='Projeto - Dashboard\\image\\layouts\\Cotações Layout.png')

        #### Frames - Inicialização
        self.abas   = Frame(self, width=App.D_ABAS[0],   height=App.D_ABAS[1],   bg=App.cinza_claro)  # Frame à esquerda com as abas disponíveis
        self.layout = Frame(self, width=App.D_LAYOUT[0], height=App.D_LAYOUT[1], bg=App.cinza_escuro) # Frame à direita com o layout de cada aba

        ## SubFrames Abas - Inicialização
        self.aba_1   = Frame(self.abas,  width=App.D_ABAS[0], height=App.D_ABAS[1]/3,     bg=App.cinza_claro) # Dividindo o frame à esquerda em dois frames
        self.aba_2   = Frame(self.abas,  width=App.D_ABAS[0], height=(App.D_ABAS[1]*2)/3, bg=App.cinza_claro)
        self.aba_1_1 = Frame(self.aba_1, width=App.D_ABAS[0], height=App.D_ABAS[1]/9,     bg=App.cinza_claro) # Dividindo o frame superior da esqueda em três frames
        self.aba_1_2 = Frame(self.aba_1, width=App.D_ABAS[0], height=App.D_ABAS[1]/9,     bg=App.cinza_claro)
        self.aba_1_3 = Frame(self.aba_1, width=App.D_ABAS[0], height=App.D_ABAS[1]/9,     bg=App.cinza_claro)

        # Buttons
        self.button_1 = Button(self.aba_1_1, image=self.img_port_inact,    command=lambda:App.TrocarAba(self, 'portfolio'),  bg=App.cinza_claro, fg=App.azul_bebe, anchor=CENTER, bd=0, activebackground=App.cinza_claro).grid(row=0, column=0, sticky=NSEW,padx=6, pady=(8,6)) # Botão portfólio
        self.button_2 = Button(self.aba_1_2, image=self.img_transac_inact, command=lambda:App.TrocarAba(self, 'transacoes'), bg=App.cinza_claro, fg=App.azul_bebe, anchor=CENTER, bd=0, activebackground=App.cinza_claro).grid(row=1, column=0, sticky=NSEW,padx=6, pady=10) # Botão transações
        self.button_3 = Button(self.aba_1_3, image=self.img_cot_inact,     command=lambda:App.TrocarAba(self, 'cotacoes'),   bg=App.cinza_claro, fg=App.azul_bebe, anchor=CENTER, bd=0, activebackground=App.cinza_claro).grid(row=2, column=0, sticky=NSEW,padx=6, pady=(8,6)) # Botão cotações
        
        ## SubFrames Abas - Grid
        self.aba_1_1.grid(row=0, column=0, sticky=NSEW)
        self.aba_1_2.grid(row=1, column=0, sticky=NSEW)
        self.aba_1_3.grid(row=2, column=0, sticky=NSEW)
        self.aba_1.grid(row=0, column=0, sticky=NSEW)
        self.aba_2.grid(row=1, column=0, sticky=NSEW)

        ## Subframes Layout - Inicialização
        self.layout_1 = Frame(self.layout, width=App.D_LAYOUT[0], height=App.D_LAYOUT[1]/3, bg=App.cinza_escuro)
        self.layout_2 = Frame(self.layout, width=App.D_LAYOUT[0], height=App.D_LAYOUT[1]/3, bg=App.cinza_escuro)
        self.layout_3 = Frame(self.layout, width=App.D_LAYOUT[0], height=App.D_LAYOUT[1]/3, bg=App.cinza_escuro)

        # Labels
        label_logo = Label(self.layout_2, width=App.D_LAYOUT[0], height=App.D_LAYOUT[1]/3, image=self.img_logo, bg=App.cinza_escuro) # Widget que mostra a foto da logo na tela inicial
        label_logo.grid(row=0, column=0, sticky=NSEW)

        ## Subframes Layout - Grid
        self.layout_1.grid(row=0, column=0, sticky=NSEW)
        self.layout_2.grid(row=1, column=0, sticky=NSEW)
        self.layout_3.grid(row=2, column=0, sticky=NSEW)

        #### Frames - Grid
        self.abas.grid  (row=0, column=0, sticky=NSEW)
        self.layout.grid(row=0, column=1, sticky=NSEW)

    def portfolio(self):
        self.layout = Frame(self, width=App.D_LAYOUT[0], height=App.D_LAYOUT[1], bg=App.cinza_escuro)
        self.label_1 = Label(self.layout, width=App.D_LAYOUT[0], height=App.D_LAYOUT[1], image=self.img_layout_porfolio, border=0).place(x=0,y=0) 
        self.layout.grid(row=0, column=1, sticky=NSEW)

    def transacoes(self):
        pass

    def cotacoes(self):
        self.layout = Frame(self, width=App.D_LAYOUT[0], height=App.D_LAYOUT[1], bg=App.cinza_escuro)
        
        self.label_1 = Label(self.layout, width=App.D_LAYOUT[0], height=App.D_LAYOUT[1], image=self.img_layout_cotacoes, border=0).place(x=0,y=0)

        # Cryptos
        self.btc   = Label(self.layout, text = f'{App.crypto_list[0][1]:,.5f}'.replace('.',','), bg=App.cinza_medio, fg=App.cinza_escuro, font=('verdana', '16')).place(x=315, y=101)
        self.eth   = Label(self.layout, text = f'{App.crypto_list[1][1]:,.5f}'.replace('.',','), bg=App.cinza_medio, fg=App.cinza_escuro, font=('verdana', '16')).place(x=315, y=134)
        self.bnb   = Label(self.layout, text = f'{App.crypto_list[2][1]:,.5f}'.replace('.',','), bg=App.cinza_medio, fg=App.cinza_escuro, font=('verdana', '16')).place(x=315, y=167)
        self.usdt  = Label(self.layout, text = f'{App.crypto_list[3][1]:,.5f}'.replace('.',','), bg=App.cinza_medio, fg=App.cinza_escuro, font=('verdana', '16')).place(x=315, y=200)
        self.ada   = Label(self.layout, text = f'{App.crypto_list[4][1]:,.5f}'.replace('.',','), bg=App.cinza_medio, fg=App.cinza_escuro, font=('verdana', '16')).place(x=315, y=233)
        self.dot   = Label(self.layout, text = f'{App.crypto_list[5][1]:,.5f}'.replace('.',','), bg=App.cinza_medio, fg=App.cinza_escuro, font=('verdana', '16')).place(x=315, y=266)
        self.matic = Label(self.layout, text = f'{App.crypto_list[6][1]:,.5f}'.replace('.',','), bg=App.cinza_medio, fg=App.cinza_escuro, font=('verdana', '16')).place(x=315, y=299)
        self.doge  = Label(self.layout, text = f'{App.crypto_list[7][1]:,.5f}'.replace('.',','), bg=App.cinza_medio, fg=App.cinza_escuro, font=('verdana', '16')).place(x=315, y=332)
        self.sol   = Label(self.layout, text = f'{App.crypto_list[8][1]:,.5f}'.replace('.',','), bg=App.cinza_medio, fg=App.cinza_escuro, font=('verdana', '16')).place(x=315, y=365)
        self.shib  = Label(self.layout, text = f'{App.crypto_list[9][1]:,.5f}'.replace('.',','), bg=App.cinza_medio, fg=App.cinza_escuro, font=('verdana', '16')).place(x=315, y=398)
        
        self.button_1 = Button(self.layout, image=self.img_atualizar_cot, command=lambda: App.AtualizarCot(self),  bg=App.cinza_escuro, anchor=CENTER, bd=0, activebackground=App.cinza_escuro).place(x=206, y=460)
        self.layout.grid(row=0, column=1, sticky=NSEW)

    # Repetição da Função Cotações ao atualizar os valores
    def new_cotacoes(self): 
        self.layout = Frame(self, width=App.D_LAYOUT[0], height=App.D_LAYOUT[1], bg=App.cinza_escuro)
        
        self.label_1 = Label(self.layout, width=App.D_LAYOUT[0], height=App.D_LAYOUT[1], image=self.img_layout_cotacoes, border=0).place(x=0,y=0)
        # Cryptos
        self.btc   = Label(self.layout, text = f'{App.crypto_list[0][1]:_}'.replace('.',',').replace('_','.'), bg=App.cinza_medio, fg=App.cinza_escuro, font=('verdana', '16')).place(x=315, y=101)
        self.eth   = Label(self.layout, text = f'{App.crypto_list[1][1]:_.2f}'.replace('.',',').replace('_','.'), bg=App.cinza_medio, fg=App.cinza_escuro, font=('verdana', '16')).place(x=315, y=134)
        self.bnb   = Label(self.layout, text = f'{App.crypto_list[2][1]:_}'.replace('.',',').replace('_','.'), bg=App.cinza_medio, fg=App.cinza_escuro, font=('verdana', '16')).place(x=315, y=167)
        self.usdt  = Label(self.layout, text = f'{App.crypto_list[3][1]:_.3f}'.replace('.',',').replace('_','.'), bg=App.cinza_medio, fg=App.cinza_escuro, font=('verdana', '16')).place(x=315, y=200)
        self.ada   = Label(self.layout, text = f'{App.crypto_list[4][1]:_.3f}'.replace('.',',').replace('_','.'), bg=App.cinza_medio, fg=App.cinza_escuro, font=('verdana', '16')).place(x=315, y=233)
        self.dot   = Label(self.layout, text = f'{App.crypto_list[5][1]:_.2f}'.replace('.',',').replace('_','.'), bg=App.cinza_medio, fg=App.cinza_escuro, font=('verdana', '16')).place(x=315, y=266)
        self.matic = Label(self.layout, text = f'{App.crypto_list[6][1]:_.3f}'.replace('.',',').replace('_','.'), bg=App.cinza_medio, fg=App.cinza_escuro, font=('verdana', '16')).place(x=315, y=299)
        self.doge  = Label(self.layout, text = f'{App.crypto_list[7][1]:_.4f}'.replace('.',',').replace('_','.'), bg=App.cinza_medio, fg=App.cinza_escuro, font=('verdana', '16')).place(x=315, y=332)
        self.sol   = Label(self.layout, text = f'{App.crypto_list[8][1]:_.1f}'.replace('.',',').replace('_','.'), bg=App.cinza_medio, fg=App.cinza_escuro, font=('verdana', '16')).place(x=315, y=365)
        self.shib  = Label(self.layout, text = f'{App.crypto_list[9][1]:_.7f}'.replace('.',',').replace('_','.'), bg=App.cinza_medio, fg=App.cinza_escuro, font=('verdana', '16')).place(x=315, y=398)
        
        self.button_1 = Button(self.layout, image=self.img_atualizar_cot, command=lambda: App.AtualizarCot(self),  bg=App.cinza_escuro, anchor=CENTER, bd=0, activebackground=App.cinza_escuro).place(x=206, y=460)
        self.layout.grid(row=0, column=1, sticky=NSEW)
    # Função que apaga o frame à direita que está em visualização e atualiza o layout com a aba selecionada
    def AtualizarAba(self, abasList_variable):
        if abasList_variable[0] == True:
            self.layout.destroy()
            App.portfolio(self)

        elif abasList_variable[1] == True:
            self.layout.destroy()
            App.transacoes(self)

        elif abasList_variable[2] == True:
            self.layout.destroy()
            App.cotacoes(self)

    # Função que atualiza o valor dos ativadores de aba
    def AtualizarBool(aba):
        abasList_bool = AtivarAba(aba)
        x = 0
        for aba in abasList_bool:
            App.abasList_variable[x] = aba
            x += 1
        return App.abasList_variable
            
    # Função comando dos botões, recebe a aba selecionada e executa a troca de abas
    def TrocarAba(self, aba):
        abasList_variable = App.AtualizarBool(aba)
        App.AtualizarAba(self, abasList_variable)

    def cryptoPrices(crypto_list):
        for crypto in crypto_list:  
            crypto[1] = priceCoin(crypto[0])
        return App.crypto_list

    def AtualizarCot(self):
        App.crypto_list = App.cryptoPrices(App.crypto_list)
        self.layout.destroy
        App.new_cotacoes(self)
        

        
app = App()
app.mainloop()