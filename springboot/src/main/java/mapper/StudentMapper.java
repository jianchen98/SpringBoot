package main.java.mapper;



import org.apache.ibatis.annotations.Mapper;

import main.java.entity.Student;

@Mapper
public interface StudentMapper {
	    public Student selectUserById(Integer userId);  
}
