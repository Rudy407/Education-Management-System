package com.project.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import com.project.entity.po.C;

import java.util.List;
@Service
public class CService {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public void insert(C c) {
        String sql = "INSERT INTO c (kh, km, xf, xs, yxh) VALUES (?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, c.getKh(), c.getKm(), c.getXf(), c.getXs(), c.getYxh());
    }


    public void update(C c) {
        String sql = "UPDATE c SET km = ?, xf = ?, xs = ?, yxh = ? WHERE kh = ?";
        jdbcTemplate.update(sql, c.getKm(), c.getXf(), c.getXs(), c.getYxh(), c.getKh());
    }


    public void delete(String kh) {
        String sql = "DELETE FROM c WHERE kh = ?";
        jdbcTemplate.update(sql, kh);
    }


    public C getBykh(String kh) {
        String sql = "SELECT * FROM c WHERE kh = ?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(C.class), kh);
    }


    public List<C> getAll() {
        String sql = "SELECT * FROM c";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(C.class));
    }
}
