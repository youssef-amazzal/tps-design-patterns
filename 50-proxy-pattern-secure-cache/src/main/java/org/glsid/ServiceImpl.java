package org.glsid;

public class ServiceImpl implements IService {
    @Override
    public double compute(double radius) {
        return Math.PI * radius * radius;
    }
}
