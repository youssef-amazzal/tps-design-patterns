package org.glsid;

import java.util.HashMap;
import java.util.Map;

public class ProxyCache implements IService {
    IService service;
    Map<Double, Double> cache = new HashMap<>();

    public ProxyCache(IService service) {
        this.service = service;
    }

    @Override
    public double compute(double radius) {
        if (cache.containsKey(radius)) {
            double area = cache.get(radius);
            System.out.println("org.glsid.ProxyCache::return cached value : " + area);
            return area;
        }

        double area = service.compute(radius);
        System.out.println("org.glsid.ProxyCache::return computed value : " + area);
        cache.put(radius, area);
        return area;
    }
}
