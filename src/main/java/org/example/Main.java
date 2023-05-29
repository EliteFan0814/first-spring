package org.example;


import java.lang.reflect.Proxy;

public class Main {
    static DataService service = new DataServiceDecoratorCache(new DataServiceDecorator(new DataServiceImplement()));
    static DataService service1 = new DataServiceImplement();

    public static void main(String[] args) {
//        System.out.println(service.a(1));
//        System.out.println(service.a(1));
//        System.out.println(service.b(1));

        DataService dataService = (DataService) Proxy.newProxyInstance(
                service1.getClass().getClassLoader(),
                new Class[]{DataService.class},
                new LogProxy(service1));
        dataService.a(1);
        dataService.b(2);
    }
}
