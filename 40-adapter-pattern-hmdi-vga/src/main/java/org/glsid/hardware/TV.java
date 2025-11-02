package org.glsid.hardware;

public class TV implements Hdmi {

    @Override
    public void view(byte[] bytes) {
        System.out.println("TV view: " + new String(bytes));
    }
}
