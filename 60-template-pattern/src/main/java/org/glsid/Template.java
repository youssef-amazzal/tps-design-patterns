package org.glsid;

public abstract class Template {

    public double perform(int a, int b){
        int n = param1();
        double sum =0;
        for (int i =0 ; i<n;i++){
            double step1 = compute(a,b);
            sum+=step1;
        }
        return sum;
    }

    protected abstract int param1();
    protected abstract double compute(int a, int b);
}
