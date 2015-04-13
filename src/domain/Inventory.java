package domain;

/**
 * 库存
 * @author admin
 *
 */
public class Inventory 
{
	/**
	 * 库存Id
	 */
	private int inventoryId;
	
	/**
	 * 库存产品
	 */
	private Product inventoryProduct;
	
	/**
	 * 库存名称
	 */
	private String inventoryStore;
	
	/**
	 * 具体货位
	 */
	private String inventoryGoodsAllocation;
	
	/**
	 * 库存数量
	 */
	private String inventoryNumber;
	
	/**
	 * 备注
	 */
	private String inventoryPs;

	/**
	 * 
	 */
	public Inventory() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param inventoryId
	 * @param inventoryProduct
	 * @param inventoryStore
	 * @param inventoryGoodsAllocation
	 * @param inventoryNumber
	 * @param inventoryPs
	 */
	public Inventory(int inventoryId, Product inventoryProduct,
			String inventoryStore, String inventoryGoodsAllocation,
			String inventoryNumber, String inventoryPs) {
		super();
		this.inventoryId = inventoryId;
		this.inventoryProduct = inventoryProduct;
		this.inventoryStore = inventoryStore;
		this.inventoryGoodsAllocation = inventoryGoodsAllocation;
		this.inventoryNumber = inventoryNumber;
		this.inventoryPs = inventoryPs;
	}

	/**
	 * @return the inventoryId
	 */
	public int getInventoryId() {
		return inventoryId;
	}

	/**
	 * @param inventoryId the inventoryId to set
	 */
	public void setInventoryId(int inventoryId) {
		this.inventoryId = inventoryId;
	}

	/**
	 * @return the inventoryProduct
	 */
	public Product getInventoryProduct() {
		return inventoryProduct;
	}

	/**
	 * @param inventoryProduct the inventoryProduct to set
	 */
	public void setInventoryProduct(Product inventoryProduct) {
		this.inventoryProduct = inventoryProduct;
	}

	/**
	 * @return the inventoryStore
	 */
	public String getInventoryStore() {
		return inventoryStore;
	}

	/**
	 * @param inventoryStore the inventoryStore to set
	 */
	public void setInventoryStore(String inventoryStore) {
		this.inventoryStore = inventoryStore;
	}

	/**
	 * @return the inventoryGoodsAllocation
	 */
	public String getInventoryGoodsAllocation() {
		return inventoryGoodsAllocation;
	}

	/**
	 * @param inventoryGoodsAllocation the inventoryGoodsAllocation to set
	 */
	public void setInventoryGoodsAllocation(String inventoryGoodsAllocation) {
		this.inventoryGoodsAllocation = inventoryGoodsAllocation;
	}

	/**
	 * @return the inventoryNumber
	 */
	public String getInventoryNumber() {
		return inventoryNumber;
	}

	/**
	 * @param inventoryNumber the inventoryNumber to set
	 */
	public void setInventoryNumber(String inventoryNumber) {
		this.inventoryNumber = inventoryNumber;
	}

	/**
	 * @return the inventoryPs
	 */
	public String getInventoryPs() {
		return inventoryPs;
	}

	/**
	 * @param inventoryPs the inventoryPs to set
	 */
	public void setInventoryPs(String inventoryPs) {
		this.inventoryPs = inventoryPs;
	}
	

}
