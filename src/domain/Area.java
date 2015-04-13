package domain;

/**
 * 地区
 * @author admin
 *
 */
public class Area 
{
	/**
	 * 地区Id
	 */
	private int areaId;

	/**
	 * 地区名称
	 */
	private String areaName;

	/**
	 * 
	 */
	public Area() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param areaId
	 * @param areaName
	 */
	public Area(int areaId, String areaName) {
		super();
		this.areaId = areaId;
		this.areaName = areaName;
	}

	/**
	 * @return the areaId
	 */
	public int getAreaId() {
		return areaId;
	}

	/**
	 * @param areaId the areaId to set
	 */
	public void setAreaId(int areaId) {
		this.areaId = areaId;
	}

	/**
	 * @return the areaName
	 */
	public String getAreaName() {
		return areaName;
	}

	/**
	 * @param areaName the areaName to set
	 */
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	
}
