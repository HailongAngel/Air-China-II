package com.example.demo.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

/**
 * @program: demo
 * @description:返回信息处理
 * @author: Hailong
 * @create: 2018-11-26 10:10
 **/
public class ReturnUtil {
    private static Map<String, String> returnCodeMap = new HashMap<>() ;

    private static final String CODE = "_CODE";

    private static final String MESSAGE = "_MESSAGE";

    static {
        String fileName = "return.properties";
        Properties props = new Properties();
        try {
            props.load(Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName));
            Iterator<Map.Entry<Object, Object>> it = props.entrySet().iterator();
            while(it.hasNext()){
                Map.Entry<Object, Object> entry = it.next();
                String key = (String) entry.getKey();
                String value = (String) entry.getValue();
                value = URLDecoder.decode(value, "UTF-8");
                String[] split = value.split("_");
                returnCodeMap.put(key + CODE, split[0]);
                if(split.length >= 2){
                    returnCodeMap.put(key + MESSAGE, split[1]);
                }else{
                    returnCodeMap.put(key + MESSAGE, "");
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Map<String, Object>  createReturnMap(String key){
        return createReturnMap(getCodeByKey(key), getMessageByKey(key), null);
    }

    public static Map<String, Object> createReturnMap(String key, Map<String, Object> content){
        return createReturnMap(getCodeByKey(key), getMessageByKey(key), content);
    }

    public static Map<String, Object> createReturnMap(String key, Object content){
        return createReturnMap(getCodeByKey(key), getMessageByKey(key), content);
    }

    public static Map<String, Object> createReturnMap(String code, String message){
        if (code == null || "".equals(code) || message == null || "".equals(message)){
            return null;
        }
        return createReturnMap(code, message, null);
    }

    public static Map<String, Object> createCustomeReturnMap(String key, String message){
        return createReturnMap(getCodeByKey(key), message, null);
    }

    public static Map<String, Object> createReturnMap(String code, String message, Object content){
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put(WebServiceConstants.ResponseParam.RETURN_CODE, code);
        resultMap.put(WebServiceConstants.ResponseParam.RETURN_MESSAGE, message);
        resultMap.put(WebServiceConstants.ResponseParam.CONTENT_MAP, content);
        return resultMap;
    }

    private static String getCodeByKey(String key){
        return returnCodeMap.get(key + CODE);
    }

    private static String getMessageByKey(String key){
        return returnCodeMap.get(key + MESSAGE);
    }

    public static <T> ServiceResponse<T> createResponse(String msg, String key) {
        ServiceResponse<T> response = new ServiceResponse<>();
        response.setCode(getCodeByKey(key));
        if (msg == null){
            response.setMessage(getMessageByKey(key));
        }else {
            response.setMessage(msg+","+getMessageByKey(key));
        }
        response.setData(null);
        return response;
    }

    public static <T> ServiceResponse<T> createResponse(String key) {
        return createResponse(null, key);
    }

    public static <T> ServiceResponse<T> createResponseSuccess(String msg){
        ServiceResponse<T> response = new ServiceResponse<>();
        response.setCode(getCodeByKey(ReturnConstants.SUCCESS));
        if (msg == null){
            response.setMessage(getMessageByKey(ReturnConstants.SUCCESS));
        }else {
            response.setMessage(msg);
        }
        return response;
    }

    public static <T> ServiceResponse<T> createResponseSuccess(){
        return createResponseSuccess(null);
    }

    public static <T> ServiceResponse<T> createResponseError(String msg){
        ServiceResponse<T> response = new ServiceResponse<>();
        response.setCode(getCodeByKey(ReturnConstants.ERROR));
        if (msg == null){
            response.setMessage(getMessageByKey(ReturnConstants.ERROR));
        }else {
            response.setMessage(msg);
        }
        return response;
    }

    public static <T> ServiceResponse<T> createResponseError(){
        return createResponseError(null);
    }

}
