package com.example.demo.bean;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @program: demo
 * @description: 返回结果
 * @author: Hailong
 * @create: 2018-11-26 11:00
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DzfpResult {
    /**发票请求流水号*/
    private String fpqqlsh;

    /**机器编号*/
    private String jqbh;

    /**发票代码*/
    private String fpDm;

    /**发票号码*/
    private String fpHm;

    /**开票日期*/
    private String kprq;

    /**发票密文*/
    private String fpMw;

    /**校验码*/
    private String jym;

    /**电票下载地址*/
    private String pdfUrl;

    /**二维码*/
    private String ewm;

    /**备注*/
    private String bz;

    /**返回码*/
    private String returnCode;

    /**返回信息*/
    private String returnMessage;

    /**开票状态*/
    private Integer kpzt;

    /**失败原因*/
    private String sbyy;

    public String getFpqqlsh() {
        return fpqqlsh;
    }

    public void setFpqqlsh(String fpqqlsh) {
        this.fpqqlsh = fpqqlsh;
    }

    public String getJqbh() {
        return jqbh;
    }

    public void setJqbh(String jqbh) {
        this.jqbh = jqbh;
    }

    public String getFpDm() {
        return fpDm;
    }

    public void setFpDm(String fpDm) {
        this.fpDm = fpDm;
    }

    public String getFpHm() {
        return fpHm;
    }

    public void setFpHm(String fpHm) {
        this.fpHm = fpHm;
    }

    public String getKprq() {
        return kprq;
    }

    public void setKprq(String kprq) {
        this.kprq = kprq;
    }

    public String getFpMw() {
        return fpMw;
    }

    public void setFpMw(String fpMw) {
        this.fpMw = fpMw;
    }

    public String getJym() {
        return jym;
    }

    public void setJym(String jym) {
        this.jym = jym;
    }

    public String getPdfUrl() {
        return pdfUrl;
    }

    public void setPdfUrl(String pdfUrl) {
        this.pdfUrl = pdfUrl;
    }

    public String getEwm() {
        return ewm;
    }

    public void setEwm(String ewm) {
        this.ewm = ewm;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getReturnMessage() {
        return returnMessage;
    }

    public void setReturnMessage(String returnMessage) {
        this.returnMessage = returnMessage;
    }

    public Integer getKpzt() {
        return kpzt;
    }

    public void setKpzt(Integer kpzt) {
        this.kpzt = kpzt;
    }

    public String getSbyy() {
        return sbyy;
    }

    public void setSbyy(String sbyy) {
        this.sbyy = sbyy;
    }

    @Override
    public String toString() {
        return "DzfpResult{" +
                "fpqqlsh='" + fpqqlsh + '\'' +
                ", jqbh='" + jqbh + '\'' +
                ", fpDm='" + fpDm + '\'' +
                ", fpHm='" + fpHm + '\'' +
                ", kprq='" + kprq + '\'' +
                ", fpMw='" + fpMw + '\'' +
                ", jym='" + jym + '\'' +
                ", pdfUrl='" + pdfUrl + '\'' +
                ", ewm='" + ewm + '\'' +
                ", bz='" + bz + '\'' +
                ", returnCode='" + returnCode + '\'' +
                ", returnMessage='" + returnMessage + '\'' +
                ", kpzt='" + kpzt + '\'' +
                ", sbyy='" + sbyy + '\'' +
                '}';
    }
}

