package dao;
import java.sql.SQLException;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import domain.Product;

/**
 * 关于Product类的数据库操作
 * @author admin
 *
 */
public class ProductDao extends HibernateDaoSupport
{
	/**
	 * 得到全部的Product对象
	 * @return
	 * @throws SQLException
	 */
	@Transactional
	public List<Product> getAllProduct() throws SQLException
	{
		try
		{
			@SuppressWarnings("unchecked")
			List<Product> ProductList=this.getHibernateTemplate().find("from Product");
			
			return ProductList;
		}
		catch(Exception e)
		{
			return null;
		}
		
	}
	
	/**
	 * 新增Product对象
	 * @param Product
	 * @return
	 */
	@Transactional
	public String saveProduct(Product Product) throws SQLException
	{
		try
		{
			this.getHibernateTemplate().save(Product);
			this.getHibernateTemplate().flush();
			
			return "success";
		}
		catch(Exception e)
		{
			return "error occurs when execute query...";
		}
		
	}	

}

