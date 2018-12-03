package com.example.demo.service;

import com.example.demo.bean.RedTicketBillBO;
import com.example.demo.utils.page.PageInfo;

import java.lang.reflect.Array;
import java.util.List;
public interface IRedTicketService {
    /**
     * 获取全部信息
     */
    PageInfo<RedTicketBillBO> getTicketAll(RedTicketBillBO ticketBillBO);

    /**
     * 条件查询信息
     */
    PageInfo<RedTicketBillBO> getTicketListPage(RedTicketBillBO ticketBillBO);

    /**
     * 根据id查询信息
     */
    PageInfo<RedTicketBillBO> getTicketByKey(RedTicketBillBO ticketBillBO);

    /**
     * 购买方增加信息
     */
    Integer InsertTicket(RedTicketBillBO ticketBillBO);

    /**
     * 销货方增加信息
     */
    Integer xhfInsertTicket(RedTicketBillBO ticketBillBO);

    /**
     * 根据id修改信息
     */
    Integer updateTicket(RedTicketBillBO ticketBillBO);
    /**
     * 根据id删除信息
     */
    Integer deleteTicketByKey(RedTicketBillBO ticketBillBO);
    /**
     * 批量删除信息
     */
    Integer deleteTicketList(int[] id_arr);
}
