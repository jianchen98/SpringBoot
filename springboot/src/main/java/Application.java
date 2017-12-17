package main.java;

import java.util.Date;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@MapperScan("main.java.mapper")//将项目中对应的mapper类的路径加进来就可以了
@EnableCaching//开启缓存


public class Application {

	

	    public static void main(String[] args) {
	        SpringApplication.run(Application.class, args);
	    }
}
