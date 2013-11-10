package com.zeroturnaround.rebellabs;

import javax.annotation.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * User: mertcaliskan
 * Date: 08/11/13
 */
@ManagedBean
@SessionScoped
public class MainView {

    private String parameter;

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public String cancel() {
        parameter = null;
        return null;
    }
}
