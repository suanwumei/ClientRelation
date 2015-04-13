package domain;

import java.util.Set;

/**
 * 销售机会
 * @author admin
 *
 */
public class SalesChance 
{
	/**
	 * 销售机会记录Id
	 */
	private int salesChanceId;
	
	/**
	 * 销售机会来源
	 */
	private String salesChanceSource;
	

	/**
	 * 客户姓名
	 */
	private String clientName;
	
	/**
	 * 销售成功概率
	 */
	private String salesChanceSuccessRate;
	
	/**
	 * 销售机会概要
	 */
	private String salesChanceOutline;
	
	/**
	 * 联系人姓名
	 */
	private String contactName;
	
	/**
	 * 联系人联系方式
	 */
	private String contactTel;
	
	/**
	 * 销售机会描述
	 */
	private String salesChanceDescribe;
	
	/**
	 * 创建销售机会的客户经理
	 */
	private ClientManager clientManagerCreater;
	
	/**
	 * 创建销售机会的销售经理
	 */
	private SalesManager salesManagerCreater;
	
	/**
	 * 销售机会创建时间
	 */
	private String createTime;
	
	/**
	 * 分配指向的销售经理
	 */
	private SalesManager salesChanceAppoint;
	
	/**
	 * 分配时间
	 */
	private String appointTime;
	
	/**
	 * 是否指派
	 */
	private String assignOrNot;
	
	/**
	 * 开发的状态
	 */
	private String salesChanceStatus;
	
	/**
	 * 包含的开发计划
	 */
	private Set<Develop> develops;

	/**
	 * 
	 */
	public SalesChance() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param salesChanceId
	 * @param salesChanceSource
	 * @param clientName
	 * @param salesChanceSuccessRate
	 * @param salesChanceOutline
	 * @param contactName
	 * @param contactTel
	 * @param salesChanceDescribe
	 * @param clientManagerCreater
	 * @param salesManagerCreater
	 * @param createTime
	 * @param salesChanceAppoint
	 * @param appointTime
	 * @param assignOrNot
	 * @param salesChanceStatus
	 * @param develops
	 */
	public SalesChance(int salesChanceId, String salesChanceSource,
			String clientName, String salesChanceSuccessRate,
			String salesChanceOutline, String contactName, String contactTel,
			String salesChanceDescribe, ClientManager clientManagerCreater,
			SalesManager salesManagerCreater, String createTime,
			SalesManager salesChanceAppoint, String appointTime,
			String assignOrNot, String salesChanceStatus, Set<Develop> develops) {
		super();
		this.salesChanceId = salesChanceId;
		this.salesChanceSource = salesChanceSource;
		this.clientName = clientName;
		this.salesChanceSuccessRate = salesChanceSuccessRate;
		this.salesChanceOutline = salesChanceOutline;
		this.contactName = contactName;
		this.contactTel = contactTel;
		this.salesChanceDescribe = salesChanceDescribe;
		this.clientManagerCreater = clientManagerCreater;
		this.salesManagerCreater = salesManagerCreater;
		this.createTime = createTime;
		this.salesChanceAppoint = salesChanceAppoint;
		this.appointTime = appointTime;
		this.assignOrNot = assignOrNot;
		this.salesChanceStatus = salesChanceStatus;
		this.develops = develops;
	}

	/**
	 * @return the salesChanceId
	 */
	public int getSalesChanceId() {
		return salesChanceId;
	}

	/**
	 * @param salesChanceId the salesChanceId to set
	 */
	public void setSalesChanceId(int salesChanceId) {
		this.salesChanceId = salesChanceId;
	}

	/**
	 * @return the salesChanceSource
	 */
	public String getSalesChanceSource() {
		return salesChanceSource;
	}

	/**
	 * @param salesChanceSource the salesChanceSource to set
	 */
	public void setSalesChanceSource(String salesChanceSource) {
		this.salesChanceSource = salesChanceSource;
	}

	/**
	 * @return the clientName
	 */
	public String getClientName() {
		return clientName;
	}

	/**
	 * @param clientName the clientName to set
	 */
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	/**
	 * @return the salesChanceSuccessRate
	 */
	public String getSalesChanceSuccessRate() {
		return salesChanceSuccessRate;
	}

	/**
	 * @param salesChanceSuccessRate the salesChanceSuccessRate to set
	 */
	public void setSalesChanceSuccessRate(String salesChanceSuccessRate) {
		this.salesChanceSuccessRate = salesChanceSuccessRate;
	}

	/**
	 * @return the salesChanceOutline
	 */
	public String getSalesChanceOutline() {
		return salesChanceOutline;
	}

	/**
	 * @param salesChanceOutline the salesChanceOutline to set
	 */
	public void setSalesChanceOutline(String salesChanceOutline) {
		this.salesChanceOutline = salesChanceOutline;
	}

	/**
	 * @return the contactName
	 */
	public String getContactName() {
		return contactName;
	}

	/**
	 * @param contactName the contactName to set
	 */
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	/**
	 * @return the contactTel
	 */
	public String getContactTel() {
		return contactTel;
	}

	/**
	 * @param contactTel the contactTel to set
	 */
	public void setContactTel(String contactTel) {
		this.contactTel = contactTel;
	}

	/**
	 * @return the salesChanceDescribe
	 */
	public String getSalesChanceDescribe() {
		return salesChanceDescribe;
	}

	/**
	 * @param salesChanceDescribe the salesChanceDescribe to set
	 */
	public void setSalesChanceDescribe(String salesChanceDescribe) {
		this.salesChanceDescribe = salesChanceDescribe;
	}

	/**
	 * @return the clientManagerCreater
	 */
	public ClientManager getClientManagerCreater() {
		return clientManagerCreater;
	}

	/**
	 * @param clientManagerCreater the clientManagerCreater to set
	 */
	public void setClientManagerCreater(ClientManager clientManagerCreater) {
		this.clientManagerCreater = clientManagerCreater;
	}

	/**
	 * @return the salesManagerCreater
	 */
	public SalesManager getSalesManagerCreater() {
		return salesManagerCreater;
	}

	/**
	 * @param salesManagerCreater the salesManagerCreater to set
	 */
	public void setSalesManagerCreater(SalesManager salesManagerCreater) {
		this.salesManagerCreater = salesManagerCreater;
	}

	/**
	 * @return the createTime
	 */
	public String getCreateTime() {
		return createTime;
	}

	/**
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	/**
	 * @return the salesChanceAppoint
	 */
	public SalesManager getSalesChanceAppoint() {
		return salesChanceAppoint;
	}

	/**
	 * @param salesChanceAppoint the salesChanceAppoint to set
	 */
	public void setSalesChanceAppoint(SalesManager salesChanceAppoint) {
		this.salesChanceAppoint = salesChanceAppoint;
	}

	/**
	 * @return the appointTime
	 */
	public String getAppointTime() {
		return appointTime;
	}

	/**
	 * @param appointTime the appointTime to set
	 */
	public void setAppointTime(String appointTime) {
		this.appointTime = appointTime;
	}

	/**
	 * @return the assignOrNot
	 */
	public String getAssignOrNot() {
		return assignOrNot;
	}

	/**
	 * @param assignOrNot the assignOrNot to set
	 */
	public void setAssignOrNot(String assignOrNot) {
		this.assignOrNot = assignOrNot;
	}

	/**
	 * @return the salesChanceStatus
	 */
	public String getSalesChanceStatus() {
		return salesChanceStatus;
	}

	/**
	 * @param salesChanceStatus the salesChanceStatus to set
	 */
	public void setSalesChanceStatus(String salesChanceStatus) {
		this.salesChanceStatus = salesChanceStatus;
	}

	/**
	 * @return the develops
	 */
	public Set<Develop> getDevelops() {
		return develops;
	}

	/**
	 * @param develops the develops to set
	 */
	public void setDevelops(Set<Develop> develops) {
		this.develops = develops;
	}	

}
