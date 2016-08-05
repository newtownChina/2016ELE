package cn.mldn.ele.beans;
import java.sql.Timestamp;
public class CommentsBean{
	private volatile Integer cid ;
	private Integer gid ;
	private String name ;
	private Timestamp comtime ;
	private Integer rank ;
	private String comment ;
	private CustomersBean customersBean ;
	private GoodsBean goodsBean ;
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public Integer getGid() {
		return gid;
	}
	public void setGid(Integer gid) {
		this.gid = gid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Timestamp getComtime() {
		return comtime;
	}
	
	public void setComtime(Timestamp comtime) {
		this.comtime = comtime;
	}
	public Integer getRank() {
		return rank;
	}
	public void setRank(Integer rank) {
		this.rank = rank;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public CustomersBean getCustomer() {
		return customersBean;
	}
	public void setCustomer(CustomersBean customersBean) {
		this.customersBean = customersBean;
	}
	public GoodsBean getGoods() {
		return goodsBean;
	}
	public void setGoods(GoodsBean goodsBean) {
		this.goodsBean = goodsBean;
	}
}
