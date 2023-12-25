package com.jsb.amd.sales.salesforce.api.utils;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.jsb.amd.sales.salesforce.models.Contact;

import java.util.List;
import java.util.concurrent.TimeUnit;

public abstract class MemCache {

    private static final Cache<String, List<Contact>> contactCache =
            CacheBuilder.newBuilder().expireAfterWrite(5, TimeUnit.MINUTES).build();

    private static final Cache<String, String> impersonatorCache =
            CacheBuilder.newBuilder().expireAfterWrite(5, TimeUnit.MINUTES).build();

    public static Cache<String, String> getImpersonatorCache() {
        return impersonatorCache;
    }

    public static void invalidateImpersonationCache(String kerberos) {
        impersonatorCache.invalidate(kerberos);
    }
}
