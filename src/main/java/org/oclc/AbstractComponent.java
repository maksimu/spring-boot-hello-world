package org.oclc;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

//import org.springframework.beans.factory.annotation.Autowired;

abstract class AbstractComponent {

    protected abstract void implementme();

    //@Autowired
    @Resource
    public void setHttpServletRequest(final HttpServletRequest request) {
        System.out.println("***********************  Setting HttpServletRequest!!!!!");
    }
}
