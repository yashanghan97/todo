package com.yashedu.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	
	
	//say-hello
	//http://localhost:8080/say-hello
	@RequestMapping("say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello! Yash What are you learning?";
	}
	
	//say-hello-html
		//http://localhost:8080/say-hello-html
		@RequestMapping("say-hello-html")
		@ResponseBody
		public String sayHelloHtml() {
			StringBuffer sb = new StringBuffer();
			sb.append("<Html>");
			sb.append("<Head>");
			sb.append("<Title>");
			sb.append("My first Html Page");
			sb.append("</Title>");
			sb.append("</Head>");
			sb.append("</Html>");
			
			return sb.toString();
		}
		
		
	// "say-hello-jsp" => sayHello.jsp
	//¹/src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
	@RequestMapping("say-hello-jsp")
	public String sayHelloJsp() {
	return "sayHello";
	}
			
			
	//src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp

}
