package com.accp.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.StudentBackUpInfoMapper;
import com.accp.dao.StudentInfoMapper;
import com.accp.pojo.StudentBackUpInfo;
import com.accp.pojo.StudentInfo;

/**
 * 学生系统biz
 * @author 团子等等俺
 *
 */
@Service("StudentSystemBiz")
public class StudentSystemBiz {
			
			@Autowired
			private StudentBackUpInfoMapper sBIMDao;
			
			@Autowired
			private StudentInfoMapper sIDao;
			/**
			 * 查询学生信息
			 * @return
			 */
			public List<StudentInfo> queryStudentInfo(){
				return sIDao.selectStudentInfo();
			}
			/**
			 * 查询保存学生学校
			 * @return
			 */
			public List<StudentBackUpInfo> queryStudentBackUpInfo(){
				return sBIMDao.findStudentBackUpInfo();
			}
			/**
			 * 添加保留学生信息
			 * @param StudentBackUpInfo
			 * @return
			 */
			public Integer addStudentBackUpInfo(StudentBackUpInfo StudentBackUpInfo) {
				return sBIMDao.insertStudentBackUpInfo(StudentBackUpInfo);
			}
			
			
	
}
