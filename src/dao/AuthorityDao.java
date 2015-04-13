package dao;
import java.sql.SQLException;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import domain.Authority;

/**
 * 关于Authority类的数据库操作
 * @author admin
 *
 */
public class AuthorityDao extends HibernateDaoSupport
{
	/**
	 * 得到数据库中所有的Authority记录
	 * @return
	 * @throws SQLException
	 */
	public List<Authority> getAllAuthority() throws SQLException
	{
		
		try
		{
			@SuppressWarnings("unchecked")
			List<Authority> AuthorityList=this.getHibernateTemplate().find("from Authority");
			
			return AuthorityList;
		}
		catch(Exception e)
		{
			return null;
		}
		
	}
	
	/**
	 * 新增Authority对象
	 * @param Authority
	 * @return
	 */
	public String saveAuthority(Authority Authority) throws SQLException
	{
		try
		{
			this.getHibernateTemplate().save(Authority);
			return "success";
		}
		catch(Exception e)
		{
			return "error occurs when execute query...";
		}
		
	}

	
}
	
