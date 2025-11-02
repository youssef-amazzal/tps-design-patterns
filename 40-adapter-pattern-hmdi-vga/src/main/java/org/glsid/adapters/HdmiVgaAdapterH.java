package org.glsid.adapters;

import org.glsid.hardware.TV;
import org.glsid.hardware.Vga;

public class HdmiVgaAdapterH extends TV implements Vga {
    @Override
    public void print(String s) {
        byte[] bytes = s.getBytes();
        view(bytes);
    }
}
