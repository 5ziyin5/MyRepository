package com.clps.sms.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.clps.sms.model.Account;
/**
 * 
	 * @date 2017��8��12��
	 *
     * @ClassName: IAccountDao
	 *
     * @Description: TODO(���˻��������dao��Ľӿ�)
	 *
     * @author fy
	 *
	 * @param
	 *
	 * @return
	 *
   	 *
 */
public interface IAccountDao {
	/**
	 * @throws SQLException 
	 * 
	    * @Title: queryAllAccount
	    * @Description: TODO(��ѯȫ��)
	    * @param 
	    * @return    ����
	    * @return List<Account>    ��������
	    * @throws
	 */
	public List<Account> queryAllAccount(Object[] objects) throws SQLException;
	
	/**
	 * @throws SQLException 
	 * 
	    * @Title: queryAllAccountByCondition
	    * @Description: TODO(������һ�仰�����������������)
	    * @param @param acc
	    * @param @return    ����
	    * @return List<Account>    ��������
	    * @throws
	 */
	public List<Account> queryAllAccountByCondition(Account acc) throws SQLException;
	
	/**
	 * @throws SQLException 
	 * 
	    * @Title: queryAllAccountByMobile
	    * @Description: TODO(���ݵ绰��ѯȫ���˻�)
	    * @param @param acc_mobile
	    * @param @return    ����
	    * @return boolean    ��������
	    * @throws
	 */
	public boolean queryAllAccountByMobile(Object[] objects) throws SQLException;
	
	/**
	 * @throws SQLException 
	 * 
	    * @Title: queryAccountByName
	    * @Description: TODO(�����û�����ѯ�˻�)
	    * @param @param acc_name
	    * @param @return    ����
	    * @return boolean    ��������
	    * @throws
	 */
	public boolean queryAccountByName(Object[] objects) throws SQLException;
	
	/**
	 * @throws SQLException 
	 * 
	    * @Title: updateAccountById
	    * @Description: TODO(�޸��˻�����id)
	    * @param @param acc
	    * @param @param acc_id
	    * @param @return    ����
	    * @return boolean    ��������
	    * @throws
	 */
	public boolean updateAccountById(Object[] objects) throws SQLException;
	
	/**
	 * @throws SQLException 
	 * 
	    * @Title: deleteAccountById
	    * @Description: TODO(�����˻�id����ɾ��)
	    * @param @param acc_id
	    * @param @return    ����
	    * @return boolean    ��������
	    * @throws
	 */
	public boolean deleteAccountById(Object[] objects) throws SQLException;
	
	/**
	 * 
		* @Date
		* @author
	    * @Title: insertAccount
	    * @Description: TODO(�����˻�����)
	    * @param @param acc
	    * @param @return
	    * @param @throws SQLException    ����
	    * @return boolean    ��������
	    * @throws
	 */
	public boolean insertAccount(Object[] objects) throws SQLException;
	/**
	 * 
		* @Date
		* @author
	    * @Title: updateAccounts
	    * @Description: TODO(��ɾ�ĵ�ͨ�÷���)
	    * @param @param objects
	    * @param @return    ����
	    * @return boolean    ��������
	    * @throws
	 */
	
	
	/**
	 * @throws SQLException 
	 * 
		* @Date
		* @author
	    * @Title: queryAllAccountLike
	    * @Description: TODO模糊查询
	    * @param @param objects
	    * @param @return    参数
	    * @return List<Account>    返回类型
	    * @throws
	 */
	public List<Account> queryAllAccountLike(Object[] objects) throws SQLException;
}
