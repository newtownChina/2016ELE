package cn.mldn.ele.service;
import java.util.List;
import cn.mldn.ele.beans.OrdersBean;;
public interface OrdersService {
	int  add(OrdersBean ordersBean);
	int  remove(OrdersBean ordersBean);
	int modify(OrdersBean ordersBean);
	OrdersBean queryOne(OrdersBean ordersBean);
	List<OrdersBean> queryAll(OrdersBean ordersBean);
}
