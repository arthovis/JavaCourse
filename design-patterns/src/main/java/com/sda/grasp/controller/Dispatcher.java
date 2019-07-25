package com.sda.grasp.controller;

public class Dispatcher {
    // imagine grabbing the input from the user
    StudentView studentView = new StudentView();
    HomeView homeView = new HomeView();
    // TODO: based on the request, show the correct view
    public void dispatch(String request) {
            if (request.equals("Student")){
                System.out.println(studentView);
            } else if (request.equals("Home")){
                System.out.println(homeView);
            }
    }
}
