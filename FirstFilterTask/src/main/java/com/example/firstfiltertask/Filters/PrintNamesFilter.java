package com.example.firstfiltertask.Filters;

import com.example.firstfiltertask.RequestModify;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.io.IOException;
import java.util.Enumeration;


@WebFilter(filterName="filter1", urlPatterns="/hello-servlet")
public class PrintNamesFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
//            HttpServletRequest req = (HttpServletRequest) request;
//            Enumeration<String> params = req.getParameterNames();
//            while (params.hasMoreElements()) {
//                String name = params.nextElement();
//                System.out.println(name+ "   "+request.getParameter(name));
//
//            }

        RequestModify requestModify = new RequestModify((HttpServletRequest) request);


        chain.doFilter(requestModify , response);
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
