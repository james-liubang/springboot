package com.flysky.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @SpringBootApplication  : The current class is a stater of your application
 * @SpringBootConfiguration: @Configuration get configuration information by Bean Object
 * @Configuration          : Replace spring 's XML configuration by Bean Object.
 * @EnableAutoConfiguration: Auto initialize basic on the register of pom.xml, for example, 
 *                           it auto-configure web.xml and scan the component 
 *                           when it has starter-web .
 * @ComponentScan          : Complete the scanning of components register, to replace the spring component
 *                           <context:component-scan package="xxx.xxx.xxx">  in the xml.
 * @author CHENGBANGLIU
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class,args);
	}
}
