package domain;

/**
 * 客户服务
 * @author admin
 *
 */
public class Service 
{
	/**
	 * 服务记录Id
	 */
	private int serviceId;
	
	/**
	 * 服务类型
	 */
	private ServiceType serviceType;
	
	/**
	 * 服务概要
	 */
	private String serviceOutline;
	
	/**
	 * 服务创建者
	 */
	private Client client;
	
	/**
	 * 服务状态
	 */
	private String serviceState;
	
	/**
	 * 服务请求
	 */
	private String serviceRequest;
	
	/**
	 * 服务创建者
	 */
	private ClientManager servicecCreater;
	
	/**
	 * 创建时间
	 */
	private String createTime;
	
	/**
	 * 分配人员
	 */
	private ClientManager allocatePerson;
	
	/**
	 * 分配时间
	 */
	private String allocateTime;
	
	/**
	 * 服务处理
	 */
	private String serviceProcess;
	
	/**
	 * 处理时间
	 */
	private String processTime;
	
	/**
	 * 处理结果
	 */
	private String processResult;
	
	/**
	 * 服务满意度
	 */
	private Satisfaction satisfaction;

	/**
	 * 
	 */
	public Service() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param serviceId
	 * @param serviceType
	 * @param serviceOutline
	 * @param client
	 * @param serviceState
	 * @param serviceRequest
	 * @param servicecCreater
	 * @param createTime
	 * @param allocatePerson
	 * @param allocateTime
	 * @param serviceProcess
	 * @param processTime
	 * @param processResult
	 * @param satisfaction
	 */
	public Service(int serviceId, domain.ServiceType serviceType,
			String serviceOutline, Client client, String serviceState,
			String serviceRequest, ClientManager servicecCreater,
			String createTime, ClientManager allocatePerson,
			String allocateTime, String serviceProcess, String processTime,
			String processResult, Satisfaction satisfaction) {
		super();
		this.serviceId = serviceId;
		this.serviceType = serviceType;
		this.serviceOutline = serviceOutline;
		this.client = client;
		this.serviceState = serviceState;
		this.serviceRequest = serviceRequest;
		this.servicecCreater = servicecCreater;
		this.createTime = createTime;
		this.allocatePerson = allocatePerson;
		this.allocateTime = allocateTime;
		this.serviceProcess = serviceProcess;
		this.processTime = processTime;
		this.processResult = processResult;
		this.satisfaction = satisfaction;
	}

	/**
	 * @return the serviceId
	 */
	public int getServiceId() {
		return serviceId;
	}

	/**
	 * @param serviceId the serviceId to set
	 */
	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}

	/**
	 * @return the serviceType
	 */
	public ServiceType getServiceType() {
		return serviceType;
	}

	/**
	 * @param serviceType the serviceType to set
	 */
	public void setServiceType(ServiceType serviceType) {
		this.serviceType = serviceType;
	}

	/**
	 * @return the serviceOutline
	 */
	public String getServiceOutline() {
		return serviceOutline;
	}

	/**
	 * @param serviceOutline the serviceOutline to set
	 */
	public void setServiceOutline(String serviceOutline) {
		this.serviceOutline = serviceOutline;
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
	 * @return the serviceState
	 */
	public String getServiceState() {
		return serviceState;
	}

	/**
	 * @param serviceState the serviceState to set
	 */
	public void setServiceState(String serviceState) {
		this.serviceState = serviceState;
	}

	/**
	 * @return the serviceRequest
	 */
	public String getServiceRequest() {
		return serviceRequest;
	}

	/**
	 * @param serviceRequest the serviceRequest to set
	 */
	public void setServiceRequest(String serviceRequest) {
		this.serviceRequest = serviceRequest;
	}

	/**
	 * @return the servicecCreater
	 */
	public ClientManager getServicecCreater() {
		return servicecCreater;
	}

	/**
	 * @param servicecCreater the servicecCreater to set
	 */
	public void setServicecCreater(ClientManager servicecCreater) {
		this.servicecCreater = servicecCreater;
	}

	/**
	 * @return the createTime
	 */
	public String getCreateTime() {
		return createTime;
	}

	/**
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	/**
	 * @return the allocatePerson
	 */
	public ClientManager getAllocatePerson() {
		return allocatePerson;
	}

	/**
	 * @param allocatePerson the allocatePerson to set
	 */
	public void setAllocatePerson(ClientManager allocatePerson) {
		this.allocatePerson = allocatePerson;
	}

	/**
	 * @return the allocateTime
	 */
	public String getAllocateTime() {
		return allocateTime;
	}

	/**
	 * @param allocateTime the allocateTime to set
	 */
	public void setAllocateTime(String allocateTime) {
		this.allocateTime = allocateTime;
	}

	/**
	 * @return the serviceProcess
	 */
	public String getServiceProcess() {
		return serviceProcess;
	}

	/**
	 * @param serviceProcess the serviceProcess to set
	 */
	public void setServiceProcess(String serviceProcess) {
		this.serviceProcess = serviceProcess;
	}

	/**
	 * @return the processTime
	 */
	public String getProcessTime() {
		return processTime;
	}

	/**
	 * @param processTime the processTime to set
	 */
	public void setProcessTime(String processTime) {
		this.processTime = processTime;
	}

	/**
	 * @return the processResult
	 */
	public String getProcessResult() {
		return processResult;
	}

	/**
	 * @param processResult the processResult to set
	 */
	public void setProcessResult(String processResult) {
		this.processResult = processResult;
	}

	/**
	 * @return the satisfaction
	 */
	public Satisfaction getSatisfaction() {
		return satisfaction;
	}

	/**
	 * @param satisfaction the satisfaction to set
	 */
	public void setSatisfaction(Satisfaction satisfaction) {
		this.satisfaction = satisfaction;
	}

}
