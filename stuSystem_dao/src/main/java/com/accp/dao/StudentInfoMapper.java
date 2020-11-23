package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.accp.pojo.StudentInfo;

public interface StudentInfoMapper {
	
	@Select("Select * From studentinfo")
	List<StudentInfo> selectStudentInfo();
	
    int deleteByPrimaryKey(Integer studentid);

    int insert(StudentInfo record);

    int insertSelective(StudentInfo record);

    StudentInfo selectByPrimaryKey(Integer studentid);

    int updateByPrimaryKeySelective(StudentInfo record);

    int updateByPrimaryKey(StudentInfo record);
}