package domain;

/**
 * 客户交往记录
 * @author admin
 *
 */
public class Communication
{
	/**
	 * 交往记录Id
	 */
	private int commuId;
	
	/**
	 * 交往时间
	 */
	private String commuTime;
	
	/**
	 * 交往地点
	 */
	private String commuLocate;
	
	/**
	 * 交往概要
	 */
	private String commuSummary;
	
	/**
	 * 详细信息
	 */
	private String commuDetail;
	
	/**
	 * 备注
	 */
	private String ps;

	/**
	 * 
	 */
	public Communication() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param commuId
	 * @param commuTime
	 * @param commuLocate
	 * @param commuSummary
	 * @param commuDetail
	 * @param ps
	 */
	public Communication(int commuId, String commuTime, String commuLocate,
			String commuSummary, String commuDetail, String ps) {
		super();
		this.commuId = commuId;
		this.commuTime = commuTime;
		this.commuLocate = commuLocate;
		this.commuSummary = commuSummary;
		this.commuDetail = commuDetail;
		this.ps = ps;
	}

	/**
	 * @return the commuId
	 */
	public int getCommuId() {
		return commuId;
	}

	/**
	 * @param commuId the commuId to set
	 */
	public void setCommuId(int commuId) {
		this.commuId = commuId;
	}

	/**
	 * @return the commuTime
	 */
	public String getCommuTime() {
		return commuTime;
	}

	/**
	 * @param commuTime the commuTime to set
	 */
	public void setCommuTime(String commuTime) {
		this.commuTime = commuTime;
	}

	/**
	 * @return the commuLocate
	 */
	public String getCommuLocate() {
		return commuLocate;
	}

	/**
	 * @param commuLocate the commuLocate to set
	 */
	public void setCommuLocate(String commuLocate) {
		this.commuLocate = commuLocate;
	}

	/**
	 * @return the commuSummary
	 */
	public String getCommuSummary() {
		return commuSummary;
	}

	/**
	 * @param commuSummary the commuSummary to set
	 */
	public void setCommuSummary(String commuSummary) {
		this.commuSummary = commuSummary;
	}

	/**
	 * @return the commuDetail
	 */
	public String getCommuDetail() {
		return commuDetail;
	}

	/**
	 * @param commuDetail the commuDetail to set
	 */
	public void setCommuDetail(String commuDetail) {
		this.commuDetail = commuDetail;
	}

	/**
	 * @return the ps
	 */
	public String getPs() {
		return ps;
	}

	/**
	 * @param ps the ps to set
	 */
	public void setPs(String ps) {
		this.ps = ps;
	}
	
}
