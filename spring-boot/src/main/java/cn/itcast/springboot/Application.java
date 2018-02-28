package cn.itcast.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;

/**
 * 继承EmbeddedServletContainerCustomizer接口，实现customize方法，可以修改端口
 * @author dee
 *
 */
@SpringBootApplication
public class Application{
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		//关闭启动logo
		/*
		SpringApplication application = new SpringApplication(Application.class);
		application.setBannerMode(Mode.OFF);
		application.run(args);*/
		
	}
	
	/*EmbeddedServletContainerCustomizer*/
	/*@Override
	public void customize(ConfigurableEmbeddedServletContainer container) {
		container.setPort(8081);
	}*/
}
