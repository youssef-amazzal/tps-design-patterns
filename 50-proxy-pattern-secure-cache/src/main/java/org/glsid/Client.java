package org.glsid;

public class Client {
    private IService service;

    public double perform(double radius) {
        return service.compute(radius);
    }

    public void setService(IService service) {
        this.service = service;
    }
}
