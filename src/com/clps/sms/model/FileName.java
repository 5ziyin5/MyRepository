package com.clps.sms.model;

import java.io.Serializable;
/**
 * 
    * @ClassName: FileName
	*
    * @Description: TODO(文件名实体类)
	*
    * @author fy
	*
    * @date 2017年8月11日
	*
 */
public class FileName implements Serializable{
	
	    /**
	    * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	    */
	    
	private static final long serialVersionUID = 1L;

	/**
	 * 学生姓名
	 * 工作上交日期
	 * 总的学生人数
	 */
	private String studentName;
	
	private String workCreatedDate;
	
	private Integer countStudent;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getWorkCreatedDate() {
		return workCreatedDate;
	}

	public void setWorkCreatedDate(String workCreatedDate) {
		this.workCreatedDate = workCreatedDate;
	}

	public Integer getCountStudent() {
		return countStudent;
	}

	public void setCountStudent(Integer countStudent) {
		this.countStudent = countStudent;
	}
	
	
}
