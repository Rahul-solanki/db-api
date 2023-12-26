package com.jsb.amd.sales.salesforce.api.permit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class TokenAuthentication {
    private static final Logger logger = LoggerFactory.getLogger(TokenAuthentication.class);
    // permit
    // OAuth2

    public static boolean checkToken(String token, String clientIP) {
        logger.info("Token authentication requested for '{}' with client IP '{}' ", token, clientIP);
        return true;
    }

}
