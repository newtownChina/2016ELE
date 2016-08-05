package cn.mldn.ele.serviceImpl;
import java.util.List;
import cn.mldn.ele.beans.DetailsBean;
import cn.mldn.ele.dao.DetailsDao;
import cn.mldn.ele.daoImpl.DetailsDaoImpl;
import cn.mldn.ele.service.DetailsService;
public class DetailsServiceImpl  implements DetailsService{
	private DetailsDao detailsDao = new DetailsDaoImpl();
	@Override
	public int add(DetailsBean detailsBean) {
		return detailsDao.insert(detailsBean);
	}

	@Override
	public int remove(DetailsBean detailsBean) {
		return detailsDao.delete(detailsBean);
	}

	@Override
	public int modify(DetailsBean detailsBean) {
		return detailsDao.update(detailsBean);
	}

	@Override
	public DetailsBean queryOne(DetailsBean detailsBean) {
		return detailsDao.select(detailsBean);
	}

	@Override
	public List<DetailsBean> queryAll(DetailsBean detailsBean) {
		return detailsDao.selectAll(detailsBean);
	}

}
