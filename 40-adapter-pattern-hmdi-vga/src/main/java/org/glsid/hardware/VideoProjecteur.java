package org.glsid.hardware;

public class VideoProjecteur implements Vga {
    @Override
    public void print(String s) {
        System.out.println("Video projecteur: " + s);
    }
}
