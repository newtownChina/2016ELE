package cn.mldn.ele.service;
import java.util.List;
import cn.mldn.ele.beans.ShopcarBean;;;
public interface ShopcarService {
	int  add(ShopcarBean shopcarBean);
	int  remove(ShopcarBean shopcarBean);
	int modify(ShopcarBean shopcarBean);
	ShopcarBean queryOne(ShopcarBean shopcarBean);
	List<ShopcarBean> queryAll(ShopcarBean shopcarBean);
}
