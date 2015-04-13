package domain;

/**
 * 
 * 客户满意度
 * @author admin
 *
 */
public class Satisfaction 
{
	/**
	 * 满意度Id
	 */
	private int satisfactionId;
	
	/**
	 * 满意度名称
	 */
	private String satisfactionName;

	/**
	 * 
	 */
	public Satisfaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param satisfactionId
	 * @param satisfactionName
	 */
	public Satisfaction(int satisfactionId, String satisfactionName) {
		super();
		this.satisfactionId = satisfactionId;
		this.satisfactionName = satisfactionName;
	}

	/**
	 * @return the satisfactionId
	 */
	public int getSatisfactionId() {
		return satisfactionId;
	}

	/**
	 * @param satisfactionId the satisfactionId to set
	 */
	public void setSatisfactionId(int satisfactionId) {
		this.satisfactionId = satisfactionId;
	}

	/**
	 * @return the satisfactionName
	 */
	public String getSatisfactionName() {
		return satisfactionName;
	}

	/**
	 * @param satisfactionName the satisfactionName to set
	 */
	public void setSatisfactionName(String satisfactionName) {
		this.satisfactionName = satisfactionName;
	}

}
