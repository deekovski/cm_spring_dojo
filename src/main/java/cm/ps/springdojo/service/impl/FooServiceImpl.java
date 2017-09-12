package cm.ps.springdojo.service.impl;

import cm.ps.springdojo.service.FooService;


public class FooServiceImpl implements FooService {

    private String message = "default";

    @Override
    public String getMessage() {
        return message;
    }

    public FooServiceImpl(String message) {
        this.message = message;
    }
}
