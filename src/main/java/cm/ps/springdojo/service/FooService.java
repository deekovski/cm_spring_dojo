package cm.ps.springdojo.service;

import cm.ps.springdojo.service.impl.FooServiceImpl;

public interface FooService {

    String getMessage();

    static FooService createInstance(String message) {
        return new FooServiceImpl(message);
    }
}
