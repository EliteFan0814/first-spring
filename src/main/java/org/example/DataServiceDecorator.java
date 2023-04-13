package org.example;

import java.util.HashMap;

/**
 * 装饰器模式
 */
public class DataServiceDecorator implements DataService {
    private HashMap<String, String> cache = new HashMap<>();
    DataService dataService;

    public DataServiceDecorator(DataService dataService) {
        this.dataService = dataService;
    }

    @Override
    public String a(int i) {
        System.out.println("装饰器a");
        String val = dataService.a(1);
        return val;
    }

    @Override
    public String b(int i) {
        System.out.println("装饰器b");
        String val = dataService.a(1);
        return val;
    }
}
