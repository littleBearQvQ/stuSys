package com.accp.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.StudentSystemBiz;
import com.accp.pojo.StudentBackUpInfo;
import com.accp.pojo.StudentInfo;
/**
 * 学生系统action
 * @author 团子等等俺
 *
 */
@RestController
@RequestMapping("/api/studentSystem")
public class StudentSystemAction {
			
			@Autowired
			private StudentSystemBiz sBiz;
			/**
			 * 查询学生信息
			 * @return
			 */
			@GetMapping("/studentInfo")
			public List<StudentInfo> queryStudentInfo(){
				return sBiz.queryStudentInfo();
			}
			/**
			 * 查询保存学生学校
			 * @return
			 */
			@GetMapping("/studentBackUpInfo")
			public List<StudentBackUpInfo> queryStudentBackUpInfo(){
				return sBiz.queryStudentBackUpInfo();					
			}
			/**
			 * 新增保存学生信息
			 * @param StudentBackUpInfo
			 * @return
			 */
			@PostMapping("/saveStudentInfo")
			public Map<String, String> addStudentBackUpInfo(@RequestBody StudentBackUpInfo[] StudentBackUpInfo) {
				Map<String,String> resultMap = new HashMap<String, String>();
				for (int i = 0; i < StudentBackUpInfo.length; i++) {
					sBiz.addStudentBackUpInfo(StudentBackUpInfo[i]);
				}				
					resultMap.put("code", "200");
					resultMap.put("msg", "success");
				return resultMap;
			}
		
}
