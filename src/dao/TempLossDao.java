package dao;
import java.sql.SQLException;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import domain.TempLoss;

/**
 * 关于TempLoss类的数据库操作
 * @author admin
 *
 */
public class TempLossDao extends HibernateDaoSupport
{
	/**
	 * 得到全部的TempLoss对象
	 * @return
	 * @throws SQLException
	 */
	@Transactional
	public List<TempLoss> getAllTempLoss() throws SQLException
	{
		try
		{
			@SuppressWarnings("unchecked")
			List<TempLoss> TempLossList=this.getHibernateTemplate().find("from TempLoss");
			
			return TempLossList;
		}
		catch(Exception e)
		{
			return null;
		}
		
	}
	
	/**
	 * 新增TempLoss对象
	 * @param TempLoss
	 * @return
	 */
	@Transactional
	public String saveTempLoss(TempLoss TempLoss) throws SQLException
	{
		try
		{
			this.getHibernateTemplate().save(TempLoss);
			this.getHibernateTemplate().flush();
			
			return "success";
		}
		catch(Exception e)
		{
			return "error occurs when execute query...";
		}
		
	}	

}

