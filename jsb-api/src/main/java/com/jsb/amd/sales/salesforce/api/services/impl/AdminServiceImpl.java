package com.jsb.amd.sales.salesforce.api.services.impl;

import com.jsb.amd.sales.salesforce.api.services.AdminService;
import com.jsb.amd.sales.salesforce.api.utils.MemCache;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.concurrent.ConcurrentMap;

@Component
public class AdminServiceImpl implements AdminService {

    private static final Logger logger = LoggerFactory.getLogger(AdminServiceImpl.class);

    @Override
    public void purgeCache(String kerberos) {
        MemCache.invalidateImpersonationCache(kerberos);
        logger.info("Cleared Impersonation Cache");
    }

    @Override
    public ConcurrentMap<String, String> impersonate(String authKerberos, String kerberos) {
        if (kerberos != null) {
            if (!kerberos.trim().isEmpty()) {
                MemCache.getImpersonatorCache().put(authKerberos, kerberos);
                logger.info("User '{}' is now impersonating '{}'", authKerberos, kerberos);
            } else {
                MemCache.getImpersonatorCache().invalidate(authKerberos);
            }
        }
        return MemCache.getImpersonatorCache().asMap();
    }

}
