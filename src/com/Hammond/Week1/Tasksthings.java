package com.Hammond.Week1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Tasksthings {
    private List<Tasks> tasks = new LinkedList();

    Tasksthings() {
    }

    private Tasks createTask(String name, String description, int priority) {
        return new Tasks(name, description, priority);
    }

    public void addTask(String name, String description, int priority) {
        this.tasks.add(this.createTask(name, description, priority));
    }

    public void removeTask(int index) {
        if(this.tasks.size() > index) {
            this.tasks.remove(index);
        }

    }

    public void updateTask(int index, String name, String description, int priority) {
        this.tasks.set(index, this.createTask(name, description, priority));
    }

    public List<Tasks> getTasks() {
        return this.tasks;
    }

    public List<Tasks> getTasks(int priorty) {
        List<Tasks> matchedTasks = new LinkedList();
        Iterator var3 = this.tasks.iterator();

        while(var3.hasNext()) {
            Tasks task = (Tasks)var3.next();
            if(task.getPriority() == priorty) {
                matchedTasks.add(task);
            }
        }

        return matchedTasks;
    }
}
