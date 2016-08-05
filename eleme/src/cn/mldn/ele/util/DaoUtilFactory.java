package cn.mldn.ele.util;

import cn.mldn.ele.beans.CommentsBean;
import cn.mldn.ele.beans.CustomersBean;
import cn.mldn.ele.beans.DetailsBean;
import cn.mldn.ele.beans.GoodsBean;
import cn.mldn.ele.beans.OrdersBean;
import cn.mldn.ele.beans.ShopcarBean;
import cn.mldn.ele.beans.ShopsBean;

/**
 * @author NXY
 * @version 1.0
 * 获取工具类的工厂，返回每一个DaoUtil的单例
 */
public class DaoUtilFactory {
	private static GenericDaoUtil<CommentsBean> commentsDaoUtil;
	private static GenericDaoUtil<CustomersBean> customersDaoUtil;
	private static GenericDaoUtil<DetailsBean> detailsDaoUtil;
	private static GenericDaoUtil<GoodsBean> goodsDaoUtil;
	private static GenericDaoUtil<OrdersBean> ordersDaoUtil;
	private static GenericDaoUtil<ShopcarBean> shopcarDaoUtil;
	private static GenericDaoUtil<ShopsBean> shopDaosUtil;
	public static GenericDaoUtil<CommentsBean> getCommentsDaoUtil(){
		//获取CommentsVo的全路径类名，传参，用于反射生成javaben实例，以调用setter方法自动赋值。
		if (commentsDaoUtil == null) {
			commentsDaoUtil = new GenericDaoUtil<CommentsBean>(CommentsBean.class.getName());			
		}
		return commentsDaoUtil;
	}
	public static GenericDaoUtil<CustomersBean> getCustomersDaoUtil() {
		if (customersDaoUtil == null) {
			customersDaoUtil = new GenericDaoUtil<CustomersBean>(CustomersBean.class.getName());			
		}
		return customersDaoUtil;
	}
	public static GenericDaoUtil<DetailsBean> getDetailsDaoUtil() {
		if (detailsDaoUtil == null) {
			detailsDaoUtil = new GenericDaoUtil<DetailsBean>(DetailsBean.class.getName());			
		}
		return detailsDaoUtil;
	}
	public static GenericDaoUtil<GoodsBean> getGoodsDaoUtil() {
		if (goodsDaoUtil == null) {
			goodsDaoUtil = new GenericDaoUtil<GoodsBean>(GoodsBean.class.getName());			
		}
		return goodsDaoUtil;
	}
	public static GenericDaoUtil<OrdersBean> getOrdersDaoUtil() {
		if (ordersDaoUtil == null) {
			ordersDaoUtil = new GenericDaoUtil<OrdersBean>(OrdersBean.class.getName());			
		}
		return ordersDaoUtil;
	}
	public static GenericDaoUtil<ShopcarBean> getShopcarDaoUtil() {
		if (shopcarDaoUtil == null) {
			shopcarDaoUtil = new GenericDaoUtil<ShopcarBean>(ShopcarBean.class.getName());			
		}
		return shopcarDaoUtil;
	}
	public static GenericDaoUtil<ShopsBean> getShopsDaosUtil() {
		if (shopDaosUtil == null) {
			shopDaosUtil = new GenericDaoUtil<ShopsBean>(ShopsBean.class.getName());			
		}
		return shopDaosUtil;
	}
}
