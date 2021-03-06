package dao;
import java.sql.SQLException;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import domain.Satisfaction;

/**
 * 关于Satisfaction类的数据库操作
 * @author admin
 *
 */
public class SatisfactionDao extends HibernateDaoSupport
{
	/**
	 * 得到全部的Satisfaction对象
	 * @return
	 * @throws SQLException
	 */
	@Transactional
	public List<Satisfaction> getAllSatisfaction() throws SQLException
	{
		try
		{
			@SuppressWarnings("unchecked")
			List<Satisfaction> SatisfactionList=this.getHibernateTemplate().find("from Satisfaction");
			
			return SatisfactionList;
		}
		catch(Exception e)
		{
			return null;
		}
		
	}
	
	/**
	 * 新增Satisfaction对象
	 * @param Satisfaction
	 * @return
	 */
	@Transactional
	public String saveSatisfaction(Satisfaction Satisfaction) throws SQLException
	{
		try
		{
			this.getHibernateTemplate().save(Satisfaction);
			this.getHibernateTemplate().flush();
			
			return "success";
		}
		catch(Exception e)
		{
			return "error occurs when execute query...";
		}
		
	}	

}

