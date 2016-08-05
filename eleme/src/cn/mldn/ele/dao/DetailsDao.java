package cn.mldn.ele.dao;
import java.util.List;
import cn.mldn.ele.beans.DetailsBean;;
public interface DetailsDao {
	int insert(DetailsBean detailsBean); 
	int delete(DetailsBean detailsBean);
	int update(DetailsBean detailsBean);
	DetailsBean select(DetailsBean detailsBean);
	List<DetailsBean> selectAll(DetailsBean detailsBean);
}
