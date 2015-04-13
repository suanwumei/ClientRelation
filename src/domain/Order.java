package domain;

/**
 * 客户订单
 * @author admin
 *
 */
public class Order 
{
	/**
	 * 订单Id
	 */
	private int orderId;
	
	/**
	 * 订单时间
	 */
	private String orderTime;
	
	/**
	 * 订单总金额
	 */
	private int orderMoney;
	
	/**
	 * 订单派送地址
	 */
	private String orderAddress;
	
	/**
	 * 订单状态
	 */
	private String orderState;

	/**
	 * 
	 */
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param orderId
	 * @param orderTime
	 * @param orderMoney
	 * @param orderAddress
	 * @param orderState
	 */
	public Order(int orderId, String orderTime, int orderMoney,
			String orderAddress, String orderState) {
		super();
		this.orderId = orderId;
		this.orderTime = orderTime;
		this.orderMoney = orderMoney;
		this.orderAddress = orderAddress;
		this.orderState = orderState;
	}

	/**
	 * @return the orderId
	 */
	public int getOrderId() {
		return orderId;
	}

	/**
	 * @param orderId the orderId to set
	 */
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	/**
	 * @return the orderTime
	 */
	public String getOrderTime() {
		return orderTime;
	}

	/**
	 * @param orderTime the orderTime to set
	 */
	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}

	/**
	 * @return the orderMoney
	 */
	public int getOrderMoney() {
		return orderMoney;
	}

	/**
	 * @param orderMoney the orderMoney to set
	 */
	public void setOrderMoney(int orderMoney) {
		this.orderMoney = orderMoney;
	}

	/**
	 * @return the orderAddress
	 */
	public String getOrderAddress() {
		return orderAddress;
	}

	/**
	 * @param orderAddress the orderAddress to set
	 */
	public void setOrderAddress(String orderAddress) {
		this.orderAddress = orderAddress;
	}

	/**
	 * @return the orderState
	 */
	public String getOrderState() {
		return orderState;
	}

	/**
	 * @param orderState the orderState to set
	 */
	public void setOrderState(String orderState) {
		this.orderState = orderState;
	}
	
}
