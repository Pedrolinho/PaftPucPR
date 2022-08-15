from tkinter import *

root = Tk()

root.geometry('500x500')

frame_4 = Frame(root)
frame_3 = Frame(root)
frame_2 = Frame(root)
frame_1 = Frame(root)

button_1 = Button(frame_2, text='Click 1').grid()
button_2 = Button(frame_3, text='Click 2').grid()
button_3 = Button(frame_1, text='Click 3').grid()
button_4 = Button(frame_4, text='Click 4').grid()

frame_4.grid(row=0, column=0)
frame_3.grid(row=1, column=0)
frame_2.grid(row=2, column=0)
frame_1.grid(row=3, column=0)

root.mainloop()