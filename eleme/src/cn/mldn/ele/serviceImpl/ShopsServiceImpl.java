package cn.mldn.ele.serviceImpl;
import java.util.List;
import cn.mldn.ele.beans.ShopsBean;
import cn.mldn.ele.dao.ShopsDao;
import cn.mldn.ele.daoImpl.ShopsDaoImpl;
import cn.mldn.ele.service.ShopsService;
public class ShopsServiceImpl  implements ShopsService{
	private ShopsDao shopsDao = new ShopsDaoImpl();
	@Override
	public int add(ShopsBean shopsBean) {
		return shopsDao.insert(shopsBean);
	}

	@Override
	public int remove(ShopsBean shopsBean) {
		return shopsDao.delete(shopsBean);
	}

	@Override
	public int modify(ShopsBean shopsBean) {
		return shopsDao.update(shopsBean);
	}

	@Override
	public ShopsBean queryOne(ShopsBean shopsBean) {
		return shopsDao.select(shopsBean);
	}

	@Override
	public List<ShopsBean> queryAll(ShopsBean shopsBean) {
		return shopsDao.selectAll(shopsBean);
	}
}
