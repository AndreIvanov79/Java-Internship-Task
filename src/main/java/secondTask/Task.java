package main.java.secondTask;

public class Task {
    private String taskTitle;
    private String description;

    public String getTaskTitle() {
        return taskTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Task(String taskTitle, String description){
        this.taskTitle=taskTitle;
        this.description=description;
    }

    @Override
    public String toString() {
        return getTaskTitle()+getDescription();
    }
}
