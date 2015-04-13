package dao;
import java.sql.SQLException;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

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
	@Transactional
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
	@Transactional
	public String saveServiceType(ServiceType ServiceType) throws SQLException
	{
		try
		{
			this.getHibernateTemplate().save(ServiceType);
			this.getHibernateTemplate().flush();
			
			return "success";
		}
		catch(Exception e)
		{
			return "error occurs when execute query...";
		}
		
	}	

}

