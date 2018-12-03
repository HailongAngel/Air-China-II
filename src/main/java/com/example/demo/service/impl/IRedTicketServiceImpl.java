package com.example.demo.service.impl;

import com.example.demo.bean.RedTicketBillBO;
import com.example.demo.dao.TicketMapper;
import com.example.demo.service.IRedTicketService;
import com.example.demo.utils.page.PageInfo;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: demo
 * @description:
 * @author: Hailong
 * @create: 2018-11-19 17:28
 **/
@Service
public class IRedTicketServiceImpl implements IRedTicketService {

    @Autowired
    private TicketMapper ticketMapper;
    @Override
    public PageInfo<RedTicketBillBO> getTicketAll(RedTicketBillBO ticketBillBO) {
        PageHelper.startPage(ticketBillBO.getCurrentPage(),ticketBillBO.getPageSize());
        List<RedTicketBillBO> list = ticketMapper.selectAll();
        PageInfo<RedTicketBillBO> pageInfo = new PageInfo(list);
        return pageInfo;
    }



    @Override
    public PageInfo<RedTicketBillBO> getTicketListPage(RedTicketBillBO ticketBillBO) {
        PageHelper.startPage(ticketBillBO.getCurrentPage(),ticketBillBO.getPageSize());
        List<RedTicketBillBO> list = ticketMapper.selectTicketList(ticketBillBO);
        PageInfo<RedTicketBillBO> pageInfo = new PageInfo(list);
        return pageInfo;
    }

    @Override
    public PageInfo<RedTicketBillBO> getTicketByKey(RedTicketBillBO ticketBillBO) {
        PageHelper.startPage(ticketBillBO.getCurrentPage(),ticketBillBO.getPageSize());
        List<RedTicketBillBO> list = ticketMapper.selectTicketByKey(ticketBillBO);
        PageInfo<RedTicketBillBO> pageInfo = new PageInfo(list);
        return pageInfo;
    }
    @Override
    public Integer updateTicket(RedTicketBillBO ticketBillBO) {
        Integer update = ticketMapper.updateTicket(ticketBillBO);
        return update;
    }
    @Override
    public Integer deleteTicketByKey(RedTicketBillBO ticketBillBO) {
        Integer update = ticketMapper.deleteTicketByKey(ticketBillBO);
        return update;
    }

    @Override
    public Integer deleteTicketList(int[] id_arr) {
        return ticketMapper.deleteTicketList(id_arr);
    }

    @Override
    public Integer InsertTicket(RedTicketBillBO ticketBillBO) {
       Integer ticket = ticketMapper.InsertTicket(ticketBillBO);
        return ticket;
    }

    @Override
    public Integer xhfInsertTicket(RedTicketBillBO ticketBillBO) {
        Integer ticket = ticketMapper.xhfInsertTicket(ticketBillBO);
        return ticket;
    }

}
