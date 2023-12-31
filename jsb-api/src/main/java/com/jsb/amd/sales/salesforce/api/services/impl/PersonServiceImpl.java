package com.jsb.amd.sales.salesforce.api.services.impl;

import com.jsb.amd.sales.salesforce.api.services.PersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class PersonServiceImpl implements PersonService {

    private static final Logger logger = LoggerFactory.getLogger(PersonServiceImpl.class);

    @Override
    public List<PersonService> getPersons(String kerberos) throws Exception {
        logger.info("Getting Persons for user {}", kerberos);
        return null;
    }
}
