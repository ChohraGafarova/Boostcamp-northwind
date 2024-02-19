package org.chohra.northwind.business.concretes;

import org.chohra.northwind.entities.User;

public class TestUserManager {
        public static void main(String[] args) {
            UserManager userManager = new UserManager();

            userManager.addUser(new User("user1", "pass1"));
            userManager.addUser(new User("user2", "pass2"));

            System.out.println(userManager.getUsers());

            try {
                userManager.addUser(new User("user1", "pass3"));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
}

