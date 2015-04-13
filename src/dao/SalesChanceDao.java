package dao;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import domain.SalesChance;

/**
 * 关于SalesChance类的数据库操作
 * @author admin
 *
 */
public class SalesChanceDao extends HibernateDaoSupport
{
	/**
	 * 得到全部的SalesChance对象
	 * @return
	 * @throws SQLException
	 */
	public List<SalesChance> getAllSalesChance() throws SQLException
	{
		try
		{
			@SuppressWarnings("unchecked")
			List<SalesChance> SalesChanceList=this.getHibernateTemplate().find("from SalesChance");
			
			return SalesChanceList;
		}
		catch(Exception e)
		{
			return null;
		}
		
	}
	
	/**
	 * 新增SalesChance对象
	 * @param SalesChance
	 * @return
	 */
	public String saveSalesChance(SalesChance salesChance) throws SQLException
	{
		try
		{
			this.getHibernateTemplate().save(salesChance);
			return "success";
		}
		catch(Exception e)
		{
			return "error occurs when execute query...";
		}
		
	}	

	/**
	 * 查询所有未分配销售机会
	 * @return
	 */
	public List<SalesChance> getSalesChanceNotApp()
	{
		try
		{
			String queryString = "from SalesChance salesChance where salesChance.assignOrNot=:myName"; 
			String []paramNames=new String[]{"myName"};
			String []values=new String[]{"0"};
			
			@SuppressWarnings("unchecked")
			List<SalesChance> man=getHibernateTemplate().findByNamedParam(queryString, paramNames, values);
			
			if(man.size()>0)
				return man;
			else
				return null;
		}
		catch(Exception e)
		{
			return null;
		}
		
	}

	/**
	 * 更新销售机会
	 * @param salesChance
	 * @return
	 */
	public String updateSalesChance(SalesChance salesChance)
	{
		System.out.println("salesChance in dao"+salesChance.getClientName());
		try
		{
		//	this.getHibernateTemplate().update(salesChance);
			this.getSession().update(salesChance);
			this.getSession().flush();

			return "success";
		}
		catch(Exception e)
		{
			return "error occurs when execute query...";
		}		
	}
	
	/**
	 * 根据SalesChanceId查询销售机会
	 * @param salesChanceId
	 * @return
	 */
	public SalesChance getSalesChanceById(int salesChanceId)
	{
		try
		{	
			return (SalesChance) this.getSession().get(SalesChance.class, salesChanceId);
		}
		catch(Exception e)
		{
			return null;
		}
		
	}
	
}

