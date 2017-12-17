package main.java.controller;

import java.util.ArrayList;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import main.java.StudentProperties;
import main.java.entity.Student;
import main.java.entity.User;
import main.java.service.IStudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	private IStudentService service;
	
	@Autowired
	private StudentProperties stupro; 
	
	
	@Value("${cupSIZE}")
	private String cupSIZE;
	 
	 @RequestMapping("/")
	    String home() {
	        return "Hello World!"+cupSIZE;
	    }

	    @RequestMapping("/now")
	    String hehe() {
	        return "现在时间：" + (new Date()).toLocaleString();
	    }
	    
	    @RequestMapping("pojo")
	    private  User getUser(){
	    	User user = new User();
	    	user.setName("rarar");
	    	user.setId(23);
	    	user.setAddrss("jflajlga");
	    	return user;
	    }
	    
	    @RequestMapping("maps")
	    private Map showmaps(){
	    	Map<String ,Object> map =  new HashMap<String,Object>();
	    	map.put("name", "张三丰");
	    	map.put("age", 6666);
	    	return map;
	    }
	    
	    @RequestMapping("list")
	    public List showlist(){
	    	List<String> list = new ArrayList<String>();
	    	list.add("a");
	    	list.add("c");
	    	list.add("d");
	    	list.add("b");
	    	list.add("e");
	    	list.add("f");
	    	list.add("g");
	    	return list;
	    }
	    
	    
	    @RequestMapping("findstudent")
	    public Student findstu(){
	    	Student stu = service.findstudent(stupro.getId());
	    	
	    	System.out.println(stu.getName());
	    	return stu;
	    	
	    }
}
