package com.jsb.amd.sales.salesforce.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class DatabaseAPI {

//    @Autowired
//    private JdbcTemplate jdbcTemplate;

    public static void main(String[] args) {
        try {
            SpringApplication.run(DatabaseAPI.class, args);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

//    @Override
//    public void run(String... args) throws Exception {
//        String sql = "SELECT * FROM Persons";
//        List<Persons> persons = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Persons.class));
//        persons.forEach(System.out::println);
//    }
}
