package com.example.demo.service.impl;

import com.example.demo.bean.ApplyBillBO;
import com.example.demo.bean.ApplyBillLineBO;
import com.example.demo.dao.ApplyBillLineMapper;
import com.example.demo.dao.ApplyBillMapper;
import com.example.demo.service.IMakeInvoiceApplyService;
import com.example.demo.utils.page.PageInfo;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @program: demo
 * @description:
 * @author: Hailong
 * @create: 2018-11-09 16:12
 **/

@Service
public class IMakeInvoiceApplyServiceImpl implements IMakeInvoiceApplyService{


    @Autowired
    private ApplyBillMapper applyMapper;


    @Autowired
    private ApplyBillLineMapper applyLineMapper;

    @Override
    public Integer countApproval(Integer id) {
        return applyMapper.countApproval(id);
    }

    @Override
    public PageInfo<ApplyBillBO> getApplyListPage(ApplyBillBO applyBillBO) {
        PageHelper.startPage(applyBillBO.getCurrentPage(),applyBillBO.getPageSize());
        List<ApplyBillBO> list = applyMapper.selectApplyList(applyBillBO);
        PageInfo<ApplyBillBO> pageInfo = new PageInfo<>(list);
        return pageInfo;

    }

    @Override
    public PageInfo<ApplyBillBO> getApprovalListPage(ApplyBillBO applyBillBO) {
        PageHelper.startPage(applyBillBO.getCurrentPage(),applyBillBO.getPageSize());
        List<ApplyBillBO> list = applyMapper.selectApprovalList(applyBillBO);
        PageInfo<ApplyBillBO> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    /**
     * 保存头信息，保存字段信息
     * @param applyBillBO
     * @return
     */
    @Override
    public Integer saveApply(ApplyBillBO applyBillBO) {
        List<ApplyBillLineBO> list = applyBillBO.getApplyBillLineBOList();
        if(CollectionUtils.isEmpty(list)){
            return  -1;
        }
        int appId = applyMapper.insertSelective(applyBillBO);
        for (ApplyBillLineBO line:list){
            line.setApplyId(applyBillBO.getId());
        }
        int lineCount = applyLineMapper.insertApplyLineBatch(list);
        return appId + lineCount;
    }

    @Override
    public Integer saveApplyLineBatch(List<ApplyBillLineBO> applyBillLineBO) {
        return null;
    }

    @Override
    public Integer updateApply(ApplyBillBO apply) {
        return  applyMapper.updateByPrimaryKeySelective(apply);
    }

    @Override
    public ApplyBillBO getApply(ApplyBillBO apply) {
        return applyMapper.selectApply(apply);
    }
}
