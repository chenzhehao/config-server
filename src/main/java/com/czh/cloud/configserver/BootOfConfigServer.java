package com.czh.cloud.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Title: BootOfRocketMq.java Description: Copyright: Copyright (c) 2018
 * Company: www.chenzhehao.com
 *
 * @author chenzhehao
 * @version 1.0
 * @date 2018年5月24日
 */
@SpringBootApplication
@EnableConfigServer //添加@EnableConfigServer注解，表明这是一个Config Server端
@RestController
@EnableDiscoveryClient
public class BootOfConfigServer {

    public static void main(String[] args) throws Exception {
        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("windows")) {
            System.setProperty("log.path", "D:/chenzhehao/workspace/czh");
        } else {
            System.setProperty("log.path", "/Users/chenzhehao/Documents/springcloud");
        }
        System.setProperty("context.name", "config-server");

        SpringApplication.run(BootOfConfigServer.class, args);
    }

    @RequestMapping("/test")
    public Object test() {
        return "test";
    }
}
