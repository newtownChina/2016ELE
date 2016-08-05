package cn.mldn.ele.daoImpl;
import java.util.List;
import cn.mldn.ele.beans.ShopcarBean;
import cn.mldn.ele.dao.ShopcarDao;
import cn.mldn.ele.util.DaoUtilFactory;
public class ShopcarDaoImpl implements ShopcarDao {

	@Override
	public int insert(ShopcarBean shopcarBean) {
		Integer cid = shopcarBean.getCid();
		Integer gid = shopcarBean.getGid();
		Integer amount = shopcarBean.getAmount();
		StringBuilder sb_before = new StringBuilder("insert into shopcar(");
		StringBuilder sb_behind = new StringBuilder(")values(");
		if (cid!=null && cid!= 0){
			sb_before.append("cid");
			sb_behind.append(cid);
		}
		if (gid!=null && gid!= 0){
			sb_before.append(",gid");
			sb_behind.append(","+gid);
		}
		if (amount!=null && amount!= 0){
			sb_before.append(",amount");
			sb_behind.append(","+amount);
		}
		sb_behind.append(")");
		String sql = sb_before.toString()+sb_behind.toString();
		return DaoUtilFactory.getShopcarDaoUtil().insert(sql);
	}

	@Override
	public int delete(ShopcarBean shopcarBean) {
		Integer cid = shopcarBean.getCid();
		Integer gid = shopcarBean.getGid();
		Integer amount = shopcarBean.getAmount();
		StringBuilder sb = new StringBuilder("delete from shopcar where 1=1");
		if (cid!=null && cid!= 0){
			sb.append(" "+"and cid = "+cid+" ");
		}
		if (gid!=null && gid!= 0){
			sb.append(" "+"and gid = "+gid+" ");
		}
		if (amount!=null && amount!= 0){
			sb.append(" "+"and amount = "+amount+" ");
		}
		String sql = sb.toString();
		return DaoUtilFactory.getShopcarDaoUtil().delete(sql);
	}

	@Override
	public int update(ShopcarBean shopcarBean) {
		Integer cid = shopcarBean.getCid();
		Integer gid = shopcarBean.getGid();
		Integer amount = shopcarBean.getAmount();
		StringBuilder sb_before = new StringBuilder("update shopcar set ");
		StringBuilder sb_behind = new StringBuilder(" where cid = ");
		if (cid!=null && cid!= 0){
			sb_behind.append(" "+"cid = "+cid+" ");
		}
		if (gid!=null && gid!= 0){
			sb_before.append(" "+"gid = "+gid+" ");
		}
		if (amount!=null && amount!= 0){
			sb_before.append(","+"amount = "+amount+" ");
		}
		String sql = sb_before.toString()+sb_behind.toString();
		return DaoUtilFactory.getShopcarDaoUtil().update(sql);
	}

	@Override
	public ShopcarBean select(ShopcarBean shopcarBean) {
		Integer cid = shopcarBean.getCid();
		Integer gid = shopcarBean.getGid();
		Integer amount = shopcarBean.getAmount();
		StringBuilder sb = new StringBuilder("select * from shopcar where 1=1 ");
		if (cid!=null && cid!= 0){
			sb.append(" "+"and cid = "+cid+" ");
		}
		if (gid!=null && gid!= 0){
			sb.append(" "+"and gid = "+gid+" ");
		}
		if (amount!=null && amount!= 0){
			sb.append(" "+"and amount = "+amount+" ");
		}
		String sql = sb.toString();
		List<ShopcarBean> shopcarBeansList = DaoUtilFactory.getShopcarDaoUtil().select(sql);
		if(shopcarBeansList != null && shopcarBeansList.size()==1){
			return shopcarBeansList.get(0);
		}else{
			return new ShopcarBean();//不返回null，如果没有查到，则返回一个空的bean，防止客户端调用方法报空指针。
		}
	}

	@Override
	public List<ShopcarBean> selectAll(ShopcarBean shopcarBean) {
		Integer cid = shopcarBean.getCid();
		Integer gid = shopcarBean.getGid();
		Integer amount = shopcarBean.getAmount();
		StringBuilder sb = new StringBuilder("select * from shopcar where 1=1 ");
		if (cid!=null && cid!= 0){
			sb.append(" "+"and cid = "+cid+" ");
		}
		if (gid!=null && gid!= 0){
			sb.append(" "+"and gid = "+gid+" ");
		}
		if (amount!=null && amount!= 0){
			sb.append(" "+"and amount = "+amount+" ");
		}
		String sql = sb.toString();
		List<ShopcarBean> shopcarBeansList = DaoUtilFactory.getShopcarDaoUtil().select(sql);
		return shopcarBeansList;
	}
}
