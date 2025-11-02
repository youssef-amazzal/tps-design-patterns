package org.glsid.hardware;

public class SuperVP implements Vga, Hdmi {
    @Override
    public void view(byte[] bytes) {
        System.out.println("SuperVP view: " + new String(bytes));
    }

    @Override
    public void print(String s) {
        System.out.println("SuperVP print: " + s);
    }
}
