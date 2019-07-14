package com.sda.solid.single_responsability.Before;

import java.time.LocalDate;

public class Employee {
    private String id;
    private String name;
    private String address;
    private LocalDate joinDate;

    public boolean isPromotionDueThisYear(){
        //promotion logic
        return true;
    }

    public Double calculateTaxForCurrentYear(){
        //income tax logic
        return 0.0;
    }
}
