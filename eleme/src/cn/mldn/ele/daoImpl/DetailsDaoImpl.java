package cn.mldn.ele.daoImpl;
import java.util.List;
import cn.mldn.ele.beans.DetailsBean;
import cn.mldn.ele.dao.DetailsDao;
import cn.mldn.ele.util.DaoUtilFactory;
public class DetailsDaoImpl implements DetailsDao {
	@Override
	public int insert(DetailsBean detailsBean) {
		Integer oid = detailsBean.getOid();
		Integer gid = detailsBean.getGid();
		String title = detailsBean.getTitle();
		Float price = detailsBean.getPrice();
		Integer amount = detailsBean.getAmount();
		StringBuilder sb_before = new StringBuilder("insert into details(");
		StringBuilder sb_behind = new StringBuilder(")values(");
		if (oid!=null && oid!= 0){
			sb_before.append("oid");
			sb_behind.append(oid);
		}
		if (gid!=null && gid!= 0){
			sb_before.append(",gid");
			sb_behind.append(","+gid);
		}
		if (title!=null && title!= ""){
			sb_before.append(",title");
			sb_behind.append(",'"+title+"'");
		}
		if (price!=null && price!= 0){
			sb_before.append(",price");
			sb_behind.append(","+price);
		}
		if (amount!=null && amount!= 0){
			sb_before.append(",amount");
			sb_behind.append(","+amount);
		}
		sb_behind.append(")");
		String sql = sb_before.toString()+sb_behind.toString();
		return DaoUtilFactory.getDetailsDaoUtil().insert(sql);
	}

	@Override
	public int delete(DetailsBean detailsBean) {
		Integer oid = detailsBean.getOid();
		Integer gid = detailsBean.getGid();
		String title = detailsBean.getTitle();
		Float price = detailsBean.getPrice();
		Integer amount = detailsBean.getAmount();
		StringBuilder sb = new StringBuilder("delete from details where 1=1");
		if (oid!=null && oid!= 0){
			sb.append(" "+"and oid = "+oid+" ");
		}
		if (gid!=null && gid!= 0){
			sb.append(" "+"and gid = "+gid+" ");
		}
		if (title!=null && title!= ""){
			sb.append(" "+"and title = '"+title+"' ");
		}
		if (price!=null && price!= 0){
			sb.append(" "+"and price = "+price+" ");
		}
		if (amount!=null && amount!= 0){
			sb.append(" "+"and amount = "+amount+" ");
		}
		String sql = sb.toString();
		return DaoUtilFactory.getCommentsDaoUtil().delete(sql);
	}

	@Override
	public int update(DetailsBean detailsBean) {
		Integer oid = detailsBean.getOid();
		Integer gid = detailsBean.getGid();
		String title = detailsBean.getTitle();
		Float price = detailsBean.getPrice();
		Integer amount = detailsBean.getAmount();
		StringBuilder sb_before = new StringBuilder("update details set ");
		StringBuilder sb_behind = new StringBuilder(" where odid = ");
		if (oid!=null && oid!= 0){
			sb_before.append("oid = "+oid+" ");
		}
		if (gid!=null && gid!= 0){
			sb_before.append(","+"gid = "+gid+" ");
		}
		if (title!=null && title!= ""){
			sb_before.append(","+"title = '"+title+"' ");
		}
		if (price!=null && price!= 0){
			sb_before.append(","+"price = "+price+" ");
		}
		if (amount!=null && amount!= 0){
			sb_before.append(","+"amount = "+amount+" ");
		}
		String sql = sb_before.toString()+sb_behind.toString();
		return DaoUtilFactory.getDetailsDaoUtil().update(sql);
	}

	@Override
	public DetailsBean select(DetailsBean detailsBean) {
		Integer oid = detailsBean.getOid();
		Integer gid = detailsBean.getGid();
		String title = detailsBean.getTitle();
		Float price = detailsBean.getPrice();
		Integer amount = detailsBean.getAmount();
		StringBuilder sb = new StringBuilder("select * from details where 1=1 ");
		if (oid!=null && oid!= 0){
			sb.append(" "+"and oid = "+oid+" ");
		}
		if (gid!=null && gid!= 0){
			sb.append(" "+"and gid = "+gid+" ");
		}
		if (title!=null && title!= ""){
			sb.append(" "+"and title = '"+title+"' ");
		}
		if (price!=null && price!= 0){
			sb.append(" "+"and price = "+price+" ");
		}
		if (amount!=null && amount!= 0){
			sb.append(" "+"and amount = "+amount+" ");
		}
		String sql = sb.toString();
		List<DetailsBean> detailsBeansList = DaoUtilFactory.getDetailsDaoUtil().select(sql);
		if(detailsBeansList != null && detailsBeansList.size()==1){
			return detailsBeansList.get(0);
		}else{
			return new DetailsBean();//不返回null，如果没有查到，则返回一个空的bean，防止客户端调用方法报空指针。
		}
	}

	@Override
	public List<DetailsBean> selectAll(DetailsBean detailsBean) {
		Integer oid = detailsBean.getOid();
		Integer gid = detailsBean.getGid();
		String title = detailsBean.getTitle();
		Float price = detailsBean.getPrice();
		Integer amount = detailsBean.getAmount();
		StringBuilder sb = new StringBuilder("select * from details where 1=1 ");
		if (oid!=null && oid!= 0){
			sb.append(" "+"and oid = "+oid+" ");
		}
		if (gid!=null && gid!= 0){
			sb.append(" "+"and gid = "+gid+" ");
		}
		if (title!=null && title!= ""){
			sb.append(" "+"and title = '"+title+"' ");
		}
		if (price!=null && price!= 0){
			sb.append(" "+"and price = "+price+" ");
		}
		if (amount!=null && amount!= 0){
			sb.append(" "+"and amount = "+amount+" ");
		}
		String sql = sb.toString();
		List<DetailsBean> detailsBeansList = DaoUtilFactory.getDetailsDaoUtil().select(sql);
		return detailsBeansList;
	}
}
