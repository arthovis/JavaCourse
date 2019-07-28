package com.sda.optional;

import java.util.Optional;

public class DemoOptionalIsPresent {
    public static void main(String[] args) {
        Optional<String> gender = Optional.of("Male");
        Optional<String> emptyGender = Optional.empty();

        if(gender.isPresent()){
            System.out.println("Value available");
        } else {
            System.out.println("Value not available.");
        }

        gender.ifPresent(foundGender -> System.out.println("Value available in gender"));
    }
}
