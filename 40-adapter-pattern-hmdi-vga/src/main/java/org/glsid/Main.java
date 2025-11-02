package org.glsid;

import org.glsid.adapters.HdmiVgaAdapter;
import org.glsid.adapters.HdmiVgaAdapterH;
import org.glsid.hardware.*;

public class Main {
    public static void main(String[] args) {
        UniteCentre uc = new UniteCentre();

        System.out.println("================== Natively Compatible Devices ==================");
        uc.setVga(new Ecran());
        uc.print("The Youtube Video is Playing");
        uc.setVga(new VideoProjecteur());
        uc.print("The Presentation is projected");
        uc.setVga(new SuperVP());
        uc.print("The Movie is playing");
        System.out.println("=".repeat(65) + "\n\n");


        System.out.println("================== Compatible Devices Through Adapters ==================");
        HdmiVgaAdapterH hdmiVgaAdapterH = new HdmiVgaAdapterH();
        HdmiVgaAdapter hdmiVgaAdapter = new HdmiVgaAdapter(new SuperVP());
        uc.setVga(hdmiVgaAdapterH);
        uc.print("The Stream is Playing");
        uc.setVga(hdmiVgaAdapter);
        uc.print("The Movie is playing through HDMI Adapter");
        System.out.println("=".repeat(73));

    }
}