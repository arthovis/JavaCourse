package com.sda.patterns.structural.decorator;

public class DataSourceDecorator implements MyDataSource {
    private MyDataSource wrapee;


    public DataSourceDecorator(MyDataSource wrapee) {
        this.wrapee = wrapee;
    }

    @Override
    public void writeData(String data){
        wrapee.writeData(data);
    }

    @Override
    public String readData(){
        return wrapee.readData();
    }
}
