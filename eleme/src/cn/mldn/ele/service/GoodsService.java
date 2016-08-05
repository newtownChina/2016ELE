package cn.mldn.ele.service;
import java.util.List;
import cn.mldn.ele.beans.GoodsBean;;
public interface GoodsService {
	int  add(GoodsBean goodsBean);
	int  remove(GoodsBean goodsBean);
	int modify(GoodsBean goodsBean);
	GoodsBean queryOne(GoodsBean goodsBean);
	List<GoodsBean> queryAll(GoodsBean goodsBean);
}
