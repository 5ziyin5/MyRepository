package com.clps.sms.factory;

import com.clps.sms.dao.IAccountDao;
import com.clps.sms.dao.IMenuDao;
import com.clps.sms.dao.impl.AccountDaoImpl;
import com.clps.sms.dao.impl.MenuDaoImpl;

/**
 * 
	 * @date 2017年8月15日
     * @ClassName: sysFactory
     * @Description: TODO(静态工厂模式)
     * @author FengYi
	 * @param
	 * @return
   	 *
 */
public class sysFactory {
	
	public static IMenuDao getIMenuDaoInstance(){
		return new MenuDaoImpl();
	}
	
	public static IAccountDao getIAccountDaoInstance(){
		return new AccountDaoImpl();
	}
}
