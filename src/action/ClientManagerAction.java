package action;

import java.sql.SQLException;

import org.apache.struts2.ServletActionContext;
import org.springframework.transaction.annotation.Transactional;

import com.opensymphony.xwork2.ActionContext;

import dao.ClientManagerDao;
import domain.ClientManager;

/**
 * 关于客户经理的操作以及响应
 * @author admin
 *
 */
public class ClientManagerAction
{
	private static final String SUCCESS="success";
	private static final String FAILED="failed";
	
	private ClientManagerDao clientManagerDao;
	
	/**
	 * 客户经理登录
	 * @return
	 */
	@Transactional
	public String clientManagerLogin()
	{
		String username=ServletActionContext.getRequest().getParameter("username");
		String password=ServletActionContext.getRequest().getParameter("password");

		String authority=ServletActionContext.getRequest().getParameter("authority");

		String clientManagerName=null;
		ClientManager clientManager=null;
		System.out.println(username);
		System.out.println(password);
		System.out.println(authority);
		
		try 
		{
			if(authority.equals("4")){
			
			clientManagerName=clientManagerDao.getClientManagerByNameAndPassword(username, password);
			}
			if(clientManagerName==null)
				return FAILED;
			else
			{
				clientManager=clientManagerDao.getClientManagerByName(clientManagerName);
				ActionContext ctx=ActionContext.getContext();
				ctx.getSession().put("user", clientManager);
				ctx.getSession().put("username", clientManager.getClientManagerName());				
				ctx.getSession().put("authority", authority);
				
				return SUCCESS;
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
	

}
