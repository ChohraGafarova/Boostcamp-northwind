package org.chohra.northwind.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

public class User {
    @Getter
    private String userName;
    @Setter
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
