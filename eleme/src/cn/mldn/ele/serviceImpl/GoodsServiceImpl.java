package cn.mldn.ele.serviceImpl;
import java.util.List;
import cn.mldn.ele.beans.GoodsBean;
import cn.mldn.ele.dao.GoodsDao;
import cn.mldn.ele.daoImpl.GoodsDaoImpl;
import cn.mldn.ele.service.GoodsService;
public class GoodsServiceImpl  implements GoodsService{
	private GoodsDao goodsDao = new GoodsDaoImpl();
	@Override
	public int add(GoodsBean goodsBean) {
		return goodsDao.insert(goodsBean);
	}

	@Override
	public int remove(GoodsBean goodsBean) {
		return goodsDao.delete(goodsBean);
	}

	@Override
	public int modify(GoodsBean goodsBean) {
		return goodsDao.update(goodsBean);
	}

	@Override
	public GoodsBean queryOne(GoodsBean goodsBean) {
		return goodsDao.select(goodsBean);
	}

	@Override
	public List<GoodsBean> queryAll(GoodsBean goodsBean) {
		return goodsDao.selectAll(goodsBean);
	}

}
