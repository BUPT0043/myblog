/**
 * @(#)MainController.java, 2015年5月27日. Copyright 2015 Yodao, Inc. All rights
 *                          reserved. YODAO PROPRIETARY/CONFIDENTIAL. Use is
 *                          subject to license terms.
 */
package com.simple.app.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author qihong
 */
@Controller
public class MainController {
    @RequestMapping(value="/index")
    public ModelAndView handleRequest(HttpServletRequest req,
            HttpServletResponse resp) throws Exception {
    	System.out.println("-------");
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "Hello World!");
        mv.setViewName("myblog/index");
        return mv;
    }
}
