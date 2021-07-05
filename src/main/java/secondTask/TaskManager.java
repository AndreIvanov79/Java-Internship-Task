package main.java.secondTask;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static java.nio.charset.StandardCharsets.ISO_8859_1;

public class TaskManager {
    ArrayList<User> listOfUsers=new ArrayList<>();
    public void addUserToList(User user, ArrayList list){
        list.add(user);
    }

    public void showAllUsers(ArrayList list){
        for (Object user: list){
            System.out.println(user.toString());
        }
    }

    public void addTaskToUser(User user, Task task){
        user.myTasks.add(task);
        user.taskCounter++;
    }

    public void showUserTasks(User user){
        for (Task task: user.myTasks)
            System.out.println(task);
    }

    public static void writeFile(User user, String filePath) throws IOException {
        byte[] data = Serializer.serialize(user);
        Path path = Paths.get(filePath.substring(0, filePath.lastIndexOf("/")));
        try {
            Files.createDirectories(path);
            Files.write(Paths.get(filePath),data);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static List<String> readFromFile(String path) {
        List<String> list = new ArrayList<>();
        try {
            list = Files.readAllLines(Paths.get(path), ISO_8859_1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

}
