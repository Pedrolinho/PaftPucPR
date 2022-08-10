from Dark_TitleBar import *
from tkinter import *

class App(Tk):

    LARGURA = 780
    ALTURA = 520

    def __init__(self):
        super().__init__()

        # Especificações 
        self.title("Dashboard Financeiro")
        self.geometry(f"{App.LARGURA}x{App.ALTURA}")
        self.resizable(False,False)
        self.configure(background='#36393f')

app = App()
dark_title_bar(app)
app.mainloop()