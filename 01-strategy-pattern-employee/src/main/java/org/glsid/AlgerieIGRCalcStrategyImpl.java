package org.glsid;

public class AlgerieIGRCalcStrategyImpl implements IGRCalcStrategy {
    @Override
    public float calculerIGR(float salaireBrutAnuel) {
        return salaireBrutAnuel * 0.35f;
    }
}
