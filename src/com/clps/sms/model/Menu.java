package com.clps.sms.model;

import java.io.Serializable;
/**
 * 
	 * @date 2017年8月13日
	 *
     * @ClassName: Menu
	 *
     * @Description: TODO(菜单实体类)
	 *
     * @author fy
	 *
	 * @param
	 *
	 * @return
	 *
   	 *
 */
public class Menu implements Serializable{
	private Integer menu_id;
	private String menu_name;
	private String menu_supper_id;
	public Integer getMenu_id() {
		return menu_id;
	}
	public void setMenu_id(Integer menu_id) {
		this.menu_id = menu_id;
	}
	public String getMenu_name() {
		return menu_name;
	}
	public void setMenu_name(String menu_name) {
		this.menu_name = menu_name;
	}
	public String getMenu_supper_id() {
		return menu_supper_id;
	}
	public void setMenu_supper_id(String menu_supper_id) {
		this.menu_supper_id = menu_supper_id;
	}
	
	
}
