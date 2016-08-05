package cn.mldn.ele.serviceImpl;
import java.util.List;
import cn.mldn.ele.beans.CustomersBean;
import cn.mldn.ele.dao.CustomersDao;
import cn.mldn.ele.daoImpl.CustomersDaoImpl;
import cn.mldn.ele.service.CustomersService;
public class CustomersServiceImpl  implements CustomersService{
	private CustomersDao customersDao = new CustomersDaoImpl();
	@Override
	public int add(CustomersBean customersBean) {
		return customersDao.insert(customersBean);
	}

	@Override
	public int remove(CustomersBean customersBean) {
		return customersDao.delete(customersBean);
	}

	@Override
	public int modify(CustomersBean customersBean) {
		return customersDao.update(customersBean);
	}

	@Override
	public CustomersBean queryOne(CustomersBean customersBean) {
		return customersDao.select(customersBean);
	}

	@Override
	public List<CustomersBean> queryAll(CustomersBean customersBean) {
		return customersDao.selectAll(customersBean);
	}

}
