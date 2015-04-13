package dao;
import java.sql.SQLException;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import domain.Client;

/**
 * 关于Client类的数据库操作
 * @author admin
 *
 */
public class ClientDao extends HibernateDaoSupport
{
	/**
	 * 得到全部的Client对象
	 * @return
	 * @throws SQLException
	 */
	public List<Client> getAllClient() throws SQLException
	{
		try
		{
			@SuppressWarnings("unchecked")
			List<Client> ClientList=this.getHibernateTemplate().find("from Client");
			
			return ClientList;
		}
		catch(Exception e)
		{
			return null;
		}
		
	}
	
	/**
	 * 新增Client对象
	 * @param Client
	 * @return
	 */
	public String saveClient(Client Client) throws SQLException
	{
		try
		{
			this.getHibernateTemplate().save(Client);
			return "success";
		}
		catch(Exception e)
		{
			return "error occurs when execute query...";
		}
		
	}	
	

	/**
	 *  根据名称找到相应的客户
	 * @param name
	 * @return
	 */
	public Client getClientByName(String name)
	{
		try
		{
			String queryString = "from Client client where client.clientName=:myName"; 
			String []paramNames=new String[]{"myName"};
			String []values=new String[]{name};
			
			@SuppressWarnings("unchecked")
			List<Client> man=getHibernateTemplate().findByNamedParam(queryString, paramNames, values);
			
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

