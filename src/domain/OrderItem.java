package domain;

/**
 * 订单明细项目
 * @author admin
 *
 */
public class OrderItem 
{
	/**
	 * 订单明细记录Id
	 */
	private int orderItemId;
	
	/**
	 * 订单明细中产品
	 */
	private Product product;
	
	/**
	 * 订单明细中产品数量
	 */
	private int productCount;
	
	/**
	 * 产品总金额
	 */
	private int itemTotalMoney;

	/**
	 * 
	 */
	public OrderItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param orderItemId
	 * @param product
	 * @param productCount
	 * @param itemTotalMoney
	 */
	public OrderItem(int orderItemId, Product product, int productCount,
			int itemTotalMoney) {
		super();
		this.orderItemId = orderItemId;
		this.product = product;
		this.productCount = productCount;
		this.itemTotalMoney = itemTotalMoney;
	}

	/**
	 * @return the orderItemId
	 */
	public int getOrderItemId() {
		return orderItemId;
	}

	/**
	 * @param orderItemId the orderItemId to set
	 */
	public void setOrderItemId(int orderItemId) {
		this.orderItemId = orderItemId;
	}

	/**
	 * @return the product
	 */
	public Product getProduct() {
		return product;
	}

	/**
	 * @param product the product to set
	 */
	public void setProduct(Product product) {
		this.product = product;
	}

	/**
	 * @return the productCount
	 */
	public int getProductCount() {
		return productCount;
	}

	/**
	 * @param productCount the productCount to set
	 */
	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}

	/**
	 * @return the itemTotalMoney
	 */
	public int getItemTotalMoney() {
		return itemTotalMoney;
	}

	/**
	 * @param itemTotalMoney the itemTotalMoney to set
	 */
	public void setItemTotalMoney(int itemTotalMoney) {
		this.itemTotalMoney = itemTotalMoney;
	}

}
