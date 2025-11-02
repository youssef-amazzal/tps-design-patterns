package org.glsid.hardware;

public class UniteCentre {
    Vga vga;

    public void print(String s) {
        vga.print(s);
    }

    public void setVga(Vga vga) {
        this.vga = vga;
    }
}
