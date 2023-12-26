package com.jsb.amd.sales.salesforce.api.permit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class AuthnHandlerInterceptor implements HandlerInterceptor {

    private static final Logger logger = LoggerFactory.getLogger(AuthnHandlerInterceptor.class);

    @Override
    public boolean preHandle(@NonNull HttpServletRequest request, @NonNull HttpServletResponse response,
                             @NonNull Object handler) {
        String tokenString = request.getHeader("Authorization");
        String clientIP = request.getRemoteAddr();
        boolean isAuthenticated = TokenAuthentication.checkToken(tokenString, clientIP);
        if (isAuthenticated) {
            logger.debug("AuthnHandlerInterceptor::preHandle() : {}", true);
            return true;
        }
        logger.debug("AuthnHandlerInterceptor::preHandle() : {}", false);
        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        return false;
    }

    @Override
    public void postHandle(@NonNull HttpServletRequest request, @NonNull HttpServletResponse response,
                           @NonNull Object handler, ModelAndView modelAndView) {
        logger.debug("AuthnHandlerInterceptor::postHandle() ");
    }

    @Override
    public void afterCompletion(@NonNull HttpServletRequest request, @NonNull HttpServletResponse response,
                                @NonNull Object handler, Exception ex) {

        logger.debug("AuthnHandlerInterceptor::afterCompletion() ");
    }

}
