package com.clps.sms.model;

import java.io.Serializable;
/**
 * 
    * @ClassName: FileName
	*
    * @Description: TODO(�ļ���ʵ����)
	*
    * @author fy
	*
    * @date 2017��8��11��
	*
 */
public class FileName implements Serializable{
	
	    /**
	    * @Fields serialVersionUID : TODO(��һ�仰�������������ʾʲô)
	    */
	    
	private static final long serialVersionUID = 1L;

	/**
	 * ѧ������
	 * �����Ͻ�����
	 * �ܵ�ѧ������
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
