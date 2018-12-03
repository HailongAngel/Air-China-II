package com.example.demo.controller;

import com.example.demo.bean.ApplyBillBO;
import com.example.demo.dao.ApplyBillMapper;
import com.example.demo.utils.RespUtil;
import com.example.demo.utils.page.PageInfo;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import com.example.demo.utils.ServiceResponse;
/**
 * @author Song Rx
 * @date 2018/11/8
 * @Description
 */

@RestController
public class TestController {
    private static Logger logger = Logger.getLogger(TestController.class);

    @Autowired
    private ApplyBillMapper mapper;



    /**
     *
     *
     * 为什么字段里面没有的，他可以查到
     * @param id
     * @return
     */
    @GetMapping("testQuery")
    public ApplyBillBO testQuery(Integer id){
        return mapper.selectByPrimaryKey(id);
    }
   /* @PostMapping("testUpdate")
    public int testUpdate(@RequestBody ApplyBillBO applyBillBO){
        return mapper.updateByPrimaryKeySelective(applyBillBO);
    }*/
    @PostMapping("testInsertSelective")
    public int testInsertSelective(@RequestBody ApplyBillBO applyBillBO){
      return mapper.insertSelective(applyBillBO);
    }

   @PostMapping("testInsert")
    public int testInsert( @RequestBody ApplyBillBO applyBillBO){
        return mapper.insert(applyBillBO);
   }

   @GetMapping("testDelete")
    public int testDelete(Integer id){
        return mapper.deleteByPrimaryKey(id);
   }

   @GetMapping("testSelectAll")
    public List<ApplyBillBO> testQueryAll(){
        return mapper.selectAll();
   }

    /**
     * 查询待审批条数
     * @param id
     * @return
     */
   @GetMapping("countApproval")
   @ResponseBody
    public ServiceResponse<Integer> testCountApproval(Integer id){
       ServiceResponse<Integer> response = new ServiceResponse<>();
        try{
            RespUtil.setSuccessResp("查询成功",response,mapper.countApproval(id));
        }catch (Exception e){
            logger.info(e.getMessage());
            RespUtil.setFailResp("查询失败",response);
        }

        return response;


   }

    /**
     * 获取申请单-申请   数据列表（分页）
     * currentPage:当前页数 pageSize:每页条数
     * todo有什么用，和selectAll有什么区别
     */
    @PostMapping("applyList")
    public ServiceResponse<List> getApplyList(@RequestBody ApplyBillBO applyBillBO){
        ServiceResponse<List> response = new ServiceResponse<>();
        try{
            RespUtil.setSuccessResp("查询成功",response,mapper.selectApplyList(applyBillBO));
        }catch (Exception e){
            logger.info("查询失败",e);
            RespUtil.setFailResp("查询失败",response);
        }
        return response;
    }
    /*
    public List<ApplyBillBO> testApplyList(@RequestBody ApplyBillBO applyBillBO){
        return mapper.selectApplyList(applyBillBO);
    }*/


    /**
     * 获取申请单-审批
     */
    @PostMapping("selectApprovalList")
    public ServiceResponse<List> testApprovalList(@RequestBody ApplyBillBO applyBillBO){
        ServiceResponse<List> response = new ServiceResponse<>();
        try {
            RespUtil.setSuccessResp("查询成功",response,mapper.selectApprovalList(applyBillBO));

        }catch (Exception e ){
            logger.info("查询失败",e);
            RespUtil.setFailResp("查询失败",response);
        }
        return response;
    }

    /**
     * todo?保存的时候为什么lsh、ywbh不可以相同
     * 保存申请开票数据列表
     */

     @PostMapping("saveApply.do")
    public ServiceResponse<Integer> saveApply(@RequestBody ApplyBillBO applyBillBO){
        /* return mapper.insertSelective(applyBillBO);*/
         ServiceResponse<Integer> response = new ServiceResponse<>();
         try {
               RespUtil.setSuccessResp("保存成功",response,mapper.insertSelective(applyBillBO));
         }catch (Exception e){
             logger.info("保存异常"+e.getMessage());
             RespUtil.setFailResp("保存失败，请仔细检查提交的数据",response);
         }
         return response;

     }






    /**
     * 审批通过
     */
    @PostMapping("updateApply.do")
    public ServiceResponse<Integer> updateApply(@RequestBody ApplyBillBO applyBillBO){
       /* return  mapper.updateByPrimaryKeySelective(applyBillBO);*/
        ServiceResponse<Integer> response = new ServiceResponse<>();
        try{

            RespUtil.setSuccessResp("审批成功",response,mapper.updateByPrimaryKeySelective(applyBillBO));
        }catch (Exception e){
            logger.info(e.getMessage());
            RespUtil.setFailResp("审批失败，请仔细检查提交的数据",response);
        }
        return response;
    }

    /**
     *驳回申请
     */
    @PostMapping("rejectApply.do")
    public ServiceResponse<Integer> rejectApply(@RequestBody ApplyBillBO applyBillBO){
        ServiceResponse<Integer> response = new ServiceResponse<>();
        try {
            RespUtil.setSuccessResp("驳回成功",response, mapper.updateByPrimaryKeySelective(applyBillBO));
        }catch (Exception e){
            logger.info(e.getMessage());
            RespUtil.setFailResp("驳回失败",response);
        }
        return response;
    }

    /**
     * 获取申请单详情（审批）
     */
   @PostMapping("getApply.do")
    public ServiceResponse<ApplyBillBO> getApply(@RequestBody ApplyBillBO applyBillBO){
       ServiceResponse<ApplyBillBO> response = new ServiceResponse();
       try {
           RespUtil.setSuccessResp("查询成功",response,mapper.selectApply(applyBillBO));
       }catch (Exception e){
            logger.info(e.getMessage());
            RespUtil.setFailResp("查询失败",response);
       }
     return response;
    /*   return  mapper.selectApply(applyBillBO);*/
   }

}



