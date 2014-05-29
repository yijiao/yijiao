package test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.User;
import com.service.UserService;

public class testService {

	@Test
	public void test() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		UserService us = (UserService) ac.getBean("userService");
		User u = new User();
		u.setName("xingye");
		u.setManage(true);
		u.setPassword("202CB962AC59075B964B07152D234B70");
		us.saveEntity(u);
	}

}
