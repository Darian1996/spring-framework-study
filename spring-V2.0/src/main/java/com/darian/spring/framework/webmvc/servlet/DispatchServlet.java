package com.darian.spring.framework.webmvc.servlet;

import com.darian.spring.demo.mvc.action.DemoAction;
import com.darian.spring.framework.annotation.DarianAutowried;
import com.darian.spring.framework.annotation.DarianController;
import com.darian.spring.framework.annotation.DarianService;
import com.darian.spring.framework.context.DarianApplicationContext;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

// Servlet 只是作为一个 MVC 的启动入口
public class DispatchServlet extends HttpServlet {

    private final String LOCATION = "contextConfigLocation";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("-------- 调用 doPost -------------");

    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        DarianApplicationContext context = new DarianApplicationContext(config.getInitParameter(LOCATION));
    }


}
