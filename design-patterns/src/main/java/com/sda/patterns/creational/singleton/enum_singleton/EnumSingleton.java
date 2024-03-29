package com.sda.patterns.creational.singleton.enum_singleton;

public enum EnumSingleton {

    INSTANCE("Initial class info");

    private String info;

    // the constructor is private
    EnumSingleton(String info) {
        this.info = info;
    }

    public EnumSingleton getInstance() {
        return INSTANCE;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
