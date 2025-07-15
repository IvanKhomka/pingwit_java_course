package com.pingwit_java_course.part24.homework.task3;

import java.util.ArrayList;
import java.util.List;

public class UserListClean {

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Alice"));
        users.add(new User("Bob"));
        users.add(new User("Eve"));
        users.add(new User("John"));
        users.add(new User("Peter"));
        users.add(new User("Anna"));

        System.out.println("Перед фильтрацией: " + users);

        users.removeIf(user -> user.getName().startsWith("A") || user.getName().startsWith("P") || user.getName().startsWith("E"));

        System.out.println("Пользователи после фильтрации списка: " + users);
    }
}