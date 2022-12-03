package com.kittyki.project.dao.jdbc;

import java.util.List;

import com.kittyki.project.model.User;

/**
 * Provides CRUD operations for the person table.
 *
 *  - Create
 *  - Read
 *  - Update
 *  - Delete
 */
public interface UserDao {
    public void insert(User user);

    public User findById(int idUser);

    public List<User> findAll();

    public void update(User user);

    public void delete(User user);
}
