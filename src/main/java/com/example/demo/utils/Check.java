package com.example.demo.utils;

import com.example.demo.bean.RedTicketBillBO;
import com.example.demo.controller.MakeInvoiceApplyController;
import com.example.demo.service.IRedTicketService;
import com.example.demo.utils.page.PageInfo;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Map;
import java.util.function.BinaryOperator;

/**
 * @program: demo
 * @description: 字段校验
 * @author: Hailong
 * @create: 2018-11-26 15:50
 **/
@Service
public class Check {
    private static Logger logger = Logger.getLogger(MakeInvoiceApplyController.class);
    @Autowired
    private IRedTicketService ticketService;
    ServiceResponse<PageInfo> response = new ServiceResponse<>();


    /**
     * 检验长度是否合法
     * @param
     * @return
     */
    public Boolean checkProperty_length(String property,int maxLength){
        boolean flag=true;
        if (property.length()>maxLength){
            flag = false;
        }
        return flag;
    }

    /**
     * 长度是否等于指定长度
     * @param property
     * @param Length
     * @return
     */
    public Boolean checkProperty_length_stand(String property,int Length){
        boolean flag=true;
        if (property.length()!=Length){
            flag = false;
        }
        return flag;
    }

    /**
     * 修改信息时的长度校验
     * @param redTicketBillBO
     * @return
     */
    public ServiceResponse checkAll_update_length(RedTicketBillBO redTicketBillBO){
        String yfpdm = redTicketBillBO.getYfpdm();
        String yfphm = redTicketBillBO.getYfphm();
        String sqdh = redTicketBillBO.getSqdh();
        String hzxxbh = redTicketBillBO.getXxbbh();
        if (yfpdm!=null && !checkProperty_length_stand(yfpdm,10)){
            convertMap(ReturnUtil.createReturnMap(ReturnConstants.PARAM_LENGTH_YFPDM), response);
            return response;
        }
        if (yfphm!=null && !checkProperty_length_stand(yfpdm,8)){
            convertMap(ReturnUtil.createReturnMap(ReturnConstants.PARAM_LENGTH_YFPHM), response);
            return response;
        }
        if (hzxxbh!=null && !checkProperty_length_stand(yfpdm,16)){
            convertMap(ReturnUtil.createReturnMap(ReturnConstants.PARAM_LENGTH_HZXXBH), response);
            return response;
        }
        if (sqdh!=null && !checkProperty_length_stand(sqdh,24)){
            convertMap(ReturnUtil.createReturnMap(ReturnConstants.PARAM_LENGTH_SQDH), response);
            return response;
        }
        return response;


    }
    /**
     * 检验属性是否为空
     * @param property
     */
    public  Boolean checkProperty_null(String property){
        boolean flag=true;
        if(StringUtils.isEmpty(property)) {
            flag = false;
        }
        return flag;
    }
    /**
     * 增加信息时非空判断
     */
    public ServiceResponse checkAll_insert_null(RedTicketBillBO redTicketBillBO){
        String nsrsbh = redTicketBillBO.getNsrsbh();
        String yfpdm = redTicketBillBO.getYfpdm();
        String yfphm = redTicketBillBO.getYfphm();
        String sqyy = redTicketBillBO.getSqly();
        Integer ywlx = redTicketBillBO.getYwlx();
        Integer clzt = redTicketBillBO.getClzt();
        String sqdh = redTicketBillBO.getSqdh();
        String je = redTicketBillBO.getJe();
        String se = redTicketBillBO.getSe();
        Integer tkrid = redTicketBillBO.getTkrid();


       /* String kpzddm = redTicketBillBO.getKpzddm();*/
        String ghdwsbh = redTicketBillBO.getGhdwsbh();
        String ghdwmc = redTicketBillBO.getGhdwmc();
        Date tkrq = redTicketBillBO.getTkrq();
        if (!checkProperty_null(nsrsbh)){
            convertMap(ReturnUtil.createReturnMap(ReturnConstants.PARAM_NO_NSRSBH), response);
            return response;
        }
        if ((redTicketBillBO.getTkrq()==null)){
            convertMap(ReturnUtil.createReturnMap(ReturnConstants.PARAM_NO_TKRQ), response);
            return response;
        }
       /* if (!checkProperty_null(kpzddm)){
            convertMap(ReturnUtil.createReturnMap(ReturnConstants.PARAM_NO_KPZDDM), response);
            return response;
        }*/

        if (!checkProperty_null(ghdwsbh)){
            convertMap(ReturnUtil.createReturnMap(ReturnConstants.PARAM_NO_GHDWSBH), response);
            return response;
        }
        if (!checkProperty_null(ghdwmc)){
            convertMap(ReturnUtil.createReturnMap(ReturnConstants.PARAM_NO_GHDWMC), response);
            return response;
        }
      return response;
    }
    /**
     * 把service返回的map转化为Controller需要的map
     *
     * @param reqMap
     * @param response
     * @return response
     */
    private void convertMap(Map<String, Object> reqMap, ServiceResponse<PageInfo> response) {
        response.setCode(StringUtil.objectToString(reqMap.get(WebServiceConstants.ResponseParam.RETURN_CODE)));
        response.setMessage(StringUtil.objectToString(reqMap.get(WebServiceConstants.ResponseParam.RETURN_MESSAGE)));
    }

    /**
     * 条件查询信息时参数为空的判断
     * @param redTicketBillBO
     * @return
     *//*
    public ServiceResponse checkAll_select_null(RedTicketBillBO redTicketBillBO){
        if (!checkProperty_null(redTicketBillBO.getGhdwmc())){
            convertMap(ReturnUtil.createReturnMap(ReturnConstants.PARAM_GHF_NULL), response);
            return response;
        }
        if (!checkProperty_null(redTicketBillBO.getXxbbh())){
            convertMap(ReturnUtil.createReturnMap(ReturnConstants.PARAM_XXBH_NULL), response);
            return response;
        }

        if (!checkProperty_null(redTicketBillBO.getXhdwmc())){
            convertMap(ReturnUtil.createReturnMap(ReturnConstants.PARAM_XXFMC_NULL), response);
            return response;
        }
        if ((redTicketBillBO.getTkrq()==null)){
            convertMap(ReturnUtil.createReturnMap(ReturnConstants.PARAM_NO_TKRQ), response);
            return response;
        }
        return response;
    }*/



}
