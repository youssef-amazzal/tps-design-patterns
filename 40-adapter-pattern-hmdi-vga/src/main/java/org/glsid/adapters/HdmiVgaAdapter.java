package org.glsid.adapters;

import org.glsid.hardware.Hdmi;
import org.glsid.hardware.Vga;

public class HdmiVgaAdapter implements Vga {
    private Hdmi hdmi;
    public HdmiVgaAdapter(Hdmi hdmi) {
        this.hdmi = hdmi;
    }

    @Override
    public void print(String s) {
        byte[] bytes = s.getBytes();
        hdmi.view(bytes);
    }

    public void setHdmi(Hdmi hdmi) {
        this.hdmi = hdmi;
    }
}
