package com.jsb.amd.sales.salesforce.api.services;

import java.util.concurrent.ConcurrentMap;

public interface AdminService {
    void purgeCache(String kerberos);

    ConcurrentMap<String, String> impersonate(String authKerberos, String kerberos);
}
