package dao;
import java.sql.SQLException;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import domain.Area;

/**
 * 关于Area类的数据库操作
 * @author admin
 *
 */
public class AreaDao extends HibernateDaoSupport
{
	/**
	 * 得到全部的Area对象
	 * @return
	 * @throws SQLException
	 */
	@Transactional
	public List<Area> getAllArea() throws SQLException
	{
		try
		{
			@SuppressWarnings("unchecked")
			List<Area> areaList=this.getHibernateTemplate().find("from Area");
			this.getHibernateTemplate().flush();
			return areaList;
		}
		catch(Exception e)
		{
			return null;
		}
		
	}
	
	/**
	 * 新增Area对象
	 * @param area
	 * @return
	 */
	@Transactional
	public String saveArea(Area area) throws SQLException
	{
		try
		{
			this.getHibernateTemplate().save(area);
			this.getHibernateTemplate().flush();
			return "success";
		}
		catch(Exception e)
		{
			return "error occurs when execute query...";
		}
		
	}	

}

