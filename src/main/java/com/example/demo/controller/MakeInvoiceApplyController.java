package com.example.demo.controller;

import com.example.demo.bean.ApplyBillBO;
import com.example.demo.service.IMakeInvoiceApplyService;
import com.example.demo.utils.PageUtil;
import com.example.demo.utils.RespUtil;
import com.example.demo.utils.RetMessageUtils;
import com.example.demo.utils.ServiceResponse;
import com.example.demo.utils.page.PageInfo;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: demo
 * @description:
 * @author: Hailong
 * @create: 2018-11-14 11:47
 **/
@RequestMapping("invoiceApply")
@RestController
public class MakeInvoiceApplyController {
    private static Logger logger = Logger.getLogger(MakeInvoiceApplyController.class);
    @Autowired
    private IMakeInvoiceApplyService applyService;
    /**
     * 审批-未审批
     */
    private static final Integer NO_APPROVAL = 0;
    /**
     * 审批-已审批
     */
    private static final Integer HAS_APPROVAL = 1;
    /**
     * 审批-已驳回
     */
    private static final Integer HAS_REJECT = 2;
    /**
     * 实际一级审批开始节点代码
     */
    private static final Integer APPROVAL_FIRST_NODE = 0;
    /**
     * 实际二级审批开始节点代码
     */
    private static final Integer APPROVAL_SECOND_NODE = 1;
    /**
     * 实际三级审批开始节点代码
     */
    private static final Integer APPROVAL_THIRD_NODE = 2;
    /**
     * 实际驳回节点代码
     */
    private static final Integer REJECT_NODE = 9;
    /**
     * 申请状态-已提交
     */
    private static final Integer HAS_SUBMIT = 2;

    /**
     * 查询待审批条数
      * apply:条件  sprId:审批人Id
     */

    @PostMapping("countApproval.do")
    public ServiceResponse<Integer> countApproval(@RequestBody ApplyBillBO apply){
        ServiceResponse<Integer> response = new ServiceResponse();
        try {
            RespUtil.setSuccessResp("查询成功",response,applyService.countApproval(apply.getSprId()));
        }catch (Exception e){
            logger.info(e.getMessage());
            RespUtil.setFailResp("查询失败",response);
        }
        return response;
    }
/**
 * 获取申请单-申请 数据列表（分页）
 * @param apply: 查询条件实体  currentPage:当前页数  pageSize:每页条数
 * @Return 结果
 */
    @PostMapping("getApplyList.do")
    public ServiceResponse<PageInfo> getApplyList(@RequestBody ApplyBillBO apply){
        ServiceResponse<PageInfo> response = new ServiceResponse<>();
        try{
            setDefaultPage(apply);
            RespUtil.setSuccessResp("查询成功",response,applyService.getApplyListPage(apply));
        }catch (Exception e){
            logger.info(e.getMessage());
            RespUtil.setFailResp("查询失败",response);

        }
        return response;
    }
/**
 *
 * 获取申请单-审批  数据列表（分页）
 * todo?为什么要先前端转换为后台？有什么意义
 * todo?后台审批状态转换为前台审批状态是为了展示每一个人的状态？
 * @param apply 查询条件实体 currentPage:当前页数 pageSize:每页条数
 * @Return 结果
 * SQZT=2
 */

    @PostMapping("getApprovalList.do")
    public ServiceResponse<PageInfo> getApprovalList(@RequestBody ApplyBillBO apply){
        ServiceResponse<PageInfo> response = new ServiceResponse<>();
        try {
            apply.setSqzt(HAS_SUBMIT);
            //默认分页设置
            setDefaultPage(apply);

            //前端审批状态转换为后台审批状态
            Integer[] realSpzts = setApprovalStatus2Real(apply.getSpzt());
            if (realSpzts == null){
                return RespUtil.setResp(RetMessageUtils.SP_WRONG_PARAM,"审批时出入非法值",response,null);
            }
            apply.setRealSqzts(realSpzts);
            PageInfo pageInfo = applyService.getApprovalListPage(apply);

            //后台审批状态转换为前端审批状态
            List<ApplyBillBO> approvalList = pageInfo.getList();
            boolean flag = CollectionUtils.isEmpty(approvalList);

            if (!flag) {
                Integer sprId = apply.getSprId();
                // 审批查询的审批状态与码表略有不同，只根据实际情况显示本人的：未审批 已审批 已驳回 三种状态的申请单
                for (ApplyBillBO approval:approvalList
                     ) {
                    //判断一级审批人需要返回的审批状态
                    if (sprId == approval.getDysprId()){
                        setApprovalStatus(approval,approval.getSqzt(),APPROVAL_FIRST_NODE,REJECT_NODE);
                    }
                    //判断二级审批人需要返回的审批状态
                    if (sprId == approval.getDesprId()){
                        setApprovalStatus(approval,approval.getSqzt(),APPROVAL_SECOND_NODE,REJECT_NODE);
                    }
                    //判断三级审批人需要返回的审批状态
                    if (sprId == approval.getDesprId()){
                        setApprovalStatus(approval,approval.getSqzt(),APPROVAL_THIRD_NODE,REJECT_NODE);
                    }
                }
            }
            RespUtil.setSuccessResp("查询成功",response,pageInfo);
        }catch (Exception e){
            logger.info(e.getMessage());
            RespUtil.setFailResp("查询失败",response);
        }
        return response;
    }

    /**
     * 保存申请开票数据列表
     * @param apply 实体
     * @return 结果
     * todo?保存的时候为什么lsh、ywbh不可以相同
     */
    @PostMapping("saveApply.do")
    public ServiceResponse<Integer> saveApply(@RequestBody  ApplyBillBO apply){
        ServiceResponse<Integer> response = new ServiceResponse<>();
        try{
            apply.setSpzt(0);
            //流水号验重 lsh 字段校验
            //各种验重 申请表、待开表、发票表

            Integer result = applyService.saveApply(apply);
            if (result == -1){
                RespUtil.setFailResp("请填写发票声明部分",response);
                return response;
            }
            RespUtil.setSuccessResp("保存成功",response,result);
        }catch (Exception e){
            logger.info("保存异常:"+e.getMessage());
            RespUtil.setFailResp("保存失败，请仔细检查提交的数据",response);
        }
        return response;
    }


    /**
     * 审批通过
     * @param apply 通过id进行修改
     *  @return
     */
    @PostMapping("updateApply.do")
    public ServiceResponse<Integer> updateApply(@RequestBody ApplyBillBO apply){
        ServiceResponse<Integer> response = new ServiceResponse<>();
        try{
            //审批通过更新审批状态
            apply.setSpzt(apply.getLevel());
            RespUtil.setSuccessResp("审批成功",response,applyService.updateApply(apply));
        }catch (Exception e){
            logger.info(e.getMessage());
            RespUtil.setFailResp("审批失败，请仔细检查提交的数据",response);
        }
        return response;
    }

    /**
     * 驳回申请
     * @param apply 通过id进行修改
     * @return
     */
    @PostMapping("rejectApply.do")
    public  ServiceResponse<Integer> rejectApply(@RequestBody ApplyBillBO apply){
        ServiceResponse<Integer> response = new ServiceResponse<>();
        try{
            apply.setSpzt(REJECT_NODE);
            RespUtil.setSuccessResp("驳回成功",response,applyService.updateApply(apply));
        }catch (Exception e){
            logger.info(e.getMessage());
            RespUtil.setFailResp("驳回失败",response);
        }
        return response;
    }
    /**
     * 获取申请单详情（审批）
     * @param apply
     * @return
     */
    @PostMapping("getApply.do")
    public ServiceResponse<ApplyBillBO> getApply(@RequestBody ApplyBillBO apply){
        ServiceResponse<ApplyBillBO> response = new ServiceResponse<>();
        try{
            ApplyBillBO applyResult = applyService.getApply(apply);
            applyResult.setLevel(getLevel(apply,applyResult));
            RespUtil.setSuccessResp("查询成功",response,applyResult);
        }catch (Exception e){
            logger.info(e.getMessage());
            RespUtil.setFailResp("查询失败",response);
        }
        return response;
    }





    /**
     * 设置分页默认信息
     *
     * @param apply
     */
    private void setDefaultPage(ApplyBillBO apply) {
        if (apply.getCurrentPage() == null) {
            apply.setCurrentPage(PageUtil.PAGE_NO_DEFAULT);
        }
        if (apply.getPageSize() == null || apply.getPageSize() == 0) {
            apply.setPageSize(PageUtil.PAGE_SIZE_DEFAULT);
        }
    }

    /**
     * 根据实际情况赋值审批需要的状态码
     *
     * @param approval     实际审批
     * @param sqzt         查询入参的申请状态
     * @param approvalNode 审批节点
     * @param rejectNode   驳回节点
     */
    private void setApprovalStatus(ApplyBillBO approval, Integer sqzt, Integer approvalNode, Integer rejectNode) {
        // 未审批
        if (sqzt <= approvalNode) {
            approval.setSpzt(NO_APPROVAL);
        }
        // 已审批
        if (sqzt > approvalNode && sqzt < rejectNode) {
            approval.setSpzt(HAS_APPROVAL);
        }
        // 已驳回
        if (sqzt == rejectNode) {
            approval.setSpzt(HAS_REJECT);
        }
    }
    /**
     * 前端传来的审批状态转换成数据库真实的状态 TODO 还需要考虑到当前审批人是几级审批人的情况
     *
     * @param sqzt 审批前端传来的申请状态
     * @return 数据库真实的申请状态
     */
    private Integer[] setApprovalStatus2Real(Integer sqzt) {
        if (sqzt == NO_APPROVAL) {
            return new Integer[]{0};
        }
        if (sqzt == HAS_APPROVAL) {
            return new Integer[]{1, 2, 3, 4};
        }
        if (sqzt == HAS_REJECT) {
            return new Integer[]{9};
        }
        return null;
    }



    /**
     * 获取审批层级，用于告知前端当前审批节点
     *
     * @param apply
     * @param applyResult
     * @return 1：一级审批；2、二级审批；3、开票人。
     */
    private Integer getLevel(ApplyBillBO apply, ApplyBillBO applyResult) {
        if (apply.getSprId() == applyResult.getDysprId()) {
            return 1;
        }
        if (apply.getSprId() == applyResult.getDesprId()) {
            return 2;
        }
        if (apply.getSprId() == applyResult.getKprId()) {
            return 3;
        }
        return -1;
    }
}
