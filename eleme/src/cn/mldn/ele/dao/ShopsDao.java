package cn.mldn.ele.dao;
import java.util.List;
import cn.mldn.ele.beans.ShopsBean;;
public interface ShopsDao {
	int insert(ShopsBean shopsBean); 
	int delete(ShopsBean shopsBean);
	int update(ShopsBean shopsBean);
	ShopsBean select(ShopsBean shopsBean);
	List<ShopsBean> selectAll(ShopsBean shopsBean);
}
