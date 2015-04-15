package dao;
import java.sql.SQLException;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import domain.HighManager;
import domain.SalesManager;

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
	/**
	 * 根据名称以及密码找到相应的高管
	 * @param name
	 * @param password
	 * @return
	 */
	@Transactional
	public String getHighManagerByNameAndPassword(String name, String password) throws SQLException
	{
		try
		{
			String queryString = "from HighManager highManager where highManager.highManagerName=:myName and highManager.password=:myPassword"; 
			String []paramNames=new String[]{"myName","myPassword"};
			String []values=new String[]{name, password};
			
			@SuppressWarnings("unchecked")
			List<HighManager> man=getHibernateTemplate().findByNamedParam(queryString, paramNames, values);
			
			if(man.size()>0)
				return name;
			else
				return null;
		}
		catch(Exception e)
		{
			return null;
		}
	}	
	
	/**
	 *  根据名称找到相应的高管
	 * @param name
	 * @return
	 */
	@Transactional
	public HighManager getHighManagerByName(String name)
	{
		try
		{
			String queryString = "from HighManager highManager where highManager.highManagerName=:myName"; 
			String []paramNames=new String[]{"myName"};
			String []values=new String[]{name};
			
			@SuppressWarnings("unchecked")
			List<HighManager> man=getHibernateTemplate().findByNamedParam(queryString, paramNames, values);
			
			if(man.size()>0)
				return man.get(0);
			else
				return null;
		}
		catch(Exception e)
		{
			return null;
		}
		
	}

}

