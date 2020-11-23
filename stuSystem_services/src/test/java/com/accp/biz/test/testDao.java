package com.accp.biz.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.accp.biz.StudentSystemBiz;
import com.accp.pojo.StudentBackUpInfo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/spring-ctx.xml")
public class testDao {
			
			@Autowired
			private StudentSystemBiz sBiz;
			
			@Test
			public void testQueryStudentInfo() {
				sBiz.queryStudentInfo().forEach(infos->{
					System.out.println(infos.toString());
				});
			}
			
			@Test
			public void testQueryStudentBackUpInfo() {
				sBiz.queryStudentBackUpInfo().forEach(infos->{
					System.out.println(infos.toString());
				});
			}
			
			@Test
			public void testAddStudentBackUpInfo() {
				//System.out.println(sBiz.addStudentBackUpInfo(new StudentBackUpInfo(null,"s002","大大熊","Java","吃饭","2020-1-1",null)));
			}
	
}
