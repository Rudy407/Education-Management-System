package com.project;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.context.annotation.Bean;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//
//import javax.sql.DataSource;
//import java.util.List;
//
//@SpringBootApplication
//public class EducationManagementSystemApplication {
//    public static void main(String[] args) {
//        SpringApplication.run(EducationManagementSystemApplication.class, args);
//    }
//
//    @Bean
//    public DataSource dataSource() {
//        return DataSourceBuilder.create()
//                .driverClassName("org.opengauss.Driver")
//                .url("jdbc:opengauss://127.0.0.1:26000/test")
//                .username("myuser")
//                .password("myPassWord")
//                .build();
//    }
//}
