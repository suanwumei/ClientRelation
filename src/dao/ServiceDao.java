package dao;
import java.sql.SQLException;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import domain.Service;

/**
 * 关于Service类的数据库操作
 * @author admin
 *
 */
public class ServiceDao extends HibernateDaoSupport
{
	/**
	 * 得到全部的Service对象
	 * @return
	 * @throws SQLException
	 */
	@Transactional
	public List<Service> getAllService() throws SQLException
	{
		try
		{
			@SuppressWarnings("unchecked")
			List<Service> ServiceList=this.getHibernateTemplate().find("from Service");
			
			return ServiceList;
		}
		catch(Exception e)
		{
			return null;
		}
		
	}
	
	/**
	 * 新增Service对象
	 * @param Service
	 * @return
	 */
	@Transactional
	public String saveService(Service Service) throws SQLException
	{
		try
		{
			this.getHibernateTemplate().save(Service);
			this.getHibernateTemplate().flush();
			
			return "success";
		}
		catch(Exception e)
		{
			return "error occurs when execute query...";
		}
		
	}	

}

