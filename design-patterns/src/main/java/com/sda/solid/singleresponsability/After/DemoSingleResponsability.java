package com.sda.solid.singleresponsability.After;

public class DemoSingleResponsability {
    public static void main(String[] args) {
        HRPromotions hrPromotions = new HRPromotions();
        TaxCalculations taxCalculations = new TaxCalculations();

        Employee employee = new Employee();
        hrPromotions.isPromotionDueThisYear(employee);
        taxCalculations.calculateTaxForCurrentYear(employee);
    }
}
