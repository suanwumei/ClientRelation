package action;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;

import dao.ClientDao;
import dao.ClientManagerDao;
import dao.ContactDao;
import dao.SalesChanceDao;
import domain.ClientManager;
import domain.SalesChance;

/**
 * 销售机会相关操作
 * @author admin
 *
 */
public class SalesChanceAction
{
	private static final String SUCCESS="success";
	private static final String FAILED="failed";

	private SalesChanceDao salesChanceDao;	
	private ClientManagerDao clientManagerDao;
	private ClientDao clientDao;
	private ContactDao contactDao;
	
	/**
	 * 创建销售机会
	 * @return
	 */
	public String salseChanceCreate()
	{
		ActionContext ctx=ActionContext.getContext();
		String authority=(String) ctx.getSession().get("authority");
		
		String salesChanceSource=(String) ServletActionContext.getRequest().getParameter("salesChanceSource");
		String clientName=(String) ServletActionContext.getRequest().getParameter("clientName");
		String salesChanceSuccessRate=(String) ServletActionContext.getRequest().getParameter("salesChanceSuccessRate");
		String salesChanceOutline=(String) ServletActionContext.getRequest().getParameter("salesChanceOutline");
		String contactName=(String) ServletActionContext.getRequest().getParameter("contactName");
		String contactTel=(String) ServletActionContext.getRequest().getParameter("contactTel");
		String salesChanceDescribe=(String) ServletActionContext.getRequest().getParameter("salesChanceDescribe");
		String createName=(String) ServletActionContext.getRequest().getParameter("createName");
		String createTime=(String) ServletActionContext.getRequest().getParameter("createTime");
		
		try 
		{
			ClientManager clientManager=new ClientManager();
			
			SalesChance salesChance=new SalesChance();
			salesChance.setAssignOrNot("0");
			
			if(authority.equals("4"))//客户经理
			{
				clientManager=clientManagerDao.getClientManagerByName(createName);
				salesChance.setClientManagerCreater(clientManager);
			}
			salesChance.setClientName(clientName);
			
			salesChance.setContactName(contactName);
			salesChance.setContactTel(contactTel);
			salesChance.setCreateTime(createTime);
			salesChance.setSalesChanceDescribe(salesChanceDescribe);
			salesChance.setSalesChanceOutline(salesChanceOutline);
			salesChance.setSalesChanceSource(salesChanceSource);
			salesChance.setSalesChanceSuccessRate(salesChanceSuccessRate);
			
			/*	//保存客户以及联系人
			Contact contact = new Contact();
			contact.setContactName(contactName);
			contact.setContactTel(contactTel);

			Client client= new Client();
			client.setClientName(clientName);
			client.setClientManager(clientManager);
			
			Set<Contact> contactList = new HashSet<Contact>();
			contactList.add(contact);
			client.setContactList(contactList);
			
			clientDao.saveClient(client);
			contactDao.saveContact(contact);
			*/
			
			String resultStr1=salesChanceDao.saveSalesChance(salesChance).toString();		
			if(resultStr1.equals("success"))	
				return SUCCESS;
			else
				return FAILED;
			
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return null;
		
	}

	/**
	 * 预将跳转至新增销售机会页面
	 * @return
	 */
	public String salesChanceToCreate()
	{
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		ServletActionContext.getRequest().setAttribute("createTime", df.format(new Date()));
		
		return SUCCESS;
	
	}
	
	/**
	 * 进入销售机会管理页面
	 * @return
	 */
	public String salesChanceToCenter()
	{				
		List<SalesChance> salesChanceNoAppList=salesChanceDao.getSalesChanceNotApp();	
		ServletActionContext.getRequest().setAttribute("salesChanceNoAppList", salesChanceNoAppList);
		
		return SUCCESS;

	}
	
	/**
	 * 进入销售机会修改页面
	 * @return
	 */
	public String salesChanceToModify()
	{			
		int salesChanceId=Integer.parseInt(ServletActionContext.getRequest().getParameter("salesChanceId"));
		SalesChance salesChance=salesChanceDao.getSalesChanceById(salesChanceId);
		
		if(salesChance.getClientManagerCreater()!=null)
			ServletActionContext.getRequest().setAttribute("createNames", 
					salesChance.getClientManagerCreater().getClientManagerName());
		else 
			ServletActionContext.getRequest().setAttribute("createNames", 
					salesChance.getSalesManagerCreater().getSalesManagerName().toString());

		ServletActionContext.getRequest().setAttribute("salesChance", salesChance);
		
		return SUCCESS;

	}
	
	/**
	 * 修改销售机会
	 * @return
	 */
	public String salesChanceModify()
	{			
		int salesChanceId=Integer.parseInt(ServletActionContext.getRequest().getParameter("salesChanceId"));
		SalesChance salesChance=salesChanceDao.getSalesChanceById(salesChanceId);
		
		String salesChanceSource=(String) ServletActionContext.getRequest().getParameter("salesChanceSource");
		String clientName=(String) ServletActionContext.getRequest().getParameter("clientName");	
		System.out.println("clientName:"+clientName);
		String salesChanceSuccessRate=(String) ServletActionContext.getRequest().getParameter("salesChanceSuccessRate");		
		String salesChanceOutline=(String) ServletActionContext.getRequest().getParameter("salesChanceOutline");
		String contactName=(String) ServletActionContext.getRequest().getParameter("contactName");		
		String contactTel=(String) ServletActionContext.getRequest().getParameter("contactTel");		
		String salesChanceDescribe=(String) ServletActionContext.getRequest().getParameter("salesChanceDescribe");
		
		salesChance.setSalesChanceSource(salesChanceSource);
		salesChance.setClientName(clientName);
		salesChance.setSalesChanceSuccessRate(salesChanceSuccessRate);
		salesChance.setSalesChanceOutline(salesChanceOutline);
		salesChance.setContactName(contactName);
		salesChance.setContactTel(contactTel);
		salesChance.setSalesChanceDescribe(salesChanceDescribe);
		
		String str=salesChanceDao.updateSalesChance(salesChance);
		if(str.equals("success"))
			return SUCCESS;
		else
			return FAILED;

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

}
