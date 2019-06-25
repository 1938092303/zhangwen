package com.zw.api;



import java.util.List;
import java.util.Random;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class KafkaController {
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	
	@RequestMapping("/send")
	@ResponseBody
	public String send() {
		for(int i=0;i<100;i++) {
			kafkaTemplate.send("test", "消息来自java客户端"+i);
		}		
		return null;
	}
	
	@RequestMapping("/recive")
	@ResponseBody
	@KafkaListener(topics="test")
	public String recive(ConsumerRecord<String, String> record) {
		
		System.out.println("topic is:"+record.topic()+"value:"+record.value()+"偏移量："+record.offset());
				return null;
	}
}
