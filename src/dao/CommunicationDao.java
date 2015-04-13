package dao;
import java.sql.SQLException;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import domain.Communication;

/**
 * 关于Communication类的数据库操作
 * @author admin
 *
 */
public class CommunicationDao extends HibernateDaoSupport
{
	/**
	 * 得到全部的Communication对象
	 * @return
	 * @throws SQLException
	 */
	public List<Communication> getAllCommunication() throws SQLException
	{
		try
		{
			@SuppressWarnings("unchecked")
			List<Communication> CommunicationList=this.getHibernateTemplate().find("from Communication");
			
			return CommunicationList;
		}
		catch(Exception e)
		{
			return null;
		}
		
	}
	
	/**
	 * 新增Communication对象
	 * @param Communication
	 * @return
	 */
	public String saveCommunication(Communication Communication) throws SQLException
	{
		try
		{
			this.getHibernateTemplate().save(Communication);
			return "success";
		}
		catch(Exception e)
		{
			return "error occurs when execute query...";
		}
		
	}	

}

