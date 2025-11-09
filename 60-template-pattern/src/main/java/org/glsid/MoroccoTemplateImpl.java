package org.glsid;

public class MoroccoTemplateImpl extends Template{
    @Override
    protected int param1() {
        return 4;
    }

    @Override
    protected double compute(int a, int b) {
        return Math.sqrt(a*a + b*b);
    }
}
