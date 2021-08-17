package com.example.firstfiltertask;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.util.Enumeration;

public class RequestModify extends HttpServletRequestWrapper {
    /**
     * Constructs a request object wrapping the given request.
     *
     * @param request the {@link HttpServletRequest} to be wrapped.
     * @throws IllegalArgumentException if the request is null
     */
    public RequestModify(HttpServletRequest request) {
        super(request);
    }
    public String getParameter(String name){

        return "|KHALID|";
    }
}
