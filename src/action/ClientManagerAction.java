package action;

import java.sql.SQLException;

import org.apache.struts2.ServletActionContext;
import org.springframework.transaction.annotation.Transactional;

import com.opensymphony.xwork2.ActionContext;

import dao.ClientManagerDao;
import dao.SalesManagerDao;
import domain.ClientManager;
import domain.SalesManager;

/**
 * 关于客户经理的操作以及响应
 * @author admin
 *
 */
public class ClientManagerAction
{
	private static final String SUCCESS="success";
	private static final String FAILED="failed";
	
	private ClientManagerDao clientManagerDao;
	private SalesManagerDao salesManagerDao;	

	/**
	 * @return the clientManagerDao
	 */
	public ClientManagerDao getClientManagerDao() {
		return clientManagerDao;
	}

	/**
	 * @param clientManagerDao the clientManagerDao to set
	 */
	public void setClientManagerDao(ClientManagerDao clientManagerDao) {
		this.clientManagerDao = clientManagerDao;
	}

	/**
	 * @return the salesManagerDao
	 */
	public SalesManagerDao getSalesManagerDao() {
		return salesManagerDao;
	}

	/**
	 * @param salesManagerDao the salesManagerDao to set
	 */
	public void setSalesManagerDao(SalesManagerDao salesManagerDao) {
		this.salesManagerDao = salesManagerDao;
	}

}
