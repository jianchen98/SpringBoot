package main.java.serviceImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List
;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import main.java.entity.Student;
import main.java.mapper.StudentMapper;
import main.java.service.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private StudentMapper studentmapper;
	
//	@Cacheable(value="findall")
	public Student findstudent(int userid) {
		/*try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "test", "test"); 
			System.out.println("链接数据库成功"+conn);
			Statement statement =conn.createStatement();
			 ResultSet rs = statement.executeQuery( "select * from student where id=3 " );  
		  while(rs.next()){
			  String name = rs.getString("name");    
              String age = rs.getString("age");    
              String sex = rs.getString("sex");    
              System.out.println(name+age+sex);
		  }
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		System.out.println("第二次，没有打印，说明执行缓存。");
		return studentmapper.selectUserById(userid);
	}

}
