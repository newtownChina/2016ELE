package cn.mldn.ele.serviceImpl;
import java.util.List;
import cn.mldn.ele.beans.OrdersBean;
import cn.mldn.ele.dao.OrdersDao;
import cn.mldn.ele.daoImpl.OrdersDaoImpl;
import cn.mldn.ele.service.OrdersService;
public class OrdersServiceImpl  implements  OrdersService{
	private OrdersDao ordersDao = new OrdersDaoImpl();
	@Override
	public int add(OrdersBean ordersBean) {
		return ordersDao.insert(ordersBean);
	}

	@Override
	public int remove(OrdersBean ordersBean) {
		return ordersDao.delete(ordersBean);
	}

	@Override
	public int modify(OrdersBean ordersBean) {
		return ordersDao.update(ordersBean);
	}

	@Override
	public OrdersBean queryOne(OrdersBean ordersBean) {
		return ordersDao.select(ordersBean);
	}

	@Override
	public List<OrdersBean> queryAll(OrdersBean ordersBean) {
		return ordersDao.selectAll(ordersBean);
	}

}
