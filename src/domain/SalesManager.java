package domain;

/**
 * 销售经理
 * @author admin
 *
 */
public class SalesManager
{
	/**
	 * 用户Id
	 */
	private int salesManagerId;
		
	/**
	 * 用户名称
	 */
	private String salesManagerName;
	
	/**
	 * 用户密码
	 */
	private String password;
		
	/**
	 * 用户权限
	 */
	private Authority authority;

	/**
	 * 
	 */
	public SalesManager() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param salesManagerId
	 * @param salesManagerName
	 * @param password
	 * @param authority
	 */
	public SalesManager(int salesManagerId, String salesManagerName,
			String password, Authority authority) {
		super();
		this.salesManagerId = salesManagerId;
		this.salesManagerName = salesManagerName;
		this.password = password;
		this.authority = authority;
	}

	/**
	 * @return the salesManagerId
	 */
	public int getSalesManagerId() {
		return salesManagerId;
	}

	/**
	 * @param salesManagerId the salesManagerId to set
	 */
	public void setSalesManagerId(int salesManagerId) {
		this.salesManagerId = salesManagerId;
	}

	/**
	 * @return the salesManagerName
	 */
	public String getSalesManagerName() {
		return salesManagerName;
	}

	/**
	 * @param salesManagerName the salesManagerName to set
	 */
	public void setSalesManagerName(String salesManagerName) {
		this.salesManagerName = salesManagerName;
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
	
	
}
