package com.example.demo.bean;

import java.util.Date;

/**
 * @program: demo
 * @description: 红票信息
 * @author: Hailong
 * @create: 2018-11-19 16:24
 **/
public class RedTicketBillBO {
    private Integer id;
    private String  nsrsbh;
    private String  yfpdm;
    private String  yfphm;
    private String  kpzddm;
    private Integer sqlx;
    private Integer sfdk;
    private String  sqly;
    private Integer ywlx;
    private String  sqrmc;
    private String  sqjqmc;
    private String  lxfs;
    private String  xhdwsbh;
    private String  xhdwmc;
    private String  ghdwsbh;
    private String  ghdwmc;
    private Integer zdbz;
    private String  sqdh;
    private String  xxbbh;
    private Integer clzt;
    private String  je;
    private String  se;
    private Integer tkrid;
    private Date    tkrq;
    private String  returncode;
    private String  returnmsg;
    private String startDate;

    private String endDate;

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**分页*/
    private Integer pageNum;

    /**分页当前页，用于适应前端框架的字段*/
    private Integer currentPage;

    private Integer pageSize;

    private String applyOrderNum;

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getApplyOrderNum() {
        return applyOrderNum;
    }

    public void setApplyOrderNum(String applyOrderNum) {
        this.applyOrderNum = applyOrderNum;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNsrsbh() {
        return nsrsbh;
    }

    public void setNsrsbh(String nsrsbh) {
        this.nsrsbh = nsrsbh;
    }

    public String getYfpdm() {
        return yfpdm;
    }

    public void setYfpdm(String yfpdm) {
        this.yfpdm = yfpdm;
    }

    public String getYfphm() {
        return yfphm;
    }

    public void setYfphm(String yfphm) {
        this.yfphm = yfphm;
    }

    public String getKpzddm() {
        return kpzddm;
    }

    public void setKpzddm(String kpzddm) {
        this.kpzddm = kpzddm;
    }

    public Integer getSqlx() {
        return sqlx;
    }

    public void setSqlx(Integer sqlx) {
        this.sqlx = sqlx;
    }

    public Integer getSfdk() {
        return sfdk;
    }

    public void setSfdk(Integer sfdk) {
        this.sfdk = sfdk;
    }

    public String getSqly() {
        return sqly;
    }

    public void setSqly(String sqly) {
        this.sqly = sqly;
    }

    public Integer getYwlx() {
        return ywlx;
    }

    public void setYwlx(Integer ywlx) {
        this.ywlx = ywlx;
    }

    public String getSqrmc() {
        return sqrmc;
    }

    public void setSqrmc(String sqrmc) {
        this.sqrmc = sqrmc;
    }

    public String getSqjqmc() {
        return sqjqmc;
    }

    public void setSqjqmc(String sqjqmc) {
        this.sqjqmc = sqjqmc;
    }

    public String getLxfs() {
        return lxfs;
    }

    public void setLxfs(String lxfs) {
        this.lxfs = lxfs;
    }

    public String getXhdwsbh() {
        return xhdwsbh;
    }

    public void setXhdwsbh(String xhdwsbh) {
        this.xhdwsbh = xhdwsbh;
    }

    public String getXhdwmc() {
        return xhdwmc;
    }

    public void setXhdwmc(String xhdwmc) {
        this.xhdwmc = xhdwmc;
    }

    public String getGhdwsbh() {
        return ghdwsbh;
    }

    public void setGhdwsbh(String ghdwsbh) {
        this.ghdwsbh = ghdwsbh;
    }

    public String getGhdwmc() {
        return ghdwmc;
    }

    public void setGhdwmc(String ghdwmc) {
        this.ghdwmc = ghdwmc;
    }

    public Integer getZdbz() {
        return zdbz;
    }

    public void setZdbz(Integer zdbz) {
        this.zdbz = zdbz;
    }

    public String getSqdh() {
        return sqdh;
    }

    public void setSqdh(String sqdh) {
        this.sqdh = sqdh;
    }

    public String getXxbbh() {
        return xxbbh;
    }

    public void setXxbbh(String xxbbh) {
        this.xxbbh = xxbbh;
    }

    public Integer getClzt() {
        return clzt;
    }

    public void setClzt(Integer clzt) {
        this.clzt = clzt;
    }

    public String getJe() {
        return je;
    }

    public void setJe(String je) {
        this.je = je;
    }

    public String getSe() {
        return se;
    }

    public void setSe(String se) {
        this.se = se;
    }

    public Integer getTkrid() {
        return tkrid;
    }

    public void setTkrid(Integer tkrid) {
        this.tkrid = tkrid;
    }

    public Date getTkrq() {
        return tkrq;
    }

    public void setTkrq(Date tkrq) {
        this.tkrq = tkrq;
    }

    public String getReturncode() {
        return returncode;
    }

    public void setReturncode(String returncode) {
        this.returncode = returncode;
    }

    public String getReturnmsg() {
        return returnmsg;
    }

    public void setReturnmsg(String returnmsg) {
        this.returnmsg = returnmsg;
    }

    @Override
    public String toString() {
        return "RedTicketBillBO{" +
                "id=" + id +
                ", nsrsbh='" + nsrsbh + '\'' +
                ", yfpdm='" + yfpdm + '\'' +
                ", yfphm='" + yfphm + '\'' +
                ", kpzddm='" + kpzddm + '\'' +
                ", sqlx=" + sqlx +
                ", sfdk=" + sfdk +
                ", sqly='" + sqly + '\'' +
                ", ywlx=" + ywlx +
                ", sqrmc='" + sqrmc + '\'' +
                ", sqjqmc='" + sqjqmc + '\'' +
                ", lxfs='" + lxfs + '\'' +
                ", xhdwsbh='" + xhdwsbh + '\'' +
                ", xhdwmc='" + xhdwmc + '\'' +
                ", ghdwsbh='" + ghdwsbh + '\'' +
                ", ghdwmc='" + ghdwmc + '\'' +
                ", zdbz=" + zdbz +
                ", sqdh='" + sqdh + '\'' +
                ", xxbbh='" + xxbbh + '\'' +
                ", clzt=" + clzt +
                ", je='" + je + '\'' +
                ", se='" + se + '\'' +
                ", tkrid=" + tkrid +
                ", tkrq=" + tkrq +
                ", returncode='" + returncode + '\'' +
                ", returnmsg='" + returnmsg + '\'' +
                '}';
    }
}
