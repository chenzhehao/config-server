package com.czh.cloud.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Title: BootOfRocketMq.java Description: Copyright: Copyright (c) 2018
 * Company: www.chenzhehao.com
 * 
 * @author chenzhehao
 * @date 2018年5月24日
 * @version 1.0
 */
@SpringBootApplication
@EnableConfigServer //添加@EnableConfigServer注解，表明这是一个Config Server端
@RestController
public class BootOfConfigServer {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(BootOfConfigServer.class, args);
	}

	@RequestMapping("test")
	public Object test(){
		return "test";
	}
}
