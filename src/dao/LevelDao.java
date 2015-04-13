package dao;
import java.sql.SQLException;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import domain.Level;

/**
 * 关于Level类的数据库操作
 * @author admin
 *
 */
public class LevelDao extends HibernateDaoSupport
{
	/**
	 * 得到全部的Level对象
	 * @return
	 * @throws SQLException
	 */
	public List<Level> getAllLevel() throws SQLException
	{
		try
		{
			@SuppressWarnings("unchecked")
			List<Level> LevelList=this.getHibernateTemplate().find("from Level");
			
			return LevelList;
		}
		catch(Exception e)
		{
			return null;
		}
		
	}
	
	/**
	 * 新增Level对象
	 * @param Level
	 * @return
	 */
	public String saveLevel(Level Level) throws SQLException
	{
		try
		{
			this.getHibernateTemplate().save(Level);
			return "success";
		}
		catch(Exception e)
		{
			return "error occurs when execute query...";
		}
		
	}	

}

