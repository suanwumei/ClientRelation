package domain;

/**
 * 客户开发计划
 * @author admin
 *
 */
public class Develop 
{
	/**
	 * 开发计划Id
	 */
	private int developId;
	
	/**
	 * 日期
	 */
	private String developTime;
	
	/**
	 * 计划事项
	 */
	private String developPlan;
	
	/**
	 * 执行结果
	 */
	private String executeResult;

	/**
	 * 
	 */
	public Develop() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param developId
	 * @param developTime
	 * @param developPlan
	 * @param executeResult
	 */
	public Develop(int developId, String developTime, String developPlan,
			String executeResult) {
		super();
		this.developId = developId;
		this.developTime = developTime;
		this.developPlan = developPlan;
		this.executeResult = executeResult;
	}

	/**
	 * @return the developId
	 */
	public int getDevelopId() {
		return developId;
	}

	/**
	 * @param developId the developId to set
	 */
	public void setDevelopId(int developId) {
		this.developId = developId;
	}

	/**
	 * @return the developTime
	 */
	public String getDevelopTime() {
		return developTime;
	}

	/**
	 * @param developTime the developTime to set
	 */
	public void setDevelopTime(String developTime) {
		this.developTime = developTime;
	}

	/**
	 * @return the developPlan
	 */
	public String getDevelopPlan() {
		return developPlan;
	}

	/**
	 * @param developPlan the developPlan to set
	 */
	public void setDevelopPlan(String developPlan) {
		this.developPlan = developPlan;
	}

	/**
	 * @return the executeResult
	 */
	public String getExecuteResult() {
		return executeResult;
	}

	/**
	 * @param executeResult the executeResult to set
	 */
	public void setExecuteResult(String executeResult) {
		this.executeResult = executeResult;
	}

}
