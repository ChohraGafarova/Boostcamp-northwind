package org.chohra.northwind.entities;

import java.util.Objects;

public class User {
    private String userName;
    private String password;

    public User(String userName, String password) {
        if (isUserNameUnique(userName)) {
            this.userName = userName;
        } else {
            throw new IllegalArgumentException("Error: The userName is not unique.");
        }
        this.password = password;
    }

    public User() {
    }

    public String getUserName() {
        return userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private boolean isUserNameUnique(String userName) {
        return !Objects.equals(userName, "");
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
