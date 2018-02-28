package cn.itcast.springboot.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

//@RestController
@Controller
public class SpringBootController {
	
	@Resource
	private Environment environment;
	
	@Value("${url}")
	private String url;
	
//	@RequestMapping("/hello")
//	public String hello() throws Exception{
//		
//		/**
//		 * 调用的是java的Properties类的load方法，所以默认是iso-8859-1的编码
//		 * 如果配置文件是iso-8859-1编码的，就不会有问题，如果是utf-8的，要自己手动解码
//		 */
//		String name = new String(environment.getProperty("name").getBytes("iso-8859-1"),"utf-8");
//		System.out.println(url);
//		System.out.println(name);
//		System.out.println(environment.getProperty("name"));
//		
//		return "Hello Spring-Boot";
//	}
	
	
	@RequestMapping("/free/{id}")
	public String free(@PathVariable("id")int id,Map<String, Object> root){
		//Map<String,Object> root = new HashMap<>();
		root.put("name", "dee");
		root.put("id", id);
		return "user/list";
	}
	
	
}
