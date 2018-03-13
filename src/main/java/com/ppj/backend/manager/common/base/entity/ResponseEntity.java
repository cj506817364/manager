package com.ppj.backend.manager.common.base.entity;

import java.io.Serializable;

/**
 * 统一响应对象
 * 
 */
public class ResponseEntity<T> implements Serializable {

    private static final long serialVersionUID = -3793740741439155471L;

    public static enum Status {
        SUCCESS("200"),
        FAIL("202");

        private final String code;

        private Status(String code) {
            this.code = code;
        }
        
        public String getCode() {
            return this.code;
        }

    }

    // 状态代码
    private String code;
    // 消息内容
    private String message;
    // 消息主体业务对象
    private T data;

    // 私有构造函数
    private ResponseEntity() {
    }

    // 简单构造，返回执行结果信息，不带业务对象
    public ResponseEntity(String code, String msg) {
        this.code = code;
        this.message = msg;
    }

    // 简单构造，返回执行结果信息，带业务对象
    public ResponseEntity(String code, String msg, T data) {
        this.code = code;
        this.message = msg;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static ResponseEntity<Object> ok() {
        return new ResponseEntity<Object>(Status.SUCCESS.getCode(),"SUCCESS");
    }
    
    public static ResponseEntity<Object> ok(String message) {
        return new ResponseEntity<Object>(Status.SUCCESS.getCode(),message);
    }
    
    public static ResponseEntity<Object> ok(String message, Object data) {
        return new ResponseEntity<Object>(Status.SUCCESS.getCode(),message,data);
    }

    public static ResponseEntity<Object> fail() {
        return new ResponseEntity<Object>(Status.FAIL.getCode(),"FAIL");
    }
}
