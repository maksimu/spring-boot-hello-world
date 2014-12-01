package com.funkyvisions;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

abstract class AbstractComponent {

    // This is the problem method. With spring-framework 4.1.0 this works fine.  With spring-framework 4.1.1 it
    // does not.  If I change the @Resource to @Autowired then it works in both versions

    @Resource
    public void setHttpServletRequest(final HttpServletRequest request) {
        System.out.println("***********************  Setting HttpServletRequest!!!!!");
    }
}
