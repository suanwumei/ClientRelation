package action;

import java.io.UnsupportedEncodingException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.springframework.transaction.annotation.Transactional;

import com.opensymphony.xwork2.ActionContext;

import dao.ClientDao;
import dao.ClientManagerDao;
import dao.ContactDao;
import dao.SalesChanceDao;
import dao.SalesManagerDao;
import domain.Authority;
import domain.ClientManager;
import domain.SalesChance;
import domain.SalesManager;

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
	private SalesManagerDao salesManagerDao;
	private ClientDao clientDao;
	private ContactDao contactDao;
	
	/**
	 * 创建销售机会
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
	@Transactional
	public String createSalesChance() throws UnsupportedEncodingException
	{
		ActionContext ctx=ActionContext.getContext();
		Authority authority=(Authority) ctx.getSession().get("authority");
		
		String clientName=new String(ServletActionContext.getRequest().getParameter("clientName").getBytes("ISO-8859-1"),"UTF-8");
		String salesChanceSource=new String(ServletActionContext.getRequest().getParameter("salesChanceSource").getBytes("ISO-8859-1"),"UTF-8");
//		String salesChanceSource=(String) ServletActionContext.getRequest().getParameter("salesChanceSource");
//		String clientName=(String) ServletActionContext.getRequest().getParameter("clientName");
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
			SalesManager salesManager=new SalesManager();
			
			SalesChance salesChance=new SalesChance();
			
			/**
			 * 客户经理创建销售机会
			 */
			if(authority.getAuthorityId()==4)
			{
				clientManager=clientManagerDao.getClientManagerByName(createName);
				salesChance.setClientManagerCreater(clientManager);
			}
			else if(authority.getAuthorityId()==3)
			{
				salesManager=salesManagerDao.getSalesManagerByName(createName);
				salesChance.setSalesManagerCreater(salesManager);
			}
				
			salesChance.setClientName(clientName);
			System.out.println(clientName);
			salesChance.setAssignOrNot("0");
			
			salesChance.setContactName(contactName);
			salesChance.setContactTel(contactTel);
			salesChance.setCreateTime(createTime);
			salesChance.setSalesChanceDescribe(salesChanceDescribe);
			salesChance.setSalesChanceOutline(salesChanceOutline);
			salesChance.setSalesChanceSource(salesChanceSource);
			salesChance.setSalesChanceSuccessRate(salesChanceSuccessRate);
			
			String resultStr1=salesChanceDao.saveSalesChance(salesChance).toString();		
			if(resultStr1.equals("success"))	
			{
				List<SalesChance> salesChanceNoAppList=salesChanceDao.getSalesChanceNotApp();	
				ServletActionContext.getRequest().setAttribute("salesChanceNoAppList", salesChanceNoAppList);
				/**
				 * 销售主管
				 */
				if(authority.getAuthorityId()==3)
				{
					return "salesManager";
				}
				/**
				 * 客户经理
				 */
				else
				{
					return "clientManager";
				}
				
			}
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
	 * 进入销售机会管理页面
	 * @return
	 */
	@Transactional
	public String salesChanceManage()
	{		
		try
		{
			List<SalesChance> salesChanceNoAppList=salesChanceDao.getSalesChanceNotApp();	
			ServletActionContext.getRequest().setAttribute("salesChanceNoAppList", salesChanceNoAppList);
			Authority authority=(Authority) ActionContext.getContext().getSession().get("authority");
			/**
			 * 销售主管
			 */
			if(authority.getAuthorityId()==3)
			{
				return "salesManager";
			}
			/**
			 * 客户经理
			 */
			else
			{
				return "clientManager";
			}
		}
		catch(Exception e)
		{
			return "failed";
		}

	}

	
	/**
	 * 进入销售机会修改页面
	 * @return
	 */
	@Transactional
	public String modifySalesChance()
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
	@Transactional
	public String commitModifySalesChance()
	{			
		int salesChanceId=Integer.parseInt(ServletActionContext.getRequest().getParameter("salesChanceId"));
		SalesChance salesChance=salesChanceDao.getSalesChanceById(salesChanceId);
		
		String salesChanceSource=(String) ServletActionContext.getRequest().getParameter("salesChanceSource");
		String clientName=(String) ServletActionContext.getRequest().getParameter("clientName");	
		
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
		{
			try
			{
				List<SalesChance> salesChanceNoAppList=salesChanceDao.getSalesChanceNotApp();	
				ServletActionContext.getRequest().setAttribute("salesChanceNoAppList", salesChanceNoAppList);
				Authority authority=(Authority) ActionContext.getContext().getSession().get("authority");
				/**
				 * 销售主管
				 */
				if(authority.getAuthorityId()==3)
				{
					return "salesManager";
				}
				/**
				 * 客户经理
				 */
				else
				{
					return "clientManager";
				}
			}
			catch(Exception e)
			{
				return FAILED;
			}
			
		}
		else
			return FAILED;

	}
	
	/**
	 * 删除销售机会
	 * @return
	 */
	@Transactional
	public String deleteSalesChance()
	{			
		int salesChanceId=Integer.parseInt(ServletActionContext.getRequest().getParameter("salesChanceId"));
		
		String resultStr="failed";
		resultStr=salesChanceDao.deleteSalesChanceById(salesChanceId);
		if(resultStr.equals("success"))
		{
			try
			{
				List<SalesChance> salesChanceNoAppList=salesChanceDao.getSalesChanceNotApp();	
				ServletActionContext.getRequest().setAttribute("salesChanceNoAppList", salesChanceNoAppList);
				Authority authority=(Authority) ActionContext.getContext().getSession().get("authority");
				/**
				 * 销售主管
				 */
				if(authority.getAuthorityId()==3)
				{
					return "salesManager";
				}
				/**
				 * 客户经理
				 */
				else
				{
					return "clientManager";
				}
			}
			catch(Exception e)
			{
				return FAILED;
			}
		}
		else
			return FAILED;

	}
	
	/**
	 * 转到指派销售机会页面
	 * @return
	 */
	@Transactional
	public String appointSalesChance()
	{			
		int salesChanceId=Integer.parseInt(ServletActionContext.getRequest().getParameter("salesChanceId"));
		try
		{
			SalesChance salesChance=salesChanceDao.getSalesChanceById(salesChanceId);
			List<ClientManager> clientManagerList;
			clientManagerList = clientManagerDao.getAllClientManager();
			ServletActionContext.getRequest().setAttribute("clientManagerList",clientManagerList);
			
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
			ServletActionContext.getRequest().setAttribute("appintTime", df.format(new Date()));
			if(salesChance.getClientManagerCreater()!=null)
			{
				ServletActionContext.getRequest().setAttribute("createName", salesChance.getClientManagerCreater().getClientManagerName());
			}
			else
			{
				ServletActionContext.getRequest().setAttribute("createName", salesChance.getSalesManagerCreater().getSalesManagerName());
				
			}
			
			ServletActionContext.getRequest().setAttribute("salesChance", salesChance);
			
			return SUCCESS;
		}
		catch(Exception e)
		{
			return FAILED;
		}	

	}
	
	/**
	 * 指派销售机会
	 * @return
	 */
	@Transactional
	public String commitAppointSalesChance()
	{			
		int salesChanceId=Integer.parseInt(ServletActionContext.getRequest().getParameter("salesChanceId"));
		SalesChance salesChance=salesChanceDao.getSalesChanceById(salesChanceId);
		
		int clientManagerId=Integer.parseInt(ServletActionContext.getRequest().getParameter("clientManagerId"));
		ClientManager clientManager=clientManagerDao.getClientManagerById(clientManagerId);
		
		salesChance.setSalesChanceAppoint(clientManager);
		salesChance.setAssignOrNot("1");
		salesChance.setSalesChanceStatus("开发中");
		
		String str=salesChanceDao.updateSalesChance(salesChance);
		if(str.equals("success"))
		{
			List<SalesChance> salesChanceNoAppList=salesChanceDao.getSalesChanceNotApp();	
			ServletActionContext.getRequest().setAttribute("salesChanceNoAppList", salesChanceNoAppList);
			
			return "salesManager";
		}
		else
			return FAILED;

	}
	
	/**
	 * 客户经理查看分配给自己的销售机会
	 * @return
	 */
	@Transactional
	public String viewAppointedSalesChance()
	{
		ClientManager clientManager=(ClientManager) ActionContext.getContext().getSession().get("user");
		List<SalesChance> salesChanceList;
		try
		{
			salesChanceList=clientManagerDao.getAppointAndUnfinishSalesChance(clientManager);
			ServletActionContext.getRequest().setAttribute("salesChanceList", salesChanceList);
		
			return SUCCESS;
		}
		catch(Exception e)
		{
			return FAILED;
		}
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

}
