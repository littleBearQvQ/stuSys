package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.pojo.StudentBackUpInfo;

public interface StudentBackUpInfoMapper {
	@Select("Select * From StudentBackUpInfo")
	public List<StudentBackUpInfo> findStudentBackUpInfo();
	
	@Insert("INSERT StudentBackUpInfo VALUES(NULL,#{StudentBackUpInfo.studentno},#{StudentBackUpInfo.studentname},#{StudentBackUpInfo.studentskill},#{StudentBackUpInfo.studentloves},#{StudentBackUpInfo.studentborndate},NOW())")
	public Integer insertStudentBackUpInfo(@Param("StudentBackUpInfo") StudentBackUpInfo StudentBackUpInfo);
	
    int deleteByPrimaryKey(Integer studentid);

    int insert(StudentBackUpInfo record);

    int insertSelective(StudentBackUpInfo record);

    StudentBackUpInfo selectByPrimaryKey(Integer studentid);

    int updateByPrimaryKeySelective(StudentBackUpInfo record);

    int updateByPrimaryKey(StudentBackUpInfo record);
    
}