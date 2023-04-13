package org.example;

import java.util.UUID;

public class DataServiceImplement implements DataService {

    @Override
    public String a(int i) {
        return UUID.randomUUID().toString();
    }

    @Override
    public String b(int i) {
        return UUID.randomUUID().toString();
    }
}
