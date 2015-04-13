package dao;
import java.sql.SQLException;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import domain.ServiceType;

/**
 * 关于ServiceType类的数据库操作
 * @author admin
 *
 */
public class ServiceTypeDao extends HibernateDaoSupport
{
	/**
	 * 得到全部的ServiceType对象
	 * @return
	 * @throws SQLException
	 */
	public List<ServiceType> getAllServiceType() throws SQLException
	{
		try
		{
			@SuppressWarnings("unchecked")
			List<ServiceType> ServiceTypeList=this.getHibernateTemplate().find("from ServiceType");
			
			return ServiceTypeList;
		}
		catch(Exception e)
		{
			return null;
		}
		
	}
	
	/**
	 * 新增ServiceType对象
	 * @param ServiceType
	 * @return
	 */
	public String saveServiceType(ServiceType ServiceType) throws SQLException
	{
		try
		{
			this.getHibernateTemplate().save(ServiceType);
			return "success";
		}
		catch(Exception e)
		{
			return "error occurs when execute query...";
		}
		
	}	

}

