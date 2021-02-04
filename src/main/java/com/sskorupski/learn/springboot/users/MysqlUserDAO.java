package com.sskorupski.learn.springboot.users;

import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class MysqlUserDAO implements UserDAO {

    private static class Queries {
        static final String GET_ALL = "SELECT id, username, email, password FROM users";
    }

    private final JdbcTemplate jdbcTemplate;

    @Override
    public List<User> getAll() {
        return jdbcTemplate.query(Queries.GET_ALL, new UserRowMapper());
    }

    @Override
    public User getById(Long id) {
        return (User) jdbcTemplate.query("SELECT id", new UserRowMapper());
    }

    @Override
    public boolean delete(User user) {
        return false;
    }

    @Override
    public boolean update(User user) {
        return false;
    }

    @Override
    public Long create(User user) {
        return null;
    }

}
