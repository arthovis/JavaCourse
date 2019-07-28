package com.sda.optional;

import java.util.Optional;

public class DemoOptionalFilter {
    public static void main(String[] args) {
        Optional<String> gender = Optional.of("MALE");
        Optional<String> emptyGender = Optional.empty();

        System.out.println(gender.filter(g -> g.equals("male"))); //Optional.empty
        System.out.println(gender.filter(g ->g.equalsIgnoreCase("male")));
    }
}
