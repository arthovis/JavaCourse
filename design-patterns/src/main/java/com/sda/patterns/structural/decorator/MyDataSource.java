package com.sda.patterns.structural.decorator;

public interface MyDataSource {
    public void writeData(String data);

    public String readData();
}
