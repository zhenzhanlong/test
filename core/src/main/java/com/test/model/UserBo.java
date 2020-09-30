package com.test.model;

import java.io.Serializable;

public class UserBo implements Serializable {

    private static final long serialVersionUID = -8426624494165447274L;
    private String id;
    private String name;

    public UserBo() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
