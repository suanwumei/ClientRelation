package domain;

/**
 * 联系人
 * @author admin
 *
 */
public class Contact 
{
	/**
	 * 联系人Id
	 */
	private int contactId;
	
	/**
	 * 联系人姓名
	 */
	private String contactName;
	
	/**
	 * 联系人性别
	 */
	private String contactGender;
	
	/**
	 * 联系人职位
	 */
	private String contactPosition;
	
	/**
	 * 联系人电话
	 */
	private String contactTel;
	
	/**
	 * 备注
	 */
	private String contactPs;

	/**
	 * 
	 */
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param contactId
	 * @param contactName
	 * @param contactGender
	 * @param contactPosition
	 * @param contactTel
	 * @param contactPs
	 */
	public Contact(int contactId, String contactName, String contactGender,
			String contactPosition, String contactTel, String contactPs) {
		super();
		this.contactId = contactId;
		this.contactName = contactName;
		this.contactGender = contactGender;
		this.contactPosition = contactPosition;
		this.contactTel = contactTel;
		this.contactPs = contactPs;
	}

	/**
	 * @return the contactId
	 */
	public int getContactId() {
		return contactId;
	}

	/**
	 * @param contactId the contactId to set
	 */
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	/**
	 * @return the contactName
	 */
	public String getContactName() {
		return contactName;
	}

	/**
	 * @param contactName the contactName to set
	 */
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	/**
	 * @return the contactGender
	 */
	public String getContactGender() {
		return contactGender;
	}

	/**
	 * @param contactGender the contactGender to set
	 */
	public void setContactGender(String contactGender) {
		this.contactGender = contactGender;
	}

	/**
	 * @return the contactPosition
	 */
	public String getContactPosition() {
		return contactPosition;
	}

	/**
	 * @param contactPosition the contactPosition to set
	 */
	public void setContactPosition(String contactPosition) {
		this.contactPosition = contactPosition;
	}

	/**
	 * @return the contactTel
	 */
	public String getContactTel() {
		return contactTel;
	}

	/**
	 * @param contactTel the contactTel to set
	 */
	public void setContactTel(String contactTel) {
		this.contactTel = contactTel;
	}

	/**
	 * @return the contactPs
	 */
	public String getContactPs() {
		return contactPs;
	}

	/**
	 * @param contactPs the contactPs to set
	 */
	public void setContactPs(String contactPs) {
		this.contactPs = contactPs;
	}

}
