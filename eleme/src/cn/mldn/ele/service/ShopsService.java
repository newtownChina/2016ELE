package cn.mldn.ele.service;
import java.util.List;
import cn.mldn.ele.beans.ShopsBean;;
public interface ShopsService {
	int  add(ShopsBean shopsBean);
	int  remove(ShopsBean shopsBean);
	int modify(ShopsBean shopsBean);
	ShopsBean queryOne(ShopsBean shopsBean);
	List<ShopsBean> queryAll(ShopsBean shopsBean);
}	
