package com.sda.patterns.structural.decorator;

public class EncryptionDecorator extends DataSourceDecorator {
    public EncryptionDecorator(MyDataSource wrapee) {
        super(wrapee);
    }

    //mai trebuie adaugate chestii (nu am apucat sa scriu)
}
