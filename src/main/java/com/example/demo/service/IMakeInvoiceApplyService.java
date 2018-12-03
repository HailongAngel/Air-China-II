package com.example.demo.service;

import com.example.demo.bean.ApplyBillBO;
import com.example.demo.bean.ApplyBillLineBO;
import com.example.demo.utils.page.PageInfo;

import java.util.List;

/**
 * @program: demo
 * @description:
 * @author: Hailong
 * @create: 2018-11-09 16:08
 **/
public interface IMakeInvoiceApplyService {


/**
 * 查询待审批条数
 * @param  id,当前用户id
 * @return  待审批条数
 */
Integer countApproval(Integer id);

/**
 * 条件查询申请信息
 * @param applyBillBO 条件
 * @return  查询结果
 */
    PageInfo<ApplyBillBO> getApplyListPage(ApplyBillBO applyBillBO);

    /**
     * 条件查询审批信息
     * @param applyBillBO 条件
     *  @return
     */
    PageInfo<ApplyBillBO> getApprovalListPage(ApplyBillBO applyBillBO);

    /**
     * 保存申请单信息
     */
    Integer saveApply(ApplyBillBO applyBillBO);
    /**
     * 保存申请单行信息
     */
    Integer saveApplyLineBatch(List<ApplyBillLineBO> applyBillLineBO);

    /**
     * 修改申请单信息
     * @param apply
     * @return
     */
    Integer updateApply(ApplyBillBO apply);


    /**
     * 查询申请单详情
     * @param apply
     * @return 申请单信息（带行信息）
     */
    ApplyBillBO getApply(ApplyBillBO apply);
}
