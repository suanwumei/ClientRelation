package action;

import java.io.UnsupportedEncodingException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;





import org.apache.struts2.ServletActionContext;
import org.springframework.transaction.annotation.Transactional;

import com.opensymphony.xwork2.ActionContext;

import dao.ClientDao;
import dao.ClientManagerDao;
import dao.ContactDao;
import dao.DevelopDao;
import dao.SalesChanceDao;
import domain.Client;
import domain.ClientManager;
import domain.Contact;
import domain.Develop;
import domain.SalesChance;

public class DevelopAction 
{
	private SalesChanceDao salesChanceDao;
	private DevelopDao developDao;
	private ClientDao clientDao;
	private ContactDao contactDao;
	private ClientManagerDao clientManagerDao;
	
	/**
	 * 查看单个销售机会以及其开发计划
	 * @return
	 */
	@Transactional
	public String viewSalesChanceForDevelop()
	{
		try
		{
			int salesChanceId=Integer.parseInt(ServletActionContext.getRequest().getParameter("salesChanceId"));
			SalesChance salesChance=salesChanceDao.getSalesChanceById(salesChanceId);
			
			ServletActionContext.getRequest().setAttribute("salesChance", salesChance);
						
			List<Develop> developList=new ArrayList<Develop>();
			
			Iterator<Develop> it=salesChance.getDevelops().iterator();
			while(it.hasNext())
			{
				developList.add(it.next());
			}
			ServletActionContext.getRequest().setAttribute("developList", developList);
			
			return "success";
		}
		catch(Exception e)
		{
			return "failed";
		}
		
	}
	
	/**
	 * 保存新建的开发计划
	 * @return
	 * @throws UnsupportedEncodingException 
	 * @throws SQLException 
	 */
	@Transactional
	public String saveDevelop() throws UnsupportedEncodingException, SQLException
	{
		try
		{
			int salesChanceId=Integer.parseInt(ServletActionContext.getRequest().getParameter("salesChanceId"));
			SalesChance salesChance=salesChanceDao.getSalesChanceById(salesChanceId);
			
			String developTime=new String(ServletActionContext.getRequest().getParameter("developTime").getBytes("ISO-8859-1"),"UTF-8");
			String developPlan=new String(ServletActionContext.getRequest().getParameter("developPlan").getBytes("ISO-8859-1"),"UTF-8");
			
			Develop develop=new Develop();
			develop.setDevelopTime(developTime);
			develop.setDevelopPlan(developPlan);
			
			salesChance.getDevelops().add(develop);
			
			developDao.saveDevelop(develop);
			
			salesChanceDao.updateSalesChance(salesChance);
			
			
			
			this.viewSalesChanceForDevelop();
			
			return "success";
		}
		catch(Exception e)
		{
			return "failed";
		}
	}

	/**
	 * 删除开发计划
	 * @return
	 */
	@Transactional
	public String deleteDevelop()
	{
		int developId=Integer.parseInt(ServletActionContext.getRequest().getParameter("developId"));
		
		try
		{
			developDao.deleteDevelop(developId);
			
			this.viewSalesChanceForDevelop();
			
			return "success";
		}
		catch(Exception e)
		{
			return "failed";
		}
	}
	
	/**
	 * 更新开发计划
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
	@Transactional
	public String updateDevelop() throws UnsupportedEncodingException
	{
		int developId=Integer.parseInt(ServletActionContext.getRequest().getParameter("developId"));
		
		String developTime=new String(ServletActionContext.getRequest().getParameter("developTimeUpdate"+developId).getBytes("ISO-8859-1"),"UTF-8");
		String developPlan=new String(ServletActionContext.getRequest().getParameter("developPlanUpdate"+developId).getBytes("ISO-8859-1"),"UTF-8");
		
		try
		{
			Develop develop=developDao.getDevelopById(developId);
			
			develop.setDevelopPlan(developPlan);
			develop.setDevelopTime(developTime);
			
			developDao.updateDevelop(develop);
			
			this.viewSalesChanceForDevelop();
			
			return "success";
		}
		catch(Exception e)
		{
			return "failed";
		}
	}
	
	/**
	 * 执行开发计划
	 * @return
	 */
	@Transactional
	public String executeDevelop()
	{
		try
		{
			int salesChanceId=Integer.parseInt(ServletActionContext.getRequest().getParameter("salesChanceId"));
			SalesChance salesChance=salesChanceDao.getSalesChanceById(salesChanceId);
			
			ServletActionContext.getRequest().setAttribute("salesChance", salesChance);
			
			ServletActionContext.getRequest().setAttribute("developList", salesChance.getDevelops());
			
			return "success";
		}
		catch(Exception e)
		{
			return "failed";
		}
	}
	
	/**
	 * 保存计划执行结果
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
	@Transactional
	public String saveDevelopResult() throws UnsupportedEncodingException
	{
		int developId=Integer.parseInt(ServletActionContext.getRequest().getParameter("developId"));
		String executeResult=new String(ServletActionContext.getRequest().getParameter("executeResult"+developId).getBytes("ISO-8859-1"),"UTF-8");
		
		try
		{
			Develop develop=developDao.getDevelopById(developId);
			
			develop.setExecuteResult(executeResult);
			
			developDao.updateDevelop(develop);
			
			this.viewSalesChanceForDevelop();
			
			return "success";
		}
		catch(Exception e)
		{
			return "failed";
		}
		
	}
	
	/**
	 * 开发成功
	 * @return
	 * @throws SQLException 
	 */
	@Transactional
	public String developSuccess() throws SQLException
	{
		try
		{
			int salesChanceId=Integer.parseInt(ServletActionContext.getRequest().getParameter("salesChanceId"));
			SalesChance salesChance=salesChanceDao.getSalesChanceById(salesChanceId);
			
			salesChance.setSalesChanceStatus("开发成功");
			salesChanceDao.updateSalesChance(salesChance);
			
			Client client=new Client();
			client.setClientName(salesChance.getClientName());
			ClientManager clientManager=(ClientManager) ActionContext.getContext().getSession().get("user");
			client.setClientManager(clientManager);
			clientDao.saveClient(client);
			
			Contact contact=new Contact();
			contact.setContactName(salesChance.getContactName());
			contact.setContactTel(salesChance.getContactTel());
			client.getContactList().add(contact);
			contactDao.saveContact(contact);
			
			List<SalesChance>salesChanceList=clientManagerDao.getAppointAndUnfinishSalesChance(clientManager);
			ServletActionContext.getRequest().setAttribute("salesChanceList", salesChanceList);
		
			
			return "success";
			
		}
		catch(Exception e)
		{
			return "failed";
		}
	
	}
	
	/**
	 * 开发失败
	 * @return
	 */
	@Transactional
	public String developFailed()
	{
		try
		{
			int salesChanceId=Integer.parseInt(ServletActionContext.getRequest().getParameter("salesChanceId"));
			SalesChance salesChance=salesChanceDao.getSalesChanceById(salesChanceId);
			
			salesChance.setSalesChanceStatus("开发失败");
			salesChanceDao.updateSalesChance(salesChance);
			
			ClientManager clientManager=(ClientManager) ActionContext.getContext().getSession().get("user");
			
			
			List<SalesChance>salesChanceList=clientManagerDao.getAppointAndUnfinishSalesChance(clientManager);
			ServletActionContext.getRequest().setAttribute("salesChanceList", salesChanceList);
		
			return "success";
		}
		
		catch(Exception e)
		{
			return "failed";
		}
		
	}
	
	
	
	
	/**
	 * @return the salesChanceDao
	 */
	public SalesChanceDao getSalesChanceDao() {
		return salesChanceDao;
	}

	/**
	 * @param salesChanceDao the salesChanceDao to set
	 */
	public void setSalesChanceDao(SalesChanceDao salesChanceDao) {
		this.salesChanceDao = salesChanceDao;
	}

	/**
	 * @return the developDao
	 */
	public DevelopDao getDevelopDao() {
		return developDao;
	}

	/**
	 * @param developDao the developDao to set
	 */
	public void setDevelopDao(DevelopDao developDao) {
		this.developDao = developDao;
	}

	/**
	 * @return the clientDao
	 */
	public ClientDao getClientDao() {
		return clientDao;
	}

	/**
	 * @param clientDao the clientDao to set
	 */
	public void setClientDao(ClientDao clientDao) {
		this.clientDao = clientDao;
	}

	/**
	 * @return the contactDao
	 */
	public ContactDao getContactDao() {
		return contactDao;
	}

	/**
	 * @param contactDao the contactDao to set
	 */
	public void setContactDao(ContactDao contactDao) {
		this.contactDao = contactDao;
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
