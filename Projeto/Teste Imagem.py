from ctypes import sizeof
from tkinter import *
import os

root = Tk()

root.geometry('500x500')
imagem = PhotoImage(file='Projeto\\image\\Logo GipeTech.png')
label = Label(root, image=imagem,).place(x=100, y=100)
root.mainloop()