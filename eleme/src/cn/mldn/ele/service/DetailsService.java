package cn.mldn.ele.service;
import java.util.List;
import cn.mldn.ele.beans.DetailsBean;;
public interface DetailsService {
	int  add(DetailsBean detailsBean);
	int  remove(DetailsBean detailsBean);
	int modify(DetailsBean detailsBean);
	DetailsBean queryOne(DetailsBean detailsBean);
	List<DetailsBean> queryAll(DetailsBean detailsBean);
}
