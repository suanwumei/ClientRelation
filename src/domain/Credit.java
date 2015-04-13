package domain;

/**
 * 客户信誉等级
 * @author admin
 *
 */
public class Credit 
{
	/**
	 * 信誉度Id
	 */
	private int creditId;

	/**
	 * 信誉度名称
	 */
	private String creditName;

	/**
	 * 
	 */
	public Credit() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param creditId
	 * @param creditName
	 */
	public Credit(int creditId, String creditName) {
		super();
		this.creditId = creditId;
		this.creditName = creditName;
	}

	/**
	 * @return the creditId
	 */
	public int getCreditId() {
		return creditId;
	}

	/**
	 * @param creditId the creditId to set
	 */
	public void setCreditId(int creditId) {
		this.creditId = creditId;
	}

	/**
	 * @return the creditName
	 */
	public String getCreditName() {
		return creditName;
	}

	/**
	 * @param creditName the creditName to set
	 */
	public void setCreditName(String creditName) {
		this.creditName = creditName;
	}
	
	
}
