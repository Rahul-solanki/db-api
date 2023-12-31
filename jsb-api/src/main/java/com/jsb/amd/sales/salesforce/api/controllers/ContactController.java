package com.jsb.amd.sales.salesforce.api.controllers;


import com.jsb.amd.sales.salesforce.client.ContactResponse;
import com.jsb.amd.sales.salesforce.models.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contacts")
public class ContactController {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/pmaContacts")
    public List<Contact> getAllContacts() {
        String sql = "SELECT * FROM Contact";
        List<Contact> contactList = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Contact.class));
        return contactList;
    }
}
