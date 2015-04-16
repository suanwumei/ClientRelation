package dao;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import domain.ClientManager;
import domain.SalesChance;

/**
 * 关于ClientManager类的数据库操作
 * @author admin
 *
 */
public class ClientManagerDao extends HibernateDaoSupport
{
	/**
	 * 得到数据库中所有的ClientManager对象
	 * @return
	 * @throws SQLException
	 */
	@Transactional
	public List<ClientManager> getAllClientManager() throws SQLException
	{
		
		try
		{
			@SuppressWarnings("unchecked")
			List<ClientManager> ClientManagerList=this.getHibernateTemplate().find("from ClientManager");
			
			return ClientManagerList;
		}
		catch(Exception e)
		{
			return null;
		}
		
	}
	
	/**
	 * 新增ClientManager对象
	 * @param ClientManager
	 * @return
	 */
	@Transactional
	public String saveClientManager(ClientManager ClientManager) throws SQLException
	{
		try
		{
			this.getHibernateTemplate().save(ClientManager);
			this.getHibernateTemplate().flush();
			return "success";
		}
		catch(Exception e)
		{
			return "error occurs when execute query...";
		}
		
	}
	
	/**
	 * 根据名称以及密码找到相应的客户经理
	 * @param name
	 * @param password
	 * @return
	 */
	@Transactional
	public String getClientManagerByNameAndPassword(String name, String password) throws SQLException
	{
		try
		{
			String queryString = "from ClientManager clientManager where clientManager.clientManagerName=:myName and clientManager.password=:myPassword"; 
			String []paramNames=new String[]{"myName","myPassword"};
			String []values=new String[]{name, password};
			
			@SuppressWarnings("unchecked")
			List<ClientManager> man=getHibernateTemplate().findByNamedParam(queryString, paramNames, values);
			
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
	 *  根据名称找到相应的客户经理
	 * @param name
	 * @return
	 */
	@Transactional
	public ClientManager getClientManagerByName(String name)
	{
		try
		{
			String queryString = "from ClientManager clientManager where clientManager.clientManagerName=:myName"; 
			String []paramNames=new String[]{"myName"};
			String []values=new String[]{name};
			
			@SuppressWarnings("unchecked")
			List<ClientManager> man=getHibernateTemplate().findByNamedParam(queryString, paramNames, values);
			
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
	
	/**
	 * 根据ClientManagerId查询客户经理
	 * @param clientManagerId
	 * @return
	 */
	@Transactional
	public ClientManager getClientManagerById(int clientManagerId)
	{
		try
		{	
			return (ClientManager) this.getSession().get(ClientManager.class, clientManagerId);
		}
		catch(Exception e)
		{
			return null;
		}
		
	}
	
	/**
	 * 找到属于客户经理的所有的已分配的但未完成的销售机会
	 * @param clientManager
	 * @return
	 */
	@Transactional
	public List<SalesChance> getAppointAndUnfinishSalesChance(ClientManager clientManager)
	{
		try
		{
			String queryString = "from SalesChance salesChance where salesChance.salesChanceAppoint=:clientManager and salesChance.salesChanceStatus=:status"; 
			Query query = this.getSession().createQuery(queryString); 
			query.setParameter("clientManager", clientManager);
			query.setParameter("status", "开发中");
			
			@SuppressWarnings("unchecked")
			List<SalesChance> salesChanceList=query.list();
			
			return salesChanceList;
	
		}
		catch(Exception e)
		{
			System.out.println("执行过了");
			return null;
		}
		
	}
}
	
