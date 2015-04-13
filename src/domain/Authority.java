package domain;

/**
 * 权限
 * @author admin
 *
 */
public class Authority 
{
	/**
	 * 权限Id
	 */
	private int authorityId;
	
	/**
	 * 权限名称
	 */
	private String authorityName;

	/**
	 * 
	 */
	public Authority() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param authorityId
	 * @param authorityName
	 */
	public Authority(int authorityId, String authorityName) {
		super();
		this.authorityId = authorityId;
		this.authorityName = authorityName;
	}

	/**
	 * @return the authorityId
	 */
	public int getAuthorityId() {
		return authorityId;
	}

	/**
	 * @param authorityId the authorityId to set
	 */
	public void setAuthorityId(int authorityId) {
		this.authorityId = authorityId;
	}

	/**
	 * @return the authorityName
	 */
	public String getAuthorityName() {
		return authorityName;
	}

	/**
	 * @param authorityName the authorityName to set
	 */
	public void setAuthorityName(String authorityName) {
		this.authorityName = authorityName;
	}
	
}
