package dao;
import java.sql.SQLException;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import domain.Loss;

/**
 * 关于Loss类的数据库操作
 * @author admin
 *
 */
public class LossDao extends HibernateDaoSupport
{
	/**
	 * 得到全部的Loss对象
	 * @return
	 * @throws SQLException
	 */
	@Transactional
	public List<Loss> getAllLoss() throws SQLException
	{
		try
		{
			@SuppressWarnings("unchecked")
			List<Loss> LossList=this.getHibernateTemplate().find("from Loss");
			
			return LossList;
		}
		catch(Exception e)
		{
			return null;
		}
		
	}
	
	/**
	 * 新增Loss对象
	 * @param Loss
	 * @return
	 */
	@Transactional
	public String saveLoss(Loss Loss) throws SQLException
	{
		try
		{
			this.getHibernateTemplate().save(Loss);
			this.getHibernateTemplate().flush();
			
			return "success";
		}
		catch(Exception e)
		{
			return "error occurs when execute query...";
		}
		
	}	

}

