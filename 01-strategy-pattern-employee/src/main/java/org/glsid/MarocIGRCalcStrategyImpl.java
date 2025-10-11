package org.glsid;

public class MarocIGRCalcStrategyImpl implements IGRCalcStrategy {
    @Override
    public float calculerIGR(float salaireBrutAnuel) {

        if (salaireBrutAnuel >= 120000) return salaireBrutAnuel * 0.42f;
        if (salaireBrutAnuel >= 40000) return salaireBrutAnuel * 0.20f;
        return salaireBrutAnuel * 0.05f;
    }
}
