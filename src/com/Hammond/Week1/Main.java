package com.Hammond.Week1;
//Isaiah Hammond, CSCI 1660, 3-5-19
public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Tasksthings collection = new Tasksthings();
        ViewTask view = new ViewTask(collection);
        view.run();
    }
}

