package dao;
import java.sql.SQLException;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import domain.SalesManager;

/**
 * 关于SalesManager类的数据库操作
 * @author admin
 *
 */
public class SalesManagerDao extends HibernateDaoSupport
{
	/**
	 * 得到全部的SalesManager对象
	 * @return
	 * @throws SQLException
	 */
	public List<SalesManager> getAllSalesManager() throws SQLException
	{
		try
		{
			@SuppressWarnings("unchecked")
			List<SalesManager> SalesManagerList=this.getHibernateTemplate().find("from SalesManager");
			
			return SalesManagerList;
		}
		catch(Exception e)
		{
			return null;
		}
		
	}
	
	/**
	 * 新增SalesManager对象
	 * @param SalesManager
	 * @return
	 */
	public String saveSalesManager(SalesManager SalesManager) throws SQLException
	{
		try
		{
			this.getHibernateTemplate().save(SalesManager);
			return "success";
		}
		catch(Exception e)
		{
			return "error occurs when execute query...";
		}
		
	}	

}

