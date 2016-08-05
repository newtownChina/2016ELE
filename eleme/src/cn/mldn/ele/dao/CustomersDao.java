package cn.mldn.ele.dao;
import java.util.List;
import cn.mldn.ele.beans.CustomersBean;;
public interface CustomersDao {
	int insert(CustomersBean customersBean); 
	int delete(CustomersBean customersBean);
	int update(CustomersBean customersBean );
	CustomersBean select(CustomersBean customersBean);
	List<CustomersBean> selectAll(CustomersBean customersBean);
}
