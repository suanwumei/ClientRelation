package action;

import java.sql.SQLException;

import org.apache.struts2.ServletActionContext;
import org.springframework.transaction.annotation.Transactional;

import com.opensymphony.xwork2.ActionContext;

import dao.AuthorityDao;
import dao.ClientManagerDao;
import dao.HighManagerDao;
import dao.SalesManagerDao;
import domain.Authority;
import domain.ClientManager;
import domain.HighManager;
import domain.SalesManager;

public class UserAction 
{
	private ClientManagerDao clientManagerDao;
	private SalesManagerDao salesManagerDao;	
	private HighManagerDao highManagerDao;
	private AuthorityDao authorityDao;
	/**
	 * 全部用户登录
	 * @return
	 */
	@Transactional
	public String userLogin()
	{
		String username=ServletActionContext.getRequest().getParameter("username");
		String password=ServletActionContext.getRequest().getParameter("password");

		String authorityId=ServletActionContext.getRequest().getParameter("authority");
		
		try 
		{
			/**
			 * 客户经理登陆
			 */
			if(authorityId.equals("4"))
			{
			
				String clientManagerName=clientManagerDao.getClientManagerByNameAndPassword(username, password);
			
				if(clientManagerName==null)
					return "failed";
				else
				{
					ClientManager clientManager=clientManagerDao.getClientManagerByName(clientManagerName);
					Authority authority=authorityDao.getAuthorityById(Integer.parseInt(authorityId));
					ActionContext ctx=ActionContext.getContext();
					ctx.getSession().put("user", clientManager);
					ctx.getSession().put("username", clientManager.getClientManagerName());
					ctx.getSession().put("authority", authority);
				
					return "clientManager";
				}
			}
			/**
			 * 销售主管登陆
			 */
			else if(authorityId.equals("3"))
			{
				String salesManagerName=salesManagerDao.getSalesManagerByNameAndPassword(username, password);
				
				if(salesManagerName==null)
					return "failed";
				else
				{
					SalesManager salesManager=salesManagerDao.getSalesManagerByName(salesManagerName);
					Authority authority=authorityDao.getAuthorityById(Integer.parseInt(authorityId));
					
					ActionContext ctx=ActionContext.getContext();
					ctx.getSession().put("user", salesManager);
					ctx.getSession().put("authority", authority);
					ctx.getSession().put("username", salesManager.getSalesManagerName());
					
					return "salesManager";
				}
			}
			/**
			 * 高管登陆
			 */
			else if(authorityId.equals("2"))
			{
				String highManagerName=highManagerDao.getHighManagerByNameAndPassword(username, password);
				
				if(highManagerName==null)
					return "failed";
				else
				{
					HighManager highManager=highManagerDao.getHighManagerByName(highManagerName);
					Authority authority=authorityDao.getAuthorityById(Integer.parseInt(authorityId));
					
					ActionContext ctx=ActionContext.getContext();
					ctx.getSession().put("user", highManager);
					ctx.getSession().put("authority", authority);
					
					return "highManager";
				}
				
			}
		
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
		
	}
	/**
	 * @return the clientManagerDao
	 */
	public ClientManagerDao getClientManagerDao() {
		return clientManagerDao;
	}
	/**
	 * @param clientManagerDao the clientManagerDao to set
	 */
	public void setClientManagerDao(ClientManagerDao clientManagerDao) {
		this.clientManagerDao = clientManagerDao;
	}
	/**
	 * @return the salesManagerDao
	 */
	public SalesManagerDao getSalesManagerDao() {
		return salesManagerDao;
	}
	/**
	 * @param salesManagerDao the salesManagerDao to set
	 */
	public void setSalesManagerDao(SalesManagerDao salesManagerDao) {
		this.salesManagerDao = salesManagerDao;
	}
	/**
	 * @return the highManagerDao
	 */
	public HighManagerDao getHighManagerDao() {
		return highManagerDao;
	}
	/**
	 * @param highManagerDao the highManagerDao to set
	 */
	public void setHighManagerDao(HighManagerDao highManagerDao) {
		this.highManagerDao = highManagerDao;
	}
	/**
	 * @return the authorityDao
	 */
	public AuthorityDao getAuthorityDao() {
		return authorityDao;
	}
	/**
	 * @param authorityDao the authorityDao to set
	 */
	public void setAuthorityDao(AuthorityDao authorityDao) {
		this.authorityDao = authorityDao;
	}

}
