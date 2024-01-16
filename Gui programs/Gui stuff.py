#Gui

import tkinter

class MyGUI:
    def __init__(self):
        #make main window

        self.main_window=tkinter.Tk()


        #create widget in window
        self.label1=tkinter.Label(self.main_window,
                                text = "Python Gui program")
        self.label2=tkinter.Label(self.main_window,
                                    text = "CSIS2101")

        #call pack method
        self.label1.pack()
        self.label2.pack()
        # enter the tkinter main loop

        tkinter.mainloop()
    print("process complete")
if __name__ == "__main__":
    mygui = MyGUI
