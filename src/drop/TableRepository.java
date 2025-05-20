package com.project.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TableRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<String> getTableNames() {
        String sql = "SELECT tablename FROM pg_tables WHERE schemaname = 'public'";
        return jdbcTemplate.queryForList(sql, String.class);
    }
}
