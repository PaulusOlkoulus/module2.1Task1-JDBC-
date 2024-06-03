package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;


public class Main {

    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        User user1 = new User("Paul", "Olkov", (byte) 23);
        User user2 = new User("Lol", "Paukov", (byte) 24);
        User user3 = new User("Volk", "Polkov", (byte) 25);
        User user4 = new User("anonimus", "pantomimus", (byte) 50);
        userService.saveUser(user1.getName(), user1.getLastName(), user1.getAge());
        userService.saveUser(user2.getName(), user2.getLastName(), user2.getAge());
        userService.saveUser(user3.getName(), user3.getLastName(), user3.getAge());
        userService.saveUser(user4.getName(), user4.getLastName(), user4.getAge());
        System.out.println(userService.getAllUsers());
        userService.removeUserById(1);
        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.cleanUsersTable();


    }
}
