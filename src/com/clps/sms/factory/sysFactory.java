package com.clps.sms.factory;

import com.clps.sms.dao.IAccountDao;
import com.clps.sms.dao.IMenuDao;
import com.clps.sms.dao.impl.AccountDaoImpl;
import com.clps.sms.dao.impl.MenuDaoImpl;

/**
 * 
	 * @date 2017��8��15��
     * @ClassName: sysFactory
     * @Description: TODO(��̬����ģʽ)
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
