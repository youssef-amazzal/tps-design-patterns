package org.glsid;

public class SecuredProxy implements IService {
    private IService service;
    private String password;

    public SecuredProxy(IService service) {
        this.service = service;
    }

    @Override
    public double compute(double radius) throws RuntimeException {
        if (!password.equals("12345"))
            throw new RuntimeException("401::Unauthorized Access");

        return service.compute(radius);
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setService(IService service) {
        this.service = service;
    }
}
