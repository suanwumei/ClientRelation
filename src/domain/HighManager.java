package domain;

/**
 * 高管
 * @author admin
 *
 */
public class HighManager 
{
	/**
	 * 高管Id
	 */
	private int highManagerId;
	
	/**
	 * 高管姓名
	 */
	private String highManagerName;
	
	/**
	 * 密码
	 */
	private String password;
	
	/**
	 * 权限
	 */
	private Authority authority;

	/**
	 * 
	 */
	public HighManager() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param highManagerId
	 * @param highManagerName
	 * @param password
	 * @param authority
	 */
	public HighManager(int highManagerId, String highManagerName,
			String password, Authority authority) {
		super();
		this.highManagerId = highManagerId;
		this.highManagerName = highManagerName;
		this.password = password;
		this.authority = authority;
	}

	/**
	 * @return the highManagerId
	 */
	public int getHighManagerId() {
		return highManagerId;
	}

	/**
	 * @param highManagerId the highManagerId to set
	 */
	public void setHighManagerId(int highManagerId) {
		this.highManagerId = highManagerId;
	}

	/**
	 * @return the highManagerName
	 */
	public String getHighManagerName() {
		return highManagerName;
	}

	/**
	 * @param highManagerName the highManagerName to set
	 */
	public void setHighManagerName(String highManagerName) {
		this.highManagerName = highManagerName;
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
