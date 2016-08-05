package cn.mldn.ele.serviceImpl;
import java.util.List;
import cn.mldn.ele.beans.ShopcarBean;
import cn.mldn.ele.dao.ShopcarDao;
import cn.mldn.ele.daoImpl.ShopcarDaoImpl;
import cn.mldn.ele.service.ShopcarService;
public class ShopcarServiceImpl implements ShopcarService {
	private ShopcarDao shopcarDao = new ShopcarDaoImpl();
	@Override
	public int add(ShopcarBean shopcarBean) {
		return shopcarDao.insert(shopcarBean);
	}

	@Override
	public int remove(ShopcarBean shopcarBean) {
		return shopcarDao.delete(shopcarBean);
	}

	@Override
	public int modify(ShopcarBean shopcarBean) {
		return shopcarDao.update(shopcarBean);
	}

	@Override
	public ShopcarBean queryOne(ShopcarBean shopcarBean) {
		return shopcarDao.select(shopcarBean);
	}

	@Override
	public List<ShopcarBean> queryAll(ShopcarBean shopcarBean) {
		return shopcarDao.selectAll(shopcarBean);
	}

}
