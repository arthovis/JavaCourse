package com.sda.grasp.controller;

public class FrontController {
    Dispatcher dispatcher = new Dispatcher();
    public void dispatchRequest(String request) {
        // TODO track request

        // TODO: authenticate the user
    }

    private boolean isAuthenticUser() {
        System.out.println("User is authenticated successfully.");
        return true;
    }

    private void trackRequest(String request) {
        System.out.println("Page requested: " + request);
    }
}
