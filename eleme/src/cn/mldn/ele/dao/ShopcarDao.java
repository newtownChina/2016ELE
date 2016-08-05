package cn.mldn.ele.dao;
import java.util.List;
import cn.mldn.ele.beans.ShopcarBean;;
public interface ShopcarDao {
	int insert(ShopcarBean shopcarBean); 
	int delete(ShopcarBean shopcarBean);
	int update(ShopcarBean shopcarBean);
	ShopcarBean select(ShopcarBean shopcarBean);
	List<ShopcarBean> selectAll(ShopcarBean shopcarBean);
}
