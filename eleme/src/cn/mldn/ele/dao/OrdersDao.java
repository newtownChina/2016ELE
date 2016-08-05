package cn.mldn.ele.dao;
import java.util.List;
import cn.mldn.ele.beans.OrdersBean;;
public interface OrdersDao {
	int insert(OrdersBean ordersBean); 
	int delete(OrdersBean ordersBean);
	int update(OrdersBean ordersBean);
	OrdersBean select(OrdersBean ordersBean);
	List<OrdersBean> selectAll(OrdersBean ordersBean);
}
