package com.accp.pojo;

import java.util.Date;

public class StudentInfo {
    private Integer studentid;

    private String studentno;

    private String studentname;

    private String studentskill;

    private String studentloves;

    private Date studentborndate;

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public String getStudentno() {
        return studentno;
    }

    public void setStudentno(String studentno) {
        this.studentno = studentno == null ? null : studentno.trim();
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname == null ? null : studentname.trim();
    }

    public String getStudentskill() {
        return studentskill;
    }

    public void setStudentskill(String studentskill) {
        this.studentskill = studentskill == null ? null : studentskill.trim();
    }

    public String getStudentloves() {
        return studentloves;
    }

    public void setStudentloves(String studentloves) {
        this.studentloves = studentloves == null ? null : studentloves.trim();
    }

    public Date getStudentborndate() {
        return studentborndate;
    }

    public void setStudentborndate(Date studentborndate) {
        this.studentborndate = studentborndate;
    }
    
    public StudentInfo() {}
    
	public StudentInfo(Integer studentid, String studentno, String studentname, String studentskill,
			String studentloves, Date studentborndate) {
		super();
		this.studentid = studentid;
		this.studentno = studentno;
		this.studentname = studentname;
		this.studentskill = studentskill;
		this.studentloves = studentloves;
		this.studentborndate = studentborndate;
	}

	@Override
	public String toString() {
		return "StudentInfo [studentid=" + studentid + ", studentno=" + studentno + ", studentname=" + studentname
				+ ", studentskill=" + studentskill + ", studentloves=" + studentloves + ", studentborndate="
				+ studentborndate + "]";
	}
	
	
    
    
}