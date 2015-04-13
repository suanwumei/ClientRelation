package dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import domain.Contact;

/**
 * 关于Contact类的数据库操作
 * @author admin
 *
 */
public class ContactDao extends HibernateDaoSupport
{
	/**
	 * 得到全部的Contact对象
	 * @return
	 * @throws SQLException
	 */
	@Transactional
	public List<Contact> getAllContact() throws SQLException
	{
		try
		{
			@SuppressWarnings("unchecked")
			List<Contact> ContactList=this.getHibernateTemplate().find("from Contact");
			
			return ContactList;
		}
		catch(Exception e)
		{
			return null;
		}
		
	}
	
	/**
	 * 新增Contact对象
	 * @param Contact
	 * @return
	 */
	@Transactional
	public String saveContact(Contact Contact) throws SQLException
	{
		try
		{
			this.getHibernateTemplate().save(Contact);
			this.getHibernateTemplate().flush();
			return "success";
		}
		catch(Exception e)
		{
			return "error occurs when execute query...";
		}
		
	}	
	
}

