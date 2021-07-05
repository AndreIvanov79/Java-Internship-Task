package main.java.secondTask;

import java.util.LinkedList;

public class User {
    private String firstName;
    private String lastName;
    private String userName;
    int taskCounter=0;
    LinkedList<Task> myTasks;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public User(String firstName, String lastName, String userName, LinkedList<Task> myTasks){
        this.firstName=firstName;
        this.lastName=lastName;
        this.userName=userName;
        myTasks=new LinkedList<>();
    }

    public User(){}

    @Override
    public String toString() {
        return this.firstName+", "+this.lastName+", "+taskCounter;
    }

}
