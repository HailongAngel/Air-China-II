package com.example.demo.utils;

import com.example.demo.constant.SymbolContant;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * @program: demo
 * @description:
 * @author: Hailong
 * @create: 2018-11-26 10:06
 **/
public class StringUtil {
    /**
     * 判断字符串是否为空
     *
     * @param str
     * @return
     */
    public static boolean isEmpty(String str) {
        return str == null || "".equals(str);
    }

    public static boolean isNotEmpty(String str) {
        return (str != null && !"".equals(str));
    }

    public static String firstUpperCase(String string) {
        char[] chars = string.toCharArray();
        if (chars[0] >= 97 && chars[0] <= 122) {
            chars[0] -= 32;
        }
        return new String(chars);
    }

    /**
     * 返回20位流水号前14位
     *
     * @return
     */
    public static String getLSH() {
        String f = "yyMMddhhmmss";
        SimpleDateFormat format = new SimpleDateFormat(f);
        return "WX" + format.format(new Date());
    }

    /**
     * 添加CDATA
     *
     * @param o
     * @return
     */
    public static String addCDATA(Object o) {
        return "<![CDATA[" + String.valueOf(o) + "]]>";
    }

    /**
     * Object转String，防止append null返回空串
     *
     * @param value
     * @return
     */
    public static String objectToString(Object value) {
        return value == null ? "" : value.toString();
    }

    /**
     * 判断字符串真实长度
     *
     * @param value
     * @return
     */
    public static int realLength(String value) {
        int valueLength = 0;
        String chinese = "[\u4e00-\u9fa5]";
        for (int i = 0; i < value.length(); i++) {
            String temp = value.substring(i, i + 1);
            if (temp.matches(chinese)) {
                valueLength += 2;
            } else {
                valueLength += 1;
            }
        }
        return valueLength;
    }

    public static boolean isMobile(String mobile) {
        return isChinaPhoneLegal(mobile) || isHKPhoneLegal(mobile);
    }

    /**
     * 大陆手机号码11位数，匹配格式：前三位固定格式+后8位任意数 此方法中前三位格式有： 13+任意数 15+除4的任意数 18+除1和4的任意数
     * 17+除9的任意数 147
     */
    private static boolean isChinaPhoneLegal(String mobile) throws PatternSyntaxException {
        mobile = mobile.trim();
        String regExp = "^1[3456789]\\d{9}$";
        Pattern p = Pattern.compile(regExp);
        Matcher m = p.matcher(mobile);
        return StringUtil.isNotEmpty(mobile) && m.matches();
    }

    /**
     * 香港手机号码8位数，5|6|8|9开头+7位任意数
     */
    private static boolean isHKPhoneLegal(String mobile) throws PatternSyntaxException {
        mobile = mobile.trim();
        String regExp = "^00852[5689]\\d{7}$";
        Pattern p = Pattern.compile(regExp);
        Matcher m = p.matcher(mobile);
        return StringUtil.isNotEmpty(mobile) && m.matches();
    }

    public static String addPercent(String str){
        if (str == null)
            return null;
        StringBuilder sb = new StringBuilder();
        return sb.append(SymbolContant.PERCENT).append(str).append(SymbolContant.PERCENT).toString();
    }

    public static String addPercentAndSlash(Object obj) {
        if (obj == null){
            return null;
        }
        StringBuilder sb = new StringBuilder();
        return sb.append(SymbolContant.PERCENT_AND_SLASH).append(obj).append(SymbolContant.SLASH_AND_PERCENT).toString();
    }
}
