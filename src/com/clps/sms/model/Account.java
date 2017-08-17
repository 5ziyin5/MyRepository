package com.clps.sms.model;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Date;

/**
 * 
 * @ClassName: Account
 * @Description: TODO(账户实体类)
 * @author ASUS
 * @date 2017年8月8日
 *
 */
public class Account implements Serializable, Comparator<Account> {
	/**
	 * 将excel表中的数据模型加到model中
	 */
	private Integer acc_id;
	private String acc_name;
	private String acc_password;
	private String acc_email;
	private String acc_desc;
	private String acc_mobile;
	private String acc_created_date;
	private String acc_created_name;
	private String acc_update_date;
	private String acc_updateed_name;

	private Integer acc_status;
	private Integer acc_role_id;

	public Account() {
		super();
	}

	public Integer getAcc_id() {
		return acc_id;
	}

	public void setAcc_id(Integer acc_id) {
		this.acc_id = acc_id;
	}

	public String getAcc_name() {
		return acc_name;
	}

	public void setAcc_name(String acc_name) {
		this.acc_name = acc_name;
	}

	public String getAcc_password() {
		return acc_password;
	}

	public void setAcc_password(String acc_password) {
		this.acc_password = acc_password;
	}

	public String getAcc_email() {
		return acc_email;
	}

	public void setAcc_email(String acc_email) {
		this.acc_email = acc_email;
	}

	public String getAcc_desc() {
		return acc_desc;
	}

	public void setAcc_desc(String acc_desc) {
		this.acc_desc = acc_desc;
	}

	public String getAcc_mobile() {
		return acc_mobile;
	}

	public void setAcc_mobile(String acc_mobile) {
		this.acc_mobile = acc_mobile;
	}

	public String getAcc_created_name() {
		return acc_created_name;
	}

	public void setAcc_created_name(String acc_created_name) {
		this.acc_created_name = acc_created_name;
	}

	public String getAcc_created_date() {
		return acc_created_date;
	}

	public void setAcc_created_date(String acc_created_date) {
		this.acc_created_date = acc_created_date;
	}

	public String getAcc_update_date() {
		return acc_update_date;
	}

	public void setAcc_update_date(String acc_update_date) {
		this.acc_update_date = acc_update_date;
	}

	public String getAcc_updateed_name() {
		return acc_updateed_name;
	}

	public void setAcc_updateed_name(String acc_updateed_name) {
		this.acc_updateed_name = acc_updateed_name;
	}

	public Integer getAcc_status() {
		return acc_status;
	}

	public void setAcc_status(Integer acc_status) {
		this.acc_status = acc_status;
	}

	public Integer getAcc_role_id() {
		return acc_role_id;
	}

	public void setAcc_role_id(Integer acc_role_id) {
		this.acc_role_id = acc_role_id;
	}

	/**
	 * 重写compare()方法;方便进行排序
	 */
	@Override
	public int compare(Account o1, Account o2) {
		if (o1.getAcc_name().compareTo(o2.getAcc_name()) > 0)
			return 1;// 正序
		else
			return -1;// 倒序

	}
}
