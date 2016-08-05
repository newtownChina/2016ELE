package cn.mldn.ele.service;
import java.util.List;
import cn.mldn.ele.beans.CustomersBean;
public interface CustomersService {
	int  add(CustomersBean customersBean);
	int  remove(CustomersBean customersBean);
	int modify(CustomersBean customersBean);
	CustomersBean queryOne(CustomersBean customersBean);
	List<CustomersBean> queryAll(CustomersBean customersBean);
}
