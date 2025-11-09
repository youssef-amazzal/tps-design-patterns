package org.glsid;

public class SpainTemplateImpl extends Template{
    @Override
    protected int param1() {
        return 8;
    }

    @Override
    protected double compute(int a, int b) {
        return a*b;
    }
}
