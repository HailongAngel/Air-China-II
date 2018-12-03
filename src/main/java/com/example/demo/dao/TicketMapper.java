package com.example.demo.dao;

import com.example.demo.bean.RedTicketBillBO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface TicketMapper {
    List<RedTicketBillBO> selectAll();
    List<RedTicketBillBO> selectTicketList(RedTicketBillBO record);
    List<RedTicketBillBO> selectTicketByKey(RedTicketBillBO record);
    Integer updateTicket(RedTicketBillBO record);
    Integer InsertTicket(RedTicketBillBO record);
    Integer xhfInsertTicket(RedTicketBillBO record);
    Integer deleteTicketByKey(RedTicketBillBO record);
    Integer deleteTicketList(int[] id_arr);

}
