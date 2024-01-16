# gui participation tepmp converter
# C = (F-32)* 5/9

import tkinter
import tkinter.messagebox

class TempConverterGui:
    def __init__(self):
        # making window
        self.main_window=tkinter.Tk()

        # making top and botom frame
        self.top_frame = tkinter.Frame(self.main_window)
        self.middle_frame = tkinter.Frame(self.main_window)
        self.bottom_frame = tkinter.Frame(self.main_window)

        # making top frame widget
        self.prompt_label = tkinter.Label(self.top_frame,
                                          text = "enter tempature in F")

        self.fahr_entry = tkinter.Entry (self.top_frame,
                                         width = 10)

        self.prompt_label.pack(side = "left")

        self.fahr_entry.pack(side = "left")

        self.descr_label = tkinter.Label(self.middle_frame,
                                         text = "converted celcius")

        #We create a string var object with an output label
        # to store the blank character

        self.value = tkinter.stringVar()

        sef.cels_label = tkinter.label(self.middle_frame,
                                       textvariable = self.value)

        self.conv_buttton = tkinter.Button(self.bottom_frame,
                                           text = "Convert",
                                           command = self.convert())

        self.quit_button = tkinter.Button(self.bottom_frame,
                                           text = "Quit",
                                           command = self.main_window.destroy)

        self.conv_button.pack(side = "top")

        self.quit_button.pack(side = "top")

        self.top_frame.pack()
        self.middleframe.pack()
        self.bottom_frame.pack()

        # main loop

        tkinter.mainloop()

        # function that converts when buton pressed

        def conver(self):
            # get value from user
            fahr = float(self.fahr_entry.get())
            #Convert Farenhit to celcius
            cel = (fahr-32)*5/9

            self.value.set(cel)
            tkinter.messagebox.showinfo("Results",
                                        str(fahr)+"Farenhire = " + str(cel)+"Celcius")

        fahr_conv = TempConverterGui()


