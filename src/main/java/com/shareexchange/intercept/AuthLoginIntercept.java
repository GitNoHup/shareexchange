package com.shareexchange.intercept;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashSet;
import java.util.Set;

@Slf4j
@Component
public class AuthLoginIntercept implements HandlerInterceptor {

    private static Set<String> URL_SET = new HashSet<>();

    static {
        URL_SET.add("/manager/admin/login");
        URL_SET.add("/error/jurisdiction");
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        String url = request.getServletPath();

        if (URL_SET.contains(url)) {
            return true;
        }

        Cookie[] cookies = request.getCookies();
        String token = getCookieByName("token", cookies);
        if (StringUtils.isBlank(token)) {
            response.sendRedirect("/error/jurisdiction");
            return false;
        }

        return true;
    }

    private String getCookieByName(String name, Cookie[] cookies) {
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (name.equals(cookie.getName())) {
                    return cookie.getValue();
                }
            }
        }
        return null;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
