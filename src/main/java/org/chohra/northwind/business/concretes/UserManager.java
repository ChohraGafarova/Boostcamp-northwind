package org.chohra.northwind.business.concretes;
import org.chohra.northwind.entities.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
public class UserManager extends User {
    private List<User> users;

    public UserManager() {
        this.users = new ArrayList<>();
    }

    public UserManager(String userName, String password) {
        super(userName, password);
    }

    public List<User> getUsers() {
        return users;
    }

    public boolean addUser(User user) {
        if (isUserNameUnique(user.getUserName())) {
            users.add(user);
            return true;
        }
        return false;
    }

    private boolean isUserNameUnique(String userName) {
        for (User user : users) {
            if (Objects.equals(user.getUserName(), userName)) {
                return false;
            }
        }
        return true;
    }
}
