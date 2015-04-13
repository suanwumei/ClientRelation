package dao;
import java.sql.SQLException;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import domain.Inventory;

/**
 * 关于Inventory类的数据库操作
 * @author admin
 *
 */
public class InventoryDao extends HibernateDaoSupport
{
	/**
	 * 得到全部的Inventory对象
	 * @return
	 * @throws SQLException
	 */
	@Transactional
	public List<Inventory> getAllInventory() throws SQLException
	{
		try
		{
			@SuppressWarnings("unchecked")
			List<Inventory> InventoryList=this.getHibernateTemplate().find("from Inventory");
			
			return InventoryList;
		}
		catch(Exception e)
		{
			return null;
		}
		
	}
	
	/**
	 * 新增Inventory对象
	 * @param Inventory
	 * @return
	 */
	@Transactional
	public String saveInventory(Inventory Inventory) throws SQLException
	{
		try
		{
			this.getHibernateTemplate().save(Inventory);
			this.getHibernateTemplate().flush();
			
			return "success";
		}
		catch(Exception e)
		{
			return "error occurs when execute query...";
		}
		
	}	

}

