package com.example.demo.utils;

/**
 * @program: demo
 * @description:
 * @author: Hailong
 * @create: 2018-11-13 15:00
 **/
public class RespUtil {
    //返回成功的
    public static <T> void setSuccessResp(String message, ServiceResponse<T> response, T data){
        response.setCode(WebServiceConstants.ReturnCode.SUCCESS_CODE);
        response.setMessage(message);
        response.setData(data);
    }
    //返回失败的
    public static <T> ServiceResponse<T> setFailResp(String message, ServiceResponse<T> response){
        response.setCode(RetMessageUtils.EXCEPTION);
        response.setMessage(message);
        return response;
    }
   //返回未知的
    public static <T> ServiceResponse<T>  setResp(String code, String message, ServiceResponse<T> response, T data){
        response.setCode(code);
        response.setMessage(message);
        response.setData(data);
        return response;
    }
}
