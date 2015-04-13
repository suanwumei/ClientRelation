package domain;

/**
 * 服务类型
 * @author admin
 *
 */
public class ServiceType 
{
	/**
	 * 服务类型Id
	 */
	private int serviceTypeId;

	/**
	 * 服务名称
	 */
	private String serviceName;

	/**
	 * 
	 */
	public ServiceType() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param serviceTypeId
	 * @param serviceName
	 */
	public ServiceType(int serviceTypeId, String serviceName) {
		super();
		this.serviceTypeId = serviceTypeId;
		this.serviceName = serviceName;
	}

	/**
	 * @return the serviceTypeId
	 */
	public int getServiceTypeId() {
		return serviceTypeId;
	}

	/**
	 * @param serviceTypeId the serviceTypeId to set
	 */
	public void setServiceTypeId(int serviceTypeId) {
		this.serviceTypeId = serviceTypeId;
	}

	/**
	 * @return the serviceName
	 */
	public String getServiceName() {
		return serviceName;
	}

	/**
	 * @param serviceName the serviceName to set
	 */
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	
}
