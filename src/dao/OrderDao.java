package dao;
import java.sql.SQLException;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import domain.Order;

/**
 * 关于Order类的数据库操作
 * @author admin
 *
 */
public class OrderDao extends HibernateDaoSupport
{
	/**
	 * 得到全部的Order对象
	 * @return
	 * @throws SQLException
	 */
	public List<Order> getAllOrder() throws SQLException
	{
		try
		{
			@SuppressWarnings("unchecked")
			List<Order> OrderList=this.getHibernateTemplate().find("from Order");
			
			return OrderList;
		}
		catch(Exception e)
		{
			return null;
		}
		
	}
	
	/**
	 * 新增Order对象
	 * @param Order
	 * @return
	 */
	public String saveOrder(Order Order) throws SQLException
	{
		try
		{
			this.getHibernateTemplate().save(Order);
			return "success";
		}
		catch(Exception e)
		{
			return "error occurs when execute query...";
		}
		
	}	

}

