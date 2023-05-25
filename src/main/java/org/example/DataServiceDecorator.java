package org.example;

import java.util.HashMap;

/**
 * 装饰器模式
 */
public class DataServiceDecorator implements DataService {
    DataService dataService;

    public DataServiceDecorator(DataService dataService) {
        this.dataService = dataService;
    }

    @Override
    public String a(int i) {
        System.out.println("装饰器模式：来自a方法");
        String val = dataService.a(1);
        return val;
    }

    @Override
    public String b(int i) {
        System.out.println("装饰器模式：来自b方法");
        String val = dataService.a(1);
        return val;
    }
}
