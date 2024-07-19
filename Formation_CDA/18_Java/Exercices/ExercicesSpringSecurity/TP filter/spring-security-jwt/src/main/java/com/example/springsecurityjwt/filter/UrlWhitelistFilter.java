package com.example.springsecurityjwt.filter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UrlWhitelistFilter extends OncePerRequestFilter {

    private static final Set<String> WHITELISTED_URLS = new HashSet<>();

    static {
        WHITELISTED_URLS.add("127.0.0.1");
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String remoteAddr = request.getRemoteAddr();

        if (WHITELISTED_URLS.contains(remoteAddr)){
            filterChain.doFilter(request, response);
        }else {
            response.sendError(HttpServletResponse.SC_FORBIDDEN, "Access denied");
        }
    }
}
