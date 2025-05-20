package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TableService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<String> getAllTableNames() {
        String sql = "SELECT tablename FROM pg_tables WHERE schemaname = 'public'";
        return jdbcTemplate.queryForList(sql, String.class);
    }
}

