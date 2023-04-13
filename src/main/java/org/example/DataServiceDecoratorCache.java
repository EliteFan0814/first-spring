package org.example;

import java.util.HashMap;

public class DataServiceDecoratorCache implements DataService {
    private HashMap<String, String> cache = new HashMap<>();
    DataService dataService;

    public DataServiceDecoratorCache(DataService dataService) {
        this.dataService = dataService;
    }

    @Override
    public String a(int i) {
        String cacheValue = cache.get("a");
        if (cacheValue == null) {
            System.out.println("装饰器a");
            String val = dataService.a(1);
            cache.put("a", val);
            return val;
        } else {
            return cacheValue;
        }
    }

    //缓存器
    @Override
    public String b(int i) {
        String cacheValue = cache.get("b");
        if (cacheValue == null) {
            System.out.println("装饰器b");
            String val = dataService.a(1);
            cache.put("a", val);
            return val;
        } else {
            return cacheValue;
        }
    }
}
