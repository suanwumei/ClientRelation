package domain;

/**
 * 暂缓流失表
 * @author admin
 *
 */
public class TempLoss 
{
	/**
	 * 暂缓流失记录Id
	 */
	private int tempLossId;
	
	/**
	 * 相关客户
	 */
	private Client client;
	
	/**
	 * 负责的客户经理
	 */
	private ClientManager tempLossManager;
	
	/**
	 * 上次下单时间
	 */
	private String tempLossBefore;
	
	/**
	 * 确认流失时间
	 */
	private String lossComfirm;
	
	/**
	 * 暂缓措施
	 */
	private String tempLossTac;
	
	/**
	 * 状态
	 */
	private String tempLossState;

	/**
	 * 
	 */
	public TempLoss() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param tempLossId
	 * @param client
	 * @param tempLossManager
	 * @param tempLossBefore
	 * @param lossComfirm
	 * @param tempLossTac
	 * @param tempLossState
	 */
	public TempLoss(int tempLossId, Client client,
			ClientManager tempLossManager, String tempLossBefore,
			String lossComfirm, String tempLossTac, String tempLossState) {
		super();
		this.tempLossId = tempLossId;
		this.client = client;
		this.tempLossManager = tempLossManager;
		this.tempLossBefore = tempLossBefore;
		this.lossComfirm = lossComfirm;
		this.tempLossTac = tempLossTac;
		this.tempLossState = tempLossState;
	}

	/**
	 * @return the tempLossId
	 */
	public int getTempLossId() {
		return tempLossId;
	}

	/**
	 * @param tempLossId the tempLossId to set
	 */
	public void setTempLossId(int tempLossId) {
		this.tempLossId = tempLossId;
	}

	/**
	 * @return the client
	 */
	public Client getClient() {
		return client;
	}

	/**
	 * @param client the client to set
	 */
	public void setClient(Client client) {
		this.client = client;
	}

	/**
	 * @return the tempLossManager
	 */
	public ClientManager getTempLossManager() {
		return tempLossManager;
	}

	/**
	 * @param tempLossManager the tempLossManager to set
	 */
	public void setTempLossManager(ClientManager tempLossManager) {
		this.tempLossManager = tempLossManager;
	}

	/**
	 * @return the tempLossBefore
	 */
	public String getTempLossBefore() {
		return tempLossBefore;
	}

	/**
	 * @param tempLossBefore the tempLossBefore to set
	 */
	public void setTempLossBefore(String tempLossBefore) {
		this.tempLossBefore = tempLossBefore;
	}

	/**
	 * @return the lossComfirm
	 */
	public String getLossComfirm() {
		return lossComfirm;
	}

	/**
	 * @param lossComfirm the lossComfirm to set
	 */
	public void setLossComfirm(String lossComfirm) {
		this.lossComfirm = lossComfirm;
	}

	/**
	 * @return the tempLossTac
	 */
	public String getTempLossTac() {
		return tempLossTac;
	}

	/**
	 * @param tempLossTac the tempLossTac to set
	 */
	public void setTempLossTac(String tempLossTac) {
		this.tempLossTac = tempLossTac;
	}

	/**
	 * @return the tempLossState
	 */
	public String getTempLossState() {
		return tempLossState;
	}

	/**
	 * @param tempLossState the tempLossState to set
	 */
	public void setTempLossState(String tempLossState) {
		this.tempLossState = tempLossState;
	}
	

}
