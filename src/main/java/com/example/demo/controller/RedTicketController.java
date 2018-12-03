package com.example.demo.controller;

import com.example.demo.bean.RedTicketBillBO;
import com.example.demo.bean.RedTicketIds;
import com.example.demo.service.IRedTicketService;
import com.example.demo.utils.*;
import com.example.demo.utils.page.PageInfo;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Map;

/**
 * @program: demo
 * @description: 红票信息管理
 * @author: Hailong
 * @create: 2018-11-19 15:55
 **/
@RequestMapping("redTicket")
@RestController
public class RedTicketController {
    private static Logger logger = Logger.getLogger(MakeInvoiceApplyController.class);
    @Autowired
    private IRedTicketService ticketService;
    @Autowired
    private Check check;
    /**
     * 获取全部信息列表
     * @param
     * @return 全部信息
     */
    @PostMapping(value = "getTicketAll.do")
    public ServiceResponse<PageInfo> getTicketAll(RedTicketBillBO ticket){
        ServiceResponse<PageInfo> response = new ServiceResponse();
        try {
            setDefaultPage(ticket);
            if (ticketService.getTicketAll(ticket)!=null){
                RespUtil.setSuccessResp("查询成功",response,ticketService.getTicketAll(ticket));
            }
            else {
                response.setCode("9999");
                response.setMessage("数据不存在！");
            }

        }catch (Exception e){
            logger.info("查询失败",e);
            RespUtil.setFailResp("查询失败",response);
        }
        return response;

    }
    /**
     *条件查询信息
     * @param ticket 对象实体，里面包含了需要查询的条件  currentPage：当前页数， pageSize：每页条数
     * @return 根据条件查询出来的结果
     */
    @PostMapping(value = "getTicketList.do")
    public ServiceResponse<PageInfo> getTicketList(@RequestBody RedTicketBillBO ticket){
        ServiceResponse<PageInfo> response = new ServiceResponse<>();
        try {
            setDefaultPage(ticket);
            if (ticketService.getTicketListPage(ticket)!=null){
                /*ServiceResponse response_check_null = check.checkAll_select_null(ticket);
                if (!"0000".equals(response_check_null.getCode())){
                    return response_check_null;
                }*/
                RespUtil.setSuccessResp("查询成功",response,ticketService.getTicketListPage(ticket));
            }else{
                response.setCode("9999");
                response.setMessage("数据不存在！");
            }
        }catch (Exception e){
            logger.info("查询失败",e);
            RespUtil.setFailResp("查询失败",response);
        }
        return response;
    }
    /**
     * 根据id查询
     * @param ticket 实体（里面包含了需要查询的id）
     * @return 实体对象
     */
    @PostMapping(value = "getTicketByKey.do")
    public ServiceResponse<PageInfo> getTicketByKey(@RequestBody RedTicketBillBO ticket ){
        ServiceResponse<PageInfo> response = new ServiceResponse<>();
        try{
            setDefaultPage(ticket);
            PageInfo data = ticketService.getTicketByKey(ticket);
            if (data!=null){
                RespUtil.setSuccessResp("查询成功",response,data);
            }
            else {
                response.setCode("9999");
                response.setMessage("编号有错或者信息不存在！");
            }
        }catch (Exception e){
            logger.info("查询失败",e);
            RespUtil.setFailResp("查询失败",response);
        }
        return response;
    }
    /**
     * 增加信息
     * todo?需求中有的但是数据库中没有的应该怎么办？
     */
    @PostMapping(value = "InsertTicket.do")
    public ServiceResponse<Integer> InsertTicket(@RequestBody RedTicketBillBO ticket){
        ServiceResponse<Integer> response = new ServiceResponse<>();
        try{
            ServiceResponse checkAll_insert_null = check.checkAll_insert_null(ticket);
            if (!"0000".equals(checkAll_insert_null.getCode())){
                return checkAll_insert_null;
            }
            RespUtil.setSuccessResp("信息添加成功",response,ticketService.InsertTicket(ticket));
        }catch (Exception e){
            logger.info("添加失败",e);
            RespUtil.setFailResp("添加失败",response);
        }
        return response;
    }
    /**
     * 修改信息
     */
    @PostMapping(value = "updateTicket.do")
    public ServiceResponse<Integer> updateTicket(@RequestBody RedTicketBillBO ticket){
        ServiceResponse<Integer> response = new ServiceResponse<>();
        try{
            ServiceResponse checkAll_update_length = check.checkAll_update_length(ticket);
            if (!"0000".equals(checkAll_update_length.getCode())){
                return checkAll_update_length;
            }
            RespUtil.setSuccessResp("信息修改成功",response,ticketService.updateTicket(ticket));
        }catch (Exception e){
            logger.info("修改失败",e);
            RespUtil.setFailResp("修改失败",response);
        }
        return response;
    }
    /**
     * 根据id删除信息
     * @param    ticket(需要传入特定的id)
     *  @return 结果
     */
    @PostMapping(value = "deleteTicketByKey.do")
    public ServiceResponse<Integer> deleteTicketByKey(@RequestBody RedTicketBillBO ticket){
        ServiceResponse<Integer> response = new ServiceResponse<>();
        try{
                RespUtil.setSuccessResp("已经删除",response,ticketService.deleteTicketByKey(ticket));
        }catch (Exception e){
            logger.info("删除失败",e);
            RespUtil.setFailResp("删除失败",response);
        }
        return response;
    }
    /**
     * 进行批量删除
     * @param   ticketIds (需要传入id数组）
     * @return  是否删除成功
     */
    @PostMapping(value = "deleteTicketList.do")

    public ServiceResponse<Integer> deleteTicketList(@RequestBody RedTicketIds ticketIds){
        ServiceResponse<Integer> response = new ServiceResponse<>();
        try{
            int count = ticketService.deleteTicketList(ticketIds.getValues());
            if(count > 0){
                RespUtil.setSuccessResp("批量删除成功",response,count);
            }else {
                response.setCode(RetMessageUtils.EXCEPTION);
                response.setMessage("输入参数出错，数据不存在！");
            }
        }catch (Exception e){
            logger.info("删除失败",e);
            RespUtil.setFailResp("删除失败",response);
        }
        return response;
    }

    /**
     * 设置分页默认信息
     *
     * @param red
     */
    private void setDefaultPage(RedTicketBillBO red) {
        if (red.getCurrentPage() == null) {
            red.setCurrentPage(PageUtil.PAGE_NO_DEFAULT);
        }
        if (red.getPageSize() == null || red.getPageSize() == 0) {
            red.setPageSize(PageUtil.PAGE_SIZE_DEFAULT);
        }
    }

    /**
     * 把service返回的map转化为Controller需要的map
     *
     * @param reqMap
     * @param response
     * @return response
     */
    private void convertMap(Map<String, Object> reqMap, ServiceResponse response) {
        response.setCode(StringUtil.objectToString(reqMap.get(WebServiceConstants.ResponseParam.RETURN_CODE)));
        response.setMessage(StringUtil.objectToString(reqMap.get(WebServiceConstants.ResponseParam.RETURN_MESSAGE)));
    }


}
