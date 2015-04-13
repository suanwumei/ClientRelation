package dao;
import java.sql.SQLException;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

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
	@Transactional
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
	@Transactional
	public String saveLevel(Level Level) throws SQLException
	{
		try
		{
			this.getHibernateTemplate().save(Level);
			this.getHibernateTemplate().flush();
			
			return "success";
		}
		catch(Exception e)
		{
			return "error occurs when execute query...";
		}
		
	}	

}

