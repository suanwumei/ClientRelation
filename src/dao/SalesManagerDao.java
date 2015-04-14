package dao;
import java.sql.SQLException;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;
import domain.SalesManager;

/**
 * 关于SalesManager类的数据库操作
 * @author admin
 *
 */
public class SalesManagerDao extends HibernateDaoSupport
{
	/**
	 * 得到全部的SalesManager对象
	 * @return
	 * @throws SQLException
	 */
	@Transactional
	public List<SalesManager> getAllSalesManager() throws SQLException
	{
		try
		{
			@SuppressWarnings("unchecked")
			List<SalesManager> SalesManagerList=this.getHibernateTemplate().find("from SalesManager");
			
			return SalesManagerList;
		}
		catch(Exception e)
		{
			return null;
		}
		
	}
	
	/**
	 * 新增SalesManager对象
	 * @param SalesManager
	 * @return
	 */
	@Transactional
	public String saveSalesManager(SalesManager SalesManager) throws SQLException
	{
		try
		{
			this.getHibernateTemplate().save(SalesManager);
			this.getHibernateTemplate().flush();
			
			return "success";
		}
		catch(Exception e)
		{
			return "error occurs when execute query...";
		}
		
	}	
	
	/**
	 * 根据名称以及密码找到相应的销售经理
	 * @param name
	 * @param password
	 * @return
	 */
	@Transactional
	public String getSalesManagerByNameAndPassword(String name, String password) throws SQLException
	{
		try
		{
			String queryString = "from SalesManager salesManager where salesManager.salesManagerName=:myName and salesManager.password=:myPassword"; 
			String []paramNames=new String[]{"myName","myPassword"};
			String []values=new String[]{name, password};
			
			@SuppressWarnings("unchecked")
			List<SalesManager> man=getHibernateTemplate().findByNamedParam(queryString, paramNames, values);
			
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
	 *  根据名称找到相应的销售经理
	 * @param name
	 * @return
	 */
	@Transactional
	public SalesManager getSalesManagerByName(String name)
	{
		try
		{
			String queryString = "from SalesManager salesManager where salesManager.salesManagerName=:myName"; 
			String []paramNames=new String[]{"myName"};
			String []values=new String[]{name};
			
			@SuppressWarnings("unchecked")
			List<SalesManager> man=getHibernateTemplate().findByNamedParam(queryString, paramNames, values);
			
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

