package com.example.eduspringservice.service.impl;


import org.springframework.web.bind.annotation.*;

/**
 * 主入口
 * 
 * @author hzc
 *
 */
@RestController
@RequestMapping("/service")
public class MainEnterController {


	@RequestMapping(value = "/success",method = {RequestMethod.POST,RequestMethod.GET})
	public  String  success(@RequestBody(required = false) String param){
		return "success";
	}

}
