package domain;

/**
 * 产品
 * @author admin
 *
 */
public class Product 
{
	/**
	 * 产品Id
	 */
	private int productId;

	/**
	 * 产品名称
	 */
	private String productName;
	
	/**
	 * 型号
	 */
	private String productModel;
	
	/**
	 * 等级
	 */
	private String productGradeBatch;
	
	/**
	 * 单位
	 */
	private String productUnit;
	
	/**
	 * 单价
	 */
	private int productUnitPrice;
	
	/**
	 * 备注
	 */
	private String productPs;

	/**
	 * 
	 */
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param productId
	 * @param productName
	 * @param productModel
	 * @param productGradeBatch
	 * @param productUnit
	 * @param productUnitPrice
	 * @param productPs
	 */
	public Product(int productId, String productName, String productModel,
			String productGradeBatch, String productUnit, int productUnitPrice,
			String productPs) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productModel = productModel;
		this.productGradeBatch = productGradeBatch;
		this.productUnit = productUnit;
		this.productUnitPrice = productUnitPrice;
		this.productPs = productPs;
	}

	/**
	 * @return the productId
	 */
	public int getProductId() {
		return productId;
	}

	/**
	 * @param productId the productId to set
	 */
	public void setProductId(int productId) {
		this.productId = productId;
	}

	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * @return the productModel
	 */
	public String getProductModel() {
		return productModel;
	}

	/**
	 * @param productModel the productModel to set
	 */
	public void setProductModel(String productModel) {
		this.productModel = productModel;
	}

	/**
	 * @return the productGradeBatch
	 */
	public String getProductGradeBatch() {
		return productGradeBatch;
	}

	/**
	 * @param productGradeBatch the productGradeBatch to set
	 */
	public void setProductGradeBatch(String productGradeBatch) {
		this.productGradeBatch = productGradeBatch;
	}

	/**
	 * @return the productUnit
	 */
	public String getProductUnit() {
		return productUnit;
	}

	/**
	 * @param productUnit the productUnit to set
	 */
	public void setProductUnit(String productUnit) {
		this.productUnit = productUnit;
	}

	/**
	 * @return the productUnitPrice
	 */
	public int getProductUnitPrice() {
		return productUnitPrice;
	}

	/**
	 * @param productUnitPrice the productUnitPrice to set
	 */
	public void setProductUnitPrice(int productUnitPrice) {
		this.productUnitPrice = productUnitPrice;
	}

	/**
	 * @return the productPs
	 */
	public String getProductPs() {
		return productPs;
	}

	/**
	 * @param productPs the productPs to set
	 */
	public void setProductPs(String productPs) {
		this.productPs = productPs;
	}
	
}
