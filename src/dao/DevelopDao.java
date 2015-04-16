package dao;
import java.sql.SQLException;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import domain.Develop;

/**
 * 关于Develop类的数据库操作
 * @author admin
 *
 */
public class DevelopDao extends HibernateDaoSupport
{
	/**
	 * 得到全部的Develop对象
	 * @return
	 * @throws SQLException
	 */
	@Transactional
	public List<Develop> getAllDevelop() throws SQLException
	{
		try
		{
			@SuppressWarnings("unchecked")
			List<Develop> DevelopList=this.getHibernateTemplate().find("from Develop");
			
			return DevelopList;
		}
		catch(Exception e)
		{
			return null;
		}
		
	}
	
	/**
	 * 新增Develop对象
	 * @param Develop
	 * @return
	 */
	@Transactional
	public String saveDevelop(Develop Develop) throws SQLException
	{
		try
		{
			this.getHibernateTemplate().save(Develop);
			this.getHibernateTemplate().flush();
			
			return "success";
		}
		catch(Exception e)
		{
			return "error occurs when execute query...";
		}
		
	}	
	
	/**
	 * 删除销售机会
	 * @param developId
	 */
	@Transactional
	public String deleteDevelop(int developId)
	{
		try
		{
			Develop develop=this.getHibernateTemplate().get(Develop.class, developId);
			this.getSession().delete(develop);
			this.getSession().flush();
			
			return "success";
		}
		catch(Exception e)
		{
			return "error occurs when execute query...";
		}
		
	}
	
	/**
	 * 根据Id得到销售机会
	 * @param developId
	 * @return
	 */
	@Transactional
	public Develop getDevelopById(int developId)
	{
		try
		{
			return (Develop) this.getSession().get(Develop.class, developId);
		}
		catch(Exception e)
		{
			return null;
		}
	}
	
	public String updateDevelop(Develop develop)
	{
		try
		{
			 this.getSession().update(develop);
			 this.getSession().flush();
			 
			 return "success";
		}
		catch(Exception e)
		{
			return null;
		}
	}

}

