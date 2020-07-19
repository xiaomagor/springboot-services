package com.xiaomage.demo.entity;

import java.io.Serializable;

/**
* @program: ResultMsg
*
* @description: ResultMsg pojo
*
* @author: xiaomage
*
* @create: 2019-11-12 21:58
**/

public class ResultMsg implements Serializable {


    public int status=0;
    public String message="";


    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ResultMsg(int status, String message) {
        this.status = status;
        this.message = message;
    }
}
