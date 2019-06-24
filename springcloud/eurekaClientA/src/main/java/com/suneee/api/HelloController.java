package com.suneee.api;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.suneee.entity.MD5entity;
import com.suneee.entity.Sumentity;
import com.suneee.utils.MD5Utils;
import com.suneee.utils.ResponseVO;

@Controller
public class HelloController {
	
	@RequestMapping("/MD5")
	@ResponseBody
	public ResponseVO hello(@RequestBody MD5entity md5){
		ResponseVO responseVO=new ResponseVO();
		md5.setValue(MD5Utils.getMd5(md5.getValue()));
		responseVO.setData(md5);
		return responseVO;	
	}
	
	@RequestMapping("/sum")
	@ResponseBody
	public ResponseVO sum(@RequestBody Sumentity sum){
		ResponseVO responseVO=new ResponseVO();
		responseVO.setData(sum.getA()+sum.getB());
		return responseVO;
		
	}
	
	@RequestMapping("/mul")
	@ResponseBody
	public ResponseVO mul(@RequestBody Sumentity sum){
		ResponseVO responseVO=new ResponseVO();
		responseVO.setData(sum.getA()*sum.getB());
		return responseVO;
		
	}

}
