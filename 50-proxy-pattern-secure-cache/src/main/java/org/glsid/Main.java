package org.glsid;

public class Main {
    public static void main(String[] args) {
        IService service = new ServiceImpl();
        ProxyCache cacheProxy = new ProxyCache(service);
        SecuredProxy securedProxy = new SecuredProxy(service);

        Client client = new Client();

        System.out.println("=".repeat(15));
        System.out.printf("%10s%n", "Cache");
        System.out.println("=".repeat(15));

        client.setService(cacheProxy);
        System.out.println("1st try Result: "+ client.perform(36));
        System.out.println("2nd try Result: "+ client.perform(36));

        System.out.println("=".repeat(15));
        System.out.printf("%11s%n", "Secured");
        System.out.println("=".repeat(15));

        securedProxy.setPassword("password");
        try {
            client.setService(securedProxy);
            System.out.println("1st try Result: "+ client.perform(28));
        } catch (RuntimeException e) {
            System.out.println("1st try failed: " + e.getMessage());
        }
        securedProxy.setPassword("12345");
        client.setService(securedProxy);
        System.out.println("2st try Result: "+ client.perform(29));
    }
}
