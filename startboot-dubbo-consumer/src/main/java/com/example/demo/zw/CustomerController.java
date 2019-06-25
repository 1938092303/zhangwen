package com.example.demo.zw;




import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.annotation.Reference;
import com.zw.service.TicketService;

@Controller
public class CustomerController {
	
	 // 将会得到Ticket服务
    @Reference(retries=2)
    private TicketService ticketService;

   
    @RequestMapping("/test")
    @ResponseBody
    public String index(){
    	if(ticketService==null) {
    		reload();
    	}
        return ticketService.buyTicket();
    }
    
    private void reload() {
    	ApplicationConfig application = new ApplicationConfig();
        application.setName("samples-annotation-consumer");
        
        RegistryConfig registry = new RegistryConfig();
        registry.setAddress("47.104.248.109:2181");
        registry.setProtocol("zookeeper");
 
        ReferenceConfig<TicketService> referenceConfig = new ReferenceConfig<>();
        referenceConfig.setApplication(application);
        referenceConfig.setRegistry(registry);
        referenceConfig.setInterface(TicketService.class);
        ticketService=referenceConfig.get();
    }

}
