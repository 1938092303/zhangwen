package com.zw.api;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zw.job.ElasticJobHandler;
import com.zw.utils.DateUtil;

@Controller
public class ElasticJobController {
	
	@Autowired
	private ElasticJobHandler elasticJobHandler;

	@ResponseBody
	@RequestMapping("/add")
	public Object add() {
		Date startTime = new Date();
		startTime.setTime(startTime.getTime() + 3000);
		String cron = DateUtil.getCron(startTime);
		try {
			elasticJobHandler.addJob("myjob:" + cron, cron, 2, "66666", "0=A,1=B");
		} catch (Exception e) {
			e.printStackTrace();
			return "false";
		}
		return "success";
	}

}
