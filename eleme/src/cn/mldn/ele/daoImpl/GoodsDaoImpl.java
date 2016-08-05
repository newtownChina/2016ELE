package cn.mldn.ele.daoImpl;
import java.util.List;
import cn.mldn.ele.beans.GoodsBean;
import cn.mldn.ele.dao.GoodsDao;
import cn.mldn.ele.util.DaoUtilFactory;
public class GoodsDaoImpl implements GoodsDao {
	@Override
	public int insert(GoodsBean goodsBean) {
		Integer gid = goodsBean.getGid();
		Integer sid = goodsBean.getSid();
		String name = goodsBean.getName();
		Float price = goodsBean.getPrice();
		String comment = goodsBean.getComment();
		Integer rank = goodsBean.getRank();
		Integer amount = goodsBean.getAmount();
		String picture = goodsBean.getPicture();
		String classify = goodsBean.getClassify();
		StringBuilder sb_before = new StringBuilder("insert into goods(");
		StringBuilder sb_behind = new StringBuilder(")values(");
		if (gid!=null && gid!= 0){
			sb_before.append("gid");
			sb_behind.append(gid);
		}
		if (sid!=null && sid!= 0){
			sb_before.append(",sid");
			sb_behind.append(","+sid);
		}
		if (name!=null && name!= ""){
			sb_before.append(",name");
			sb_behind.append(",'"+name+"'");
		}
		if (price!=null && price!= 0){
			sb_before.append(",price");
			sb_behind.append(","+price);
		}
		if (comment!=null && comment!= ""){
			sb_before.append(",comment");
			sb_behind.append(",'"+comment+"'");
		}
		if (rank!=null && rank!= 0){
			sb_before.append(",rank");
			sb_behind.append(","+rank);
		}
		if (amount!=null && amount!= 0){
			sb_before.append(",amount");
			sb_behind.append(","+amount);
		}
		if (picture!=null && picture!= ""){
			sb_before.append(",picture");
			sb_behind.append(",'"+picture+"'");
		}
		if (classify!=null && classify!= ""){
			sb_before.append(",classify");
			sb_behind.append(",'"+classify+"'");
		}
		sb_behind.append(")");
		String sql = sb_before.toString()+sb_behind.toString();
		return DaoUtilFactory.getGoodsDaoUtil().insert(sql);
	}

	@Override
	public int delete(GoodsBean goodsBean) {
		Integer gid = goodsBean.getGid();
		Integer sid = goodsBean.getSid();
		String name = goodsBean.getName();
		Float price = goodsBean.getPrice();
		String comment = goodsBean.getComment();
		Integer rank = goodsBean.getRank();
		Integer amount = goodsBean.getAmount();
		String picture = goodsBean.getPicture();
		String classify = goodsBean.getClassify();
		StringBuilder sb = new StringBuilder("delete from goods where 1=1");
		if (gid!=null && gid!= 0){
			sb.append(" "+"and gid = "+gid+" ");
		}
		if (sid!=null && sid!= 0){
			sb.append(" "+"and sid = "+sid+" ");
		}
		if (name!=null && name!= ""){
			sb.append(" "+"and name = '"+name+"' ");
		}
		if (price!=null && price!= 0){
			sb.append(" "+"and price = "+price+" ");
		}
		if (comment!=null && comment!= ""){
			sb.append(" "+"and comment = '"+comment+"' ");
		}
		if (rank!=null && rank!= 0){
			sb.append(" "+"and rank = "+rank+" ");
		}
		if (amount!=null && amount!= 0){
			sb.append(" "+"and amount = "+amount+" ");
		}
		if (picture!=null && picture!= ""){
			sb.append(" "+"and picture = '"+picture+"' ");
		}
		if (classify!=null && classify!= ""){
			sb.append(" "+"and classify = '"+classify+"' ");
		}
		String sql = sb.toString();
		return DaoUtilFactory.getGoodsDaoUtil().delete(sql);
	}

	@Override
	public int update(GoodsBean goodsBean) {
		Integer gid = goodsBean.getGid();
		Integer sid = goodsBean.getSid();
		String name = goodsBean.getName();
		Float price = goodsBean.getPrice();
		String comment = goodsBean.getComment();
		Integer rank = goodsBean.getRank();
		Integer amount = goodsBean.getAmount();
		String picture = goodsBean.getPicture();
		String classify = goodsBean.getClassify();
		StringBuilder sb_before = new StringBuilder("update goods set ");
		StringBuilder sb_behind = new StringBuilder(" where gid = ");
		if (gid!=null && gid!= 0){
			sb_behind.append(" "+"gid = "+gid+" ");
		}
		if (sid!=null && sid!= 0){
			sb_before.append(","+"sid = "+sid+" ");
		}
		if (name!=null && name!= ""){
			sb_before.append(","+"name = '"+name+"' ");
		}
		if (price!=null && price!= 0){
			sb_before.append(","+"price = "+price+" ");
		}
		if (comment!=null && comment!= ""){
			sb_before.append(","+"comment = '"+comment+"' ");
		}
		if (rank!=null && rank!= 0){
			sb_before.append(","+"rank = "+rank+" ");
		}
		if (amount!=null && amount!= 0){
			sb_before.append(","+"amount = "+amount+" ");
		}
		if (picture!=null && picture!= ""){
			sb_before.append(","+"picture = '"+picture+"' ");
		}
		if (classify!=null && classify!= ""){
			sb_before.append(","+"classify = '"+classify+"' ");
		}
		String sql = sb_before.toString()+sb_behind.toString();
		return DaoUtilFactory.getGoodsDaoUtil().update(sql);
	}

	@Override
	public GoodsBean select(GoodsBean goodsBean) {
		Integer gid = goodsBean.getGid();
		Integer sid = goodsBean.getSid();
		String name = goodsBean.getName();
		Float price = goodsBean.getPrice();
		String comment = goodsBean.getComment();
		Integer rank = goodsBean.getRank();
		Integer amount = goodsBean.getAmount();
		String picture = goodsBean.getPicture();
		String classify = goodsBean.getClassify();
		StringBuilder sb = new StringBuilder("select * from goods where 1=1 ");
		if (gid!=null && gid!= 0){
		 	sb.append(" "+"and gid = "+gid+" ");
		}
		if (sid!=null && sid!= 0){
		 	sb.append(" "+"and sid = "+sid+" ");
		}
		if (name!=null && name!= ""){
			sb.append(" "+"and name = '"+name+"' ");
		}
		if (price!=null && price!= 0){
			sb.append(" "+"and price = "+price+" ");
		}
		if (comment!=null && comment!= ""){
			sb.append(" "+"and comment = '"+comment+"' ");
		}
		if (rank!=null && rank!= 0){
			sb.append(" "+"and rank = "+rank+" ");
		}
		if (amount!=null && amount!= 0){
			sb.append(" "+"and amount = "+amount+" ");
		}
		if (picture!=null && picture!= ""){
			sb.append(" "+"and picture = '"+picture+"' ");
		}
		if (classify!=null && classify!= ""){
			sb.append(" "+"and classify = '"+classify+"' ");
		}
		String sql = sb.toString();
		List<GoodsBean> goodsBeansList = DaoUtilFactory.getGoodsDaoUtil().select(sql);
		if(goodsBeansList != null && goodsBeansList.size()==1){
			return goodsBeansList.get(0);
		}else{
			return new GoodsBean();//不返回null，如果没有查到，则返回一个空的bean，防止客户端调用方法报空指针。
		}
	}

	@Override
	public List<GoodsBean> selectAll(GoodsBean goodsBean) {
		Integer gid = goodsBean.getGid();
		Integer sid = goodsBean.getSid();
		String name = goodsBean.getName();
		Float price = goodsBean.getPrice();
		String comment = goodsBean.getComment();
		Integer rank = goodsBean.getRank();
		Integer amount = goodsBean.getAmount();
		String picture = goodsBean.getPicture();
		String classify = goodsBean.getClassify();
		StringBuilder sb = new StringBuilder("select * from goods where 1=1 ");
		if (gid!=null && gid!= 0){
		 	sb.append(" "+"and gid = "+gid+" ");
		}
		if (sid!=null && sid!= 0){
		 	sb.append(" "+"and sid = "+sid+" ");
		}
		if (name!=null && name!= ""){
			sb.append(" "+"and name = '"+name+"' ");
		}
		if (price!=null && price!= 0){
			sb.append(" "+"and price = "+price+" ");
		}
		if (comment!=null && comment!= ""){
			sb.append(" "+"and comment = '"+comment+"' ");
		}
		if (rank!=null && rank!= 0){
			sb.append(" "+"and rank = "+rank+" ");
		}
		if (amount!=null && amount!= 0){
			sb.append(" "+"and amount = "+amount+" ");
		}
		if (picture!=null && picture!= ""){
			sb.append(" "+"and picture = '"+picture+"' ");
		}
		if (classify!=null && classify!= ""){
			sb.append(" "+"and classify = '"+classify+"' ");
		}
		String sql = sb.toString();
		List<GoodsBean> goodsBeansList = DaoUtilFactory.getGoodsDaoUtil().select(sql);
		return goodsBeansList;
	}
}
