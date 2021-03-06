package com.sskorupski.learn.springboot.users;

import java.util.List;

public interface UserDAO {

    List<User> getAll();
    User getById(Long id);

    boolean delete(User user);

    boolean update(User user);

    List<User> create(User user);
}
