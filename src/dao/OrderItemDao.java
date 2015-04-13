package dao;
import java.sql.SQLException;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import domain.OrderItem;

/**
 * 关于OrderItem类的数据库操作
 * @author admin
 *
 */
public class OrderItemDao extends HibernateDaoSupport
{
	/**
	 * 得到全部的OrderItem对象
	 * @return
	 * @throws SQLException
	 */
	public List<OrderItem> getAllOrderItem() throws SQLException
	{
		try
		{
			@SuppressWarnings("unchecked")
			List<OrderItem> OrderItemList=this.getHibernateTemplate().find("from OrderItem");
			
			return OrderItemList;
		}
		catch(Exception e)
		{
			return null;
		}
		
	}
	
	/**
	 * 新增OrderItem对象
	 * @param OrderItem
	 * @return
	 */
	public String saveOrderItem(OrderItem OrderItem) throws SQLException
	{
		try
		{
			this.getHibernateTemplate().save(OrderItem);
			return "success";
		}
		catch(Exception e)
		{
			return "error occurs when execute query...";
		}
		
	}	

}

