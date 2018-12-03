package com.example.demo.dao;

import com.example.demo.bean.ApplyBillLineBO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ApplyBillLineMapper {
    int  insertApplyLineBatch(List<ApplyBillLineBO> list);
}
