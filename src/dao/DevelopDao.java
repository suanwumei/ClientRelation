package dao;
import java.sql.SQLException;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

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
	public String saveDevelop(Develop Develop) throws SQLException
	{
		try
		{
			this.getHibernateTemplate().save(Develop);
			return "success";
		}
		catch(Exception e)
		{
			return "error occurs when execute query...";
		}
		
	}	

}

