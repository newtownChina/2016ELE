package cn.mldn.ele.dao;
import java.util.List;
import cn.mldn.ele.beans.GoodsBean;;
public interface GoodsDao {
	int insert(GoodsBean goodsBean); 
	int delete(GoodsBean goodsBean);
	int update(GoodsBean goodsBean);
	GoodsBean select(GoodsBean goodsBean);
	List<GoodsBean> selectAll(GoodsBean goodsBean);
}
