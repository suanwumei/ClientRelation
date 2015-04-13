package dao;
import java.sql.SQLException;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import domain.Credit;

/**
 * 关于Credit类的数据库操作
 * @author admin
 *
 */
public class CreditDao extends HibernateDaoSupport
{
	/**
	 * 得到全部的Credit对象
	 * @return
	 * @throws SQLException
	 */
	public List<Credit> getAllCredit() throws SQLException
	{
		try
		{
			@SuppressWarnings("unchecked")
			List<Credit> CreditList=this.getHibernateTemplate().find("from Credit");
			
			return CreditList;
		}
		catch(Exception e)
		{
			return null;
		}
		
	}
	
	/**
	 * 新增Credit对象
	 * @param Credit
	 * @return
	 */
	public String saveCredit(Credit Credit) throws SQLException
	{
		try
		{
			this.getHibernateTemplate().save(Credit);
			return "success";
		}
		catch(Exception e)
		{
			return "error occurs when execute query...";
		}
		
	}	

}

