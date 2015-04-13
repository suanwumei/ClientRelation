package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import domain.Area;
import domain.Authority;
import domain.Client;
import domain.ClientManager;
import domain.Communication;
import domain.Contact;
import domain.Credit;
import domain.Develop;
import domain.HighManager;
import domain.Inventory;
import domain.Level;
import domain.Loss;
import domain.Order;
import domain.OrderItem;
import domain.Product;
import domain.SalesChance;
import domain.SalesManager;
import domain.Satisfaction;
import domain.Service;
import domain.ServiceType;
import domain.TempLoss;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Area area = new Area();  		
		area.setAreaName("LXT hello");
		Authority authority=new Authority();
		authority.setAuthorityName("4");
		Client client=new Client();
		client.setClientAccount("100");
		ClientManager clientManager=new ClientManager();
		clientManager.setAuthority(authority);
		clientManager.setPassword("1");
		clientManager.setClientManagerName("a");
		Communication communication=new Communication();		
		communication.setCommuDetail("真是很重要的感觉");
		Contact contact=new Contact();
		contact.setContactName("刘向田");
		Credit credit=new Credit();
		credit.setCreditName("很好");
		Develop develop=new Develop();
		develop.setDevelopPlan("做好自己的本职工作");
		HighManager highManager=new HighManager();
		highManager.setHighManagerName("梁琪琪");
		Inventory inventory=new Inventory();
		inventory.setInventoryPs("好东西啊");
		Level level=new Level();
		level.setLevelName("高");
		Order order=new Order();
		order.setOrderAddress("福建厦门");
		OrderItem orderItem=new OrderItem();
		orderItem.setProductCount(200);
		Loss loss=new Loss();
		loss.setLossReason("公司破产");
		Product product=new Product();
		product.setProductModel("什么模型");
		SalesChance salesChance=new SalesChance();
		salesChance.setAssignOrNot("否");
		SalesManager salesManager=new SalesManager();
		salesManager.setPassword("123456");
		Service service=new Service();
		service.setAllocateTime("2011-02-02");
		Satisfaction satisfaction=new Satisfaction();
		satisfaction.setSatisfactionName("满意");
		ServiceType serviceType=new ServiceType();
		serviceType.setServiceName("超级服务");
		TempLoss tempLoss=new TempLoss();
		tempLoss.setLossComfirm("是啊");
		Configuration cfg = new Configuration();  
		@SuppressWarnings("deprecation")
		SessionFactory cf = cfg.configure().buildSessionFactory();  
		Session session = cf.openSession();  
		session.beginTransaction();  
		
	//	session.save(area);
	//	session.save(authority);  
		session.save(client);	
	//	session.save(clientManager);	
	//	session.save(communication); 
	//	session.save(contact);
	//	session.save(credit);
	//	session.save(develop);
	//	session.save(highManager);
	//	session.save(inventory);
	//	session.save(loss);
	//	session.save(level);	
	//	session.save(order);
	//	session.save(orderItem);
	//	session.save(product);
	//	session.save(salesChance);
	//	session.save(salesManager);
	//	session.save(service);
	//	session.save(tempLoss);		
	//	session.save(satisfaction);		
	//	session.save(serviceType);
		
	    session.getTransaction().commit();  
		session.close();  
		cf.close();  

	}

}
