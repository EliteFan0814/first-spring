package org.example;


public class Main {
    static DataService service = new DataServiceDecoratorCache(new DataServiceDecorator(new DataServiceImplement()));
    public static void main(String[] args) {
        System.out.println(service.a(1));
        System.out.println(service.a(1));
        System.out.println(service.b(1));
    }
}
