package com.zw.service.impl;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.zw.service.TicketService;

@Service(interfaceClass=TicketService.class)
@Component
public class TicketServiceImpl implements TicketService{

	@Override
	public String buyTicket() {
		return "《死亡笔记》";
	}

}
