package com.example.demo.dao;

import com.example.demo.bean.ApplyBillBO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ApplyBillMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ApplyBillBO record);

    int insertSelective(ApplyBillBO record);

    ApplyBillBO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ApplyBillBO record);

    int updateByPrimaryKey(ApplyBillBO record);

    int countApproval(Integer id);

    List<ApplyBillBO> selectAll();
    List<ApplyBillBO> selectApplyList(ApplyBillBO record);

    List<ApplyBillBO> selectApprovalList(ApplyBillBO record);

    ApplyBillBO selectApply(ApplyBillBO record);
}