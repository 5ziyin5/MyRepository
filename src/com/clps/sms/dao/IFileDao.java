package com.clps.sms.dao;

import java.util.Map;
/**
 * 
    * @ClassName: IFileDao
	*
    * @Description: TODO(������һ�仰��������������)
	*
    * @author fy
	*
    * @date 2017��8��11��
	*
 */
public interface IFileDao {
	
	public Map<String,String> getNamess(String fileName,String separator,String sfn);

}
