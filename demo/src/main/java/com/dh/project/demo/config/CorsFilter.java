package com.dh.project.demo.config;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by jhonny .
 */
@Component
public class CorsFilter implements Filter{

    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException, IOException {
        HttpServletResponse response = (HttpServletResponse) res;
        response.setHeader("Access-Control-Allow-Origin", "*");//permiso de dominio para mostrar en el navegador
        response.setHeader("Access-Control-Allow-Methods", "POST,PATCH, GET, PUT, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setHeader("Access-Control-Allow-Headers", "Content-Type, x-requested-with, X-Custom-Header");
        chain.doFilter(req, res);
    }

    public void init(FilterConfig filterConfig) {
    }

    public void destroy() {
    }

}
