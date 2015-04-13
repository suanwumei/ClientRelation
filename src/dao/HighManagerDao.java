package dao;
import java.sql.SQLException;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import domain.HighManager;

/**
 * 关于HighManager类的数据库操作
 * @author admin
 *
 */
public class HighManagerDao extends HibernateDaoSupport
{
	/**
	 * 得到全部的HighManager对象
	 * @return
	 * @throws SQLException
	 */
	@Transactional
	public List<HighManager> getAllHighManager() throws SQLException
	{
		try
		{
			@SuppressWarnings("unchecked")
			List<HighManager> HighManagerList=this.getHibernateTemplate().find("from HighManager");
			
			return HighManagerList;
		}
		catch(Exception e)
		{
			return null;
		}
		
	}
	
	/**
	 * 新增HighManager对象
	 * @param HighManager
	 * @return
	 */
	@Transactional
	public String saveHighManager(HighManager HighManager) throws SQLException
	{
		try
		{
			this.getHibernateTemplate().save(HighManager);
			this.getHibernateTemplate().flush();
			
			return "success";
		}
		catch(Exception e)
		{
			return "error occurs when execute query...";
		}
		
	}	

}

