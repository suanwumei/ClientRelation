package domain;

import java.util.Set;

/**
 * 客户经理
 * @author admin
 *
 */
public class ClientManager
{
	/**
	 * 用户Id
	 */
	private int clientManagerId;
		
	/**
	 * 用户名称
	 */
	private String clientManagerName;
		
	/**
	 * 用户密码
	 */
	private String password;
		
	/**
	 * 用户权限
	 */
	private Authority authority;
	
	/**
	 * 客户列表
	 */
	private Set<Client> clientList;

	/**
	 * 
	 */
	public ClientManager() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param clientManagerId
	 * @param clientManagerName
	 * @param password
	 * @param authority
	 * @param clientList
	 */
	public ClientManager(int clientManagerId, String clientManagerName,
			String password, Authority authority, Set<Client> clientList) {
		super();
		this.clientManagerId = clientManagerId;
		this.clientManagerName = clientManagerName;
		this.password = password;
		this.authority = authority;
		this.clientList = clientList;
	}


	/**
	 * @return the clientManagerId
	 */
	public int getClientManagerId() {
		return clientManagerId;
	}

	/**
	 * @param clientManagerId the clientManagerId to set
	 */
	public void setClientManagerId(int clientManagerId) {
		this.clientManagerId = clientManagerId;
	}

	/**
	 * @return the clientManagerName
	 */
	public String getClientManagerName() {
		return clientManagerName;
	}

	/**
	 * @param clientManagerName the clientManagerName to set
	 */
	public void setClientManagerName(String clientManagerName) {
		this.clientManagerName = clientManagerName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the authority
	 */
	public Authority getAuthority() {
		return authority;
	}

	/**
	 * @param authority the authority to set
	 */
	public void setAuthority(Authority authority) {
		this.authority = authority;
	}

	/**
	 * @return the clientList
	 */
	public Set<Client> getClientList() {
		return clientList;
	}

	/**
	 * @param clientList the clientList to set
	 */
	public void setClientList(Set<Client> clientList) {
		this.clientList = clientList;
	}

}
