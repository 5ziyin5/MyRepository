package com.clps.sms.dao;

import java.util.Map;
/**
 * 
    * @ClassName: IFileDao
	*
    * @Description: TODO(这里用一句话描述这个类的作用)
	*
    * @author fy
	*
    * @date 2017年8月11日
	*
 */
public interface IFileDao {
	
	public Map<String,String> getNamess(String fileName,String separator,String sfn);

}
