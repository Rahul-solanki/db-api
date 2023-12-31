package com.jsb.amd.sales.salesforce.api.services;

import java.util.List;

public interface PersonService {

    List<PersonService> getPersons(String kerberos) throws Exception;
}
