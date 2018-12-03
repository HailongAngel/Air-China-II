package com.example.demo.bean;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


public class ApplyBillBO {
    private Integer id;

    private String lsh;

    private Integer kplx;

    private String xsfId;

    private String gmfNsrsbh;

    private String gmfMc;

    private String gmfDz;

    private String gmfDh;

    private String gmfYhzh;

    private String kpr;

    private String skr;

    private String fhr;

    private String yfpDm;

    private String yfpHm;

    private Double jshj;

    private Double hjje;

    private Double hjse;

    private String yx;

    private String sjh;

    private String sfhc;

    private String lyxt;

    private Date createTime;

    private String source;

    private String wechatOpenid;

    private String alipayOpenid;

    private String bz;

    private String fpDm;

    private String fpHm;

    private Date kprq;

    private Integer creator;

    private String gmfDzdh;

    private Integer xsfJgid;

    private String xsfJgmc;

    private Integer xsfBmid;

    private String xsfBmmc;

    private String xsfNsrsbh;

    private String kpzdbs;

    private String fplx;

    private Integer qdbs;

    private Integer zsfs;

    private String tspz;

    private BigDecimal kce;

    private String xxbbm;

    private Integer sqzt;

    private Integer spzt;

    private Integer dysprId;

    private String dysprMc;

    private String dysprYj;

    private Date dysprCzsj;

    private Integer desprId;

    private String desprMc;

    private String desprYj;

    private Date drsprCzsj;

    private Integer kprId;

    private Date kprCzsj;

    private String kprMc;

    private Integer sqrId;

    private String sqr;

    /**审批人id，只用于审批查询*/
    private Integer sprId;

    private Integer jgId;

    private String jgMc;

    private Integer sqlx;

    private Integer bmId;

    private String bmMc;

    private String sqrDh;

    private Integer kpzt;

    private Date sqTime;

    /**审批等级 1=1级审批人，2=2级审批人*/
    private Integer level;

    /**审批传来的审批状态对应的真实审批状态*/
    private Integer[] realSqzts;

    /**分页*/
    private Integer pageNum;

    /**分页当前页，用于适应前端框架的字段*/
    private Integer currentPage;

    private Integer pageSize;

    private String applyOrderNum;

    public String getApplyOrderNum() {
        return applyOrderNum;
    }

    public void setApplyOrderNum(String applyOrderNum) {
        this.applyOrderNum = applyOrderNum;
    }

    /**查询*/
    private Date startTime;

    private Date endTime;

    private List<ApplyBillLineBO> applyBillLineBOList;

    public List<ApplyBillLineBO> getApplyBillLineBOList() {
        return applyBillLineBOList;
    }

    public void setApplyBillLineBOList(List<ApplyBillLineBO> applyBillLineBOList) {
        this.applyBillLineBOList = applyBillLineBOList;
    }
    public Date getSqTime() {
        return sqTime;
    }

    public void setSqTime(Date sqTime) {
        this.sqTime = sqTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLsh() {
        return lsh;
    }

    public void setLsh(String lsh) {
        this.lsh = lsh == null ? null : lsh.trim();
    }

    public Integer getKplx() {
        return kplx;
    }

    public void setKplx(Integer kplx) {
        this.kplx = kplx;
    }

    public String getXsfId() {
        return xsfId;
    }

    public void setXsfId(String xsfId) {
        this.xsfId = xsfId == null ? null : xsfId.trim();
    }

    public String getGmfNsrsbh() {
        return gmfNsrsbh;
    }

    public void setGmfNsrsbh(String gmfNsrsbh) {
        this.gmfNsrsbh = gmfNsrsbh == null ? null : gmfNsrsbh.trim();
    }

    public String getGmfMc() {
        return gmfMc;
    }

    public void setGmfMc(String gmfMc) {
        this.gmfMc = gmfMc == null ? null : gmfMc.trim();
    }

    public String getGmfDz() {
        return gmfDz;
    }

    public void setGmfDz(String gmfDz) {
        this.gmfDz = gmfDz == null ? null : gmfDz.trim();
    }

    public String getGmfDh() {
        return gmfDh;
    }

    public void setGmfDh(String gmfDh) {
        this.gmfDh = gmfDh == null ? null : gmfDh.trim();
    }

    public String getGmfYhzh() {
        return gmfYhzh;
    }

    public void setGmfYhzh(String gmfYhzh) {
        this.gmfYhzh = gmfYhzh == null ? null : gmfYhzh.trim();
    }

    public String getKpr() {
        return kpr;
    }

    public void setKpr(String kpr) {
        this.kpr = kpr == null ? null : kpr.trim();
    }

    public String getSkr() {
        return skr;
    }

    public void setSkr(String skr) {
        this.skr = skr == null ? null : skr.trim();
    }

    public String getFhr() {
        return fhr;
    }

    public void setFhr(String fhr) {
        this.fhr = fhr == null ? null : fhr.trim();
    }

    public String getYfpDm() {
        return yfpDm;
    }

    public void setYfpDm(String yfpDm) {
        this.yfpDm = yfpDm == null ? null : yfpDm.trim();
    }

    public String getYfpHm() {
        return yfpHm;
    }

    public void setYfpHm(String yfpHm) {
        this.yfpHm = yfpHm == null ? null : yfpHm.trim();
    }

    public Double getJshj() {
        return jshj;
    }

    public void setJshj(Double jshj) {
        this.jshj = jshj;
    }

    public Double getHjje() {
        return hjje;
    }

    public void setHjje(Double hjje) {
        this.hjje = hjje;
    }

    public Double getHjse() {
        return hjse;
    }

    public void setHjse(Double hjse) {
        this.hjse = hjse;
    }

    public String getYx() {
        return yx;
    }

    public void setYx(String yx) {
        this.yx = yx == null ? null : yx.trim();
    }

    public String getSjh() {
        return sjh;
    }

    public void setSjh(String sjh) {
        this.sjh = sjh == null ? null : sjh.trim();
    }

    public String getSfhc() {
        return sfhc;
    }

    public void setSfhc(String sfhc) {
        this.sfhc = sfhc == null ? null : sfhc.trim();
    }

    public String getLyxt() {
        return lyxt;
    }

    public void setLyxt(String lyxt) {
        this.lyxt = lyxt == null ? null : lyxt.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getWechatOpenid() {
        return wechatOpenid;
    }

    public void setWechatOpenid(String wechatOpenid) {
        this.wechatOpenid = wechatOpenid == null ? null : wechatOpenid.trim();
    }

    public String getAlipayOpenid() {
        return alipayOpenid;
    }

    public void setAlipayOpenid(String alipayOpenid) {
        this.alipayOpenid = alipayOpenid == null ? null : alipayOpenid.trim();
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz == null ? null : bz.trim();
    }

    public String getFpDm() {
        return fpDm;
    }

    public void setFpDm(String fpDm) {
        this.fpDm = fpDm == null ? null : fpDm.trim();
    }

    public String getFpHm() {
        return fpHm;
    }

    public void setFpHm(String fpHm) {
        this.fpHm = fpHm == null ? null : fpHm.trim();
    }

    public Date getKprq() {
        return kprq;
    }

    public void setKprq(Date kprq) {
        this.kprq = kprq;
    }

    public Integer getCreator() {
        return creator;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    public String getGmfDzdh() {
        return gmfDzdh;
    }

    public void setGmfDzdh(String gmfDzdh) {
        this.gmfDzdh = gmfDzdh == null ? null : gmfDzdh.trim();
    }

    public Integer getXsfJgid() {
        return xsfJgid;
    }

    public void setXsfJgid(Integer xsfJgid) {
        this.xsfJgid = xsfJgid;
    }

    public String getXsfJgmc() {
        return xsfJgmc;
    }

    public void setXsfJgmc(String xsfJgmc) {
        this.xsfJgmc = xsfJgmc == null ? null : xsfJgmc.trim();
    }

    public Integer getXsfBmid() {
        return xsfBmid;
    }

    public void setXsfBmid(Integer xsfBmid) {
        this.xsfBmid = xsfBmid;
    }

    public String getXsfBmmc() {
        return xsfBmmc;
    }

    public void setXsfBmmc(String xsfBmmc) {
        this.xsfBmmc = xsfBmmc == null ? null : xsfBmmc.trim();
    }

    public String getXsfNsrsbh() {
        return xsfNsrsbh;
    }

    public void setXsfNsrsbh(String xsfNsrsbh) {
        this.xsfNsrsbh = xsfNsrsbh == null ? null : xsfNsrsbh.trim();
    }

    public String getKpzdbs() {
        return kpzdbs;
    }

    public void setKpzdbs(String kpzdbs) {
        this.kpzdbs = kpzdbs == null ? null : kpzdbs.trim();
    }

    public String getFplx() {
        return fplx;
    }

    public void setFplx(String fplx) {
        this.fplx = fplx == null ? null : fplx.trim();
    }

    public Integer getQdbs() {
        return qdbs;
    }

    public void setQdbs(Integer qdbs) {
        this.qdbs = qdbs;
    }

    public Integer getZsfs() {
        return zsfs;
    }

    public void setZsfs(Integer zsfs) {
        this.zsfs = zsfs;
    }

    public String getTspz() {
        return tspz;
    }

    public void setTspz(String tspz) {
        this.tspz = tspz == null ? null : tspz.trim();
    }

    public BigDecimal getKce() {
        return kce;
    }

    public void setKce(BigDecimal kce) {
        this.kce = kce;
    }

    public String getXxbbm() {
        return xxbbm;
    }

    public void setXxbbm(String xxbbm) {
        this.xxbbm = xxbbm == null ? null : xxbbm.trim();
    }

    public Integer getSqzt() {
        return sqzt;
    }

    public void setSqzt(Integer sqzt) {
        this.sqzt = sqzt;
    }

    public Integer getDysprId() {
        return dysprId;
    }

    public void setDysprId(Integer dysprId) {
        this.dysprId = dysprId;
    }

    public String getDysprMc() {
        return dysprMc;
    }

    public void setDysprMc(String dysprMc) {
        this.dysprMc = dysprMc == null ? null : dysprMc.trim();
    }

    public String getDysprYj() {
        return dysprYj;
    }

    public void setDysprYj(String dysprYj) {
        this.dysprYj = dysprYj == null ? null : dysprYj.trim();
    }

    public Date getDysprCzsj() {
        return dysprCzsj;
    }

    public void setDysprCzsj(Date dysprCzsj) {
        this.dysprCzsj = dysprCzsj;
    }

    public Integer getDesprId() {
        return desprId;
    }

    public void setDesprId(Integer desprId) {
        this.desprId = desprId;
    }

    public String getDesprMc() {
        return desprMc;
    }

    public void setDesprMc(String desprMc) {
        this.desprMc = desprMc == null ? null : desprMc.trim();
    }

    public String getDesprYj() {
        return desprYj;
    }

    public void setDesprYj(String desprYj) {
        this.desprYj = desprYj == null ? null : desprYj.trim();
    }

    public Date getDrsprCzsj() {
        return drsprCzsj;
    }

    public void setDrsprCzsj(Date drsprCzsj) {
        this.drsprCzsj = drsprCzsj;
    }

    public Integer getKprId() {
        return kprId;
    }

    public void setKprId(Integer kprId) {
        this.kprId = kprId;
    }

    public Integer getJgId() {
        return jgId;
    }

    public void setJgId(Integer jgId) {
        this.jgId = jgId;
    }

    public String getJgMc() {
        return jgMc;
    }

    public void setJgMc(String jgMc) {
        this.jgMc = jgMc == null ? null : jgMc.trim();
    }

    public Integer getSqlx() {
        return sqlx;
    }

    public void setSqlx(Integer sqlx) {
        this.sqlx = sqlx;
    }

    public Integer getBmId() {
        return bmId;
    }

    public void setBmId(Integer bmId) {
        this.bmId = bmId;
    }

    public String getBmMc() {
        return bmMc;
    }

    public void setBmMc(String bmMc) {
        this.bmMc = bmMc == null ? null : bmMc.trim();
    }

    public String getSqrDh() {
        return sqrDh;
    }

    public void setSqrDh(String sqrDh) {
        this.sqrDh = sqrDh == null ? null : sqrDh.trim();
    }

    public Integer getKpzt() {
        return kpzt;
    }

    public void setKpzt(Integer kpzt) {
        this.kpzt = kpzt;
    }

    public Integer getSqrId() {
        return sqrId;
    }

    public void setSqrId(Integer sqrId) {
        this.sqrId = sqrId;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getSprId() {
        return sprId;
    }

    public void setSprId(Integer sprId) {
        this.sprId = sprId;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer[] getRealSqzts() {
        return realSqzts;
    }

    public void setRealSqzts(Integer[] realSqzts) {
        this.realSqzts = realSqzts;
    }

    public Integer getSpzt() {
        return spzt;
    }

    public void setSpzt(Integer spzt) {
        this.spzt = spzt;
    }

    public String getKprMc() {
        return kprMc;
    }

    public void setKprMc(String kprMc) {
        this.kprMc = kprMc;
    }

    public String getSqr() {
        return sqr;
    }

    public void setSqr(String sqr) {
        this.sqr = sqr;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Date getKprCzsj() {
        return kprCzsj;
    }

    public void setKprCzsj(Date kprCzsj) {
        this.kprCzsj = kprCzsj;
    }

    @Override
    public String toString() {
        return "ApplyBillBO{" +
                "id=" + id +
                ", lsh='" + lsh + '\'' +
                ", kplx=" + kplx +
                ", xsfId='" + xsfId + '\'' +
                ", gmfNsrsbh='" + gmfNsrsbh + '\'' +
                ", gmfMc='" + gmfMc + '\'' +
                ", gmfDz='" + gmfDz + '\'' +
                ", gmfDh='" + gmfDh + '\'' +
                ", gmfYhzh='" + gmfYhzh + '\'' +
                ", kpr='" + kpr + '\'' +
                ", skr='" + skr + '\'' +
                ", fhr='" + fhr + '\'' +
                ", yfpDm='" + yfpDm + '\'' +
                ", yfpHm='" + yfpHm + '\'' +
                ", jshj=" + jshj +
                ", hjje=" + hjje +
                ", hjse=" + hjse +
                ", yx='" + yx + '\'' +
                ", sjh='" + sjh + '\'' +
                ", sfhc='" + sfhc + '\'' +
                ", lyxt='" + lyxt + '\'' +
                ", createTime=" + createTime +
                ", source='" + source + '\'' +
                ", wechatOpenid='" + wechatOpenid + '\'' +
                ", alipayOpenid='" + alipayOpenid + '\'' +
                ", bz='" + bz + '\'' +
                ", fpDm='" + fpDm + '\'' +
                ", fpHm='" + fpHm + '\'' +
                ", kprq=" + kprq +
                ", creator=" + creator +
                ", gmfDzdh='" + gmfDzdh + '\'' +
                ", xsfJgid=" + xsfJgid +
                ", xsfJgmc='" + xsfJgmc + '\'' +
                ", xsfBmid=" + xsfBmid +
                ", xsfBmmc='" + xsfBmmc + '\'' +
                ", xsfNsrsbh='" + xsfNsrsbh + '\'' +
                ", kpzdbs='" + kpzdbs + '\'' +
                ", fplx='" + fplx + '\'' +
                ", qdbs=" + qdbs +
                ", zsfs=" + zsfs +
                ", tspz='" + tspz + '\'' +
                ", kce=" + kce +
                ", xxbbm='" + xxbbm + '\'' +
                ", sqzt=" + sqzt +
                ", spzt=" + spzt +
                ", dysprId=" + dysprId +
                ", dysprMc='" + dysprMc + '\'' +
                ", dysprYj='" + dysprYj + '\'' +
                ", dysprCzsj=" + dysprCzsj +
                ", desprId=" + desprId +
                ", desprMc='" + desprMc + '\'' +
                ", desprYj='" + desprYj + '\'' +
                ", drsprCzsj=" + drsprCzsj +
                ", kprId=" + kprId +
                ", kprCzsj=" + kprCzsj +
                ", kprMc='" + kprMc + '\'' +
                ", sqrId=" + sqrId +
                ", sqr='" + sqr + '\'' +
                ", sprId=" + sprId +
                ", jgId=" + jgId +
                ", jgMc='" + jgMc + '\'' +
                ", sqlx=" + sqlx +
                ", bmId=" + bmId +
                ", bmMc='" + bmMc + '\'' +
                ", sqrDh='" + sqrDh + '\'' +
                ", kpzt=" + kpzt +
                ", sqTime=" + sqTime +
                ", level=" + level +
                ", realSqzts=" + Arrays.toString(realSqzts) +
                ", pageNum=" + pageNum +
                ", currentPage=" + currentPage +
                ", pageSize=" + pageSize +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}