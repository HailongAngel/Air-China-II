package com.example.demo.utils;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @program: demo
 * @description:
 * @author: Hailong
 * Restful规范返回数据包装类
 * @create: 2018-11-13 13:51
 **/
public class ServiceResponse<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 成功的返回码
     */
    @JsonProperty("code")
    private String code = RetMessageUtils.SUCCESS;

    /**
     * 信息
     */
    @JsonProperty("message")
    private String message;

    /**
     * 返回前台数据
     */
    @JsonProperty("data")
    private T data = null;

    /**
     * 构造方法
     */
    public ServiceResponse(){

    }
    /**
     * 构造方法
     *
     * @param data
     *            返回前台数据
     */
    public ServiceResponse(T data)
    {
        this.data = data;
    }

    public String getCode()
    {
        return code;
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public T getData()
    {
        return data;
    }

    public void setData(T data)
    {
        this.data = data;
    }
}
