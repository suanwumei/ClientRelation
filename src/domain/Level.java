package domain;

/**
 * 客户等级
 * @author admin
 *
 */
public class Level 
{
	/**
	 * 等级Id
	 */
	private int levelId;
	
	/**
	 * 等级类型
	 */
	private String levelName;

	/**
	 * 
	 */
	public Level() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param levelId
	 * @param levelName
	 */
	public Level(int levelId, String levelName) {
		super();
		this.levelId = levelId;
		this.levelName = levelName;
	}

	/**
	 * @return the levelId
	 */
	public int getLevelId() {
		return levelId;
	}

	/**
	 * @param levelId the levelId to set
	 */
	public void setLevelId(int levelId) {
		this.levelId = levelId;
	}

	/**
	 * @return the levelName
	 */
	public String getLevelName() {
		return levelName;
	}

	/**
	 * @param levelName the levelName to set
	 */
	public void setLevelName(String levelName) {
		this.levelName = levelName;
	}
	

}
