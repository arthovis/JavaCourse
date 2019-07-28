package com.sda.optional;

import java.util.Optional;

public class DemoOptional {
    public static void main(String[] args) {
        Optional<String> gender = Optional.of("Male");
        String answer1 = "Yes";
        String answer2 = null;

        System.out.println("Non-Empty Optional: "+gender);
        System.out.println("Non-Empty Optional: Gender value: "+gender.get());

        System.out.println("\nofNullable on Non-Empty Optional: "+Optional.ofNullable(answer1));
        System.out.println("ofNullable on Empty Optional: "+Optional.ofNullable(answer2));

    }
}
