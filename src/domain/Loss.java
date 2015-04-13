package domain;

/**
 * 确认流失
 * @author admin
 *
 */
public class Loss 
{
	/**
	 * 流失记录Id
	 */
	private int lossId;
	
	/**
	 * 相关的暂缓流失
	 */
	private TempLoss tempLoss;
	
	/**
	 * 流失的原因
	 */
	private String lossReason;

	/**
	 * 
	 */
	public Loss() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param lossId
	 * @param tempLoss
	 * @param lossReason
	 */
	public Loss(int lossId, domain.TempLoss tempLoss, String lossReason) {
		super();
		this.lossId = lossId;
		this.tempLoss = tempLoss;
		this.lossReason = lossReason;
	}

	/**
	 * @return the lossId
	 */
	public int getLossId() {
		return lossId;
	}

	/**
	 * @param lossId the lossId to set
	 */
	public void setLossId(int lossId) {
		this.lossId = lossId;
	}

	/**
	 * @return the tempLoss
	 */
	public TempLoss getTempLoss() {
		return tempLoss;
	}

	/**
	 * @param tempLoss the tempLoss to set
	 */
	public void setTempLoss(TempLoss tempLoss) {
		this.tempLoss = tempLoss;
	}

	/**
	 * @return the lossReason
	 */
	public String getLossReason() {
		return lossReason;
	}

	/**
	 * @param lossReason the lossReason to set
	 */
	public void setLossReason(String lossReason) {
		this.lossReason = lossReason;
	}

}
