package domain;

import java.util.Set;

/**
 * 客户
 * @author admin
 *
 */
public class Client 
{
	/**
	 * 客户名称
	 */
	private int clientId;
	
	/**
	 * 客户姓名
	 */
	private String clientName;
	
	/**
	 * 客户地址
	 */
	private String clientAddress;
	
	/**
	 * 邮政编码
	 */
	private String clientPost;
	
	/**
	 * 客户电话
	 */
	private String clientTel;
	
	/**
	 * 客户传真
	 */
	private String clientFax;
	
	/**
	 * 客户网址
	 */
	private String clientWeb;
	
	/**
	 * 客户营业执照编号
	 */
	private String clientLicense;
	
	/**
	 * 客户法人
	 */
	private String clientLegal;
	
	/**
	 * 客户注册资金
	 */
	private String clientCapital;
	
	/**
	 * 年营业额
	 */
	private String clientRevenue;
	
	/**
	 * 客户开户行
	 */
	private String clientBank;
	
	/**
	 * 客户银行账号
	 */
	private String clientAccount;
	
	/**
	 * 地税登记号码
	 */
	private String clientLandTax;
	
	/**
	 * 国税登记号码
	 */
	private String clientNationalTax;
	
	/**
	 * 客户是否流失
	 */
	private String clientLose;
	
	/**
	 * 客户所在地区
	 */
	private Area clientArea;
	
	/**
	 * 客户所属客户经理
	 */
	private ClientManager clientManager;
	
	/**
	 * 客户等级
	 */
	private Level clientLevel;
	  
	/**
	 * 客户满意度  
	 */
	private Satisfaction clientSatisfaction;
	
	/**
	 * 客户信誉度
	 */
	private Credit clientCredit;
	
	/**
	 * 客户的联系人列表
	 */
	private Set<Contact> contactList;
	
	/**
	 * 客户交往记录
	 */
	private Set<Communication> commuList;
	
	/**
	 * 客户全部订单
	 */
	private Set<Order> orderList;

	/**
	 * 
	 */
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param clientId
	 * @param clientName
	 * @param clientAddress
	 * @param clientPost
	 * @param clientTel
	 * @param clientFax
	 * @param clientWeb
	 * @param clientLicense
	 * @param clientLegal
	 * @param clientCapital
	 * @param clientRevenue
	 * @param clientBank
	 * @param clientAccount
	 * @param clientLandTax
	 * @param clientNationalTax
	 * @param clientLose
	 * @param clientArea
	 * @param clientManager
	 * @param clientLevel
	 * @param clientSatisfaction
	 * @param clientCredit
	 * @param contactList
	 * @param commuList
	 * @param orderList
	 */
	public Client(int clientId, String clientName, String clientAddress,
			String clientPost, String clientTel, String clientFax,
			String clientWeb, String clientLicense, String clientLegal,
			String clientCapital, String clientRevenue, String clientBank,
			String clientAccount, String clientLandTax,
			String clientNationalTax, String clientLose, Area clientArea,
			domain.ClientManager clientManager, Level clientLevel,
			Satisfaction clientSatisfaction, Credit clientCredit,
			Set<Contact> contactList, Set<Communication> commuList,
			Set<Order> orderList) {
		super();
		this.clientId = clientId;
		this.clientName = clientName;
		this.clientAddress = clientAddress;
		this.clientPost = clientPost;
		this.clientTel = clientTel;
		this.clientFax = clientFax;
		this.clientWeb = clientWeb;
		this.clientLicense = clientLicense;
		this.clientLegal = clientLegal;
		this.clientCapital = clientCapital;
		this.clientRevenue = clientRevenue;
		this.clientBank = clientBank;
		this.clientAccount = clientAccount;
		this.clientLandTax = clientLandTax;
		this.clientNationalTax = clientNationalTax;
		this.clientLose = clientLose;
		this.clientArea = clientArea;
		this.clientManager = clientManager;
		this.clientLevel = clientLevel;
		this.clientSatisfaction = clientSatisfaction;
		this.clientCredit = clientCredit;
		this.contactList = contactList;
		this.commuList = commuList;
		this.orderList = orderList;
	}



	/**
	 * @return the clientId
	 */
	public int getClientId() {
		return clientId;
	}

	/**
	 * @param clientId the clientId to set
	 */
	public void setClientId(int clientId) {
		this.clientId = clientId;
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
	 * @return the clientAddress
	 */
	public String getClientAddress() {
		return clientAddress;
	}

	/**
	 * @param clientAddress the clientAddress to set
	 */
	public void setClientAddress(String clientAddress) {
		this.clientAddress = clientAddress;
	}

	/**
	 * @return the clientPost
	 */
	public String getClientPost() {
		return clientPost;
	}

	/**
	 * @param clientPost the clientPost to set
	 */
	public void setClientPost(String clientPost) {
		this.clientPost = clientPost;
	}

	/**
	 * @return the clientTel
	 */
	public String getClientTel() {
		return clientTel;
	}

	/**
	 * @param clientTel the clientTel to set
	 */
	public void setClientTel(String clientTel) {
		this.clientTel = clientTel;
	}

	/**
	 * @return the clientFax
	 */
	public String getClientFax() {
		return clientFax;
	}

	/**
	 * @param clientFax the clientFax to set
	 */
	public void setClientFax(String clientFax) {
		this.clientFax = clientFax;
	}

	/**
	 * @return the clientWeb
	 */
	public String getClientWeb() {
		return clientWeb;
	}

	/**
	 * @param clientWeb the clientWeb to set
	 */
	public void setClientWeb(String clientWeb) {
		this.clientWeb = clientWeb;
	}

	/**
	 * @return the clientLicense
	 */
	public String getClientLicense() {
		return clientLicense;
	}

	/**
	 * @param clientLicense the clientLicense to set
	 */
	public void setClientLicense(String clientLicense) {
		this.clientLicense = clientLicense;
	}

	/**
	 * @return the clientLegal
	 */
	public String getClientLegal() {
		return clientLegal;
	}

	/**
	 * @param clientLegal the clientLegal to set
	 */
	public void setClientLegal(String clientLegal) {
		this.clientLegal = clientLegal;
	}

	/**
	 * @return the clientCapital
	 */
	public String getClientCapital() {
		return clientCapital;
	}

	/**
	 * @param clientCapital the clientCapital to set
	 */
	public void setClientCapital(String clientCapital) {
		this.clientCapital = clientCapital;
	}

	/**
	 * @return the clientRevenue
	 */
	public String getClientRevenue() {
		return clientRevenue;
	}

	/**
	 * @param clientRevenue the clientRevenue to set
	 */
	public void setClientRevenue(String clientRevenue) {
		this.clientRevenue = clientRevenue;
	}

	/**
	 * @return the clientBank
	 */
	public String getClientBank() {
		return clientBank;
	}

	/**
	 * @param clientBank the clientBank to set
	 */
	public void setClientBank(String clientBank) {
		this.clientBank = clientBank;
	}

	/**
	 * @return the clientAccount
	 */
	public String getClientAccount() {
		return clientAccount;
	}

	/**
	 * @param clientAccount the clientAccount to set
	 */
	public void setClientAccount(String clientAccount) {
		this.clientAccount = clientAccount;
	}

	/**
	 * @return the clientLandTax
	 */
	public String getClientLandTax() {
		return clientLandTax;
	}

	/**
	 * @param clientLandTax the clientLandTax to set
	 */
	public void setClientLandTax(String clientLandTax) {
		this.clientLandTax = clientLandTax;
	}

	/**
	 * @return the clientNationalTax
	 */
	public String getClientNationalTax() {
		return clientNationalTax;
	}

	/**
	 * @param clientNationalTax the clientNationalTax to set
	 */
	public void setClientNationalTax(String clientNationalTax) {
		this.clientNationalTax = clientNationalTax;
	}

	/**
	 * @return the clientLose
	 */
	public String getClientLose() {
		return clientLose;
	}

	/**
	 * @param clientLose the clientLose to set
	 */
	public void setClientLose(String clientLose) {
		this.clientLose = clientLose;
	}

	/**
	 * @return the clientArea
	 */
	public Area getClientArea() {
		return clientArea;
	}

	/**
	 * @param clientArea the clientArea to set
	 */
	public void setClientArea(Area clientArea) {
		this.clientArea = clientArea;
	}

	/**
	 * @return the clientManager
	 */
	public ClientManager getClientManager() {
		return clientManager;
	}

	/**
	 * @param clientManager the clientManager to set
	 */
	public void setClientManager(ClientManager clientManager) {
		this.clientManager = clientManager;
	}

	/**
	 * @return the clientLevel
	 */
	public Level getClientLevel() {
		return clientLevel;
	}

	/**
	 * @param clientLevel the clientLevel to set
	 */
	public void setClientLevel(Level clientLevel) {
		this.clientLevel = clientLevel;
	}

	/**
	 * @return the clientSatisfaction
	 */
	public Satisfaction getClientSatisfaction() {
		return clientSatisfaction;
	}

	/**
	 * @param clientSatisfaction the clientSatisfaction to set
	 */
	public void setClientSatisfaction(Satisfaction clientSatisfaction) {
		this.clientSatisfaction = clientSatisfaction;
	}

	/**
	 * @return the clientCredit
	 */
	public Credit getClientCredit() {
		return clientCredit;
	}

	/**
	 * @param clientCredit the clientCredit to set
	 */
	public void setClientCredit(Credit clientCredit) {
		this.clientCredit = clientCredit;
	}

	/**
	 * @return the contactList
	 */
	public Set<Contact> getContactList() {
		return contactList;
	}

	/**
	 * @param contactList the contactList to set
	 */
	public void setContactList(Set<Contact> contactList) {
		this.contactList = contactList;
	}

	/**
	 * @return the commuList
	 */
	public Set<Communication> getCommuList() {
		return commuList;
	}

	/**
	 * @param commuList the commuList to set
	 */
	public void setCommuList(Set<Communication> commuList) {
		this.commuList = commuList;
	}

	/**
	 * @return the orderList
	 */
	public Set<Order> getOrderList() {
		return orderList;
	}

	/**
	 * @param orderList the orderList to set
	 */
	public void setOrderList(Set<Order> orderList) {
		this.orderList = orderList;
	}

}
