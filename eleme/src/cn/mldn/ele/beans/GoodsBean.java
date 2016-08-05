package cn.mldn.ele.beans;
import java.util.List;
public class GoodsBean{
	private Integer gid ;
	private Integer sid ;
	private String name ;
	private Float price ;
	private String comment ;
	private Integer rank ;
	private Integer amount ;
	private String picture ;
	private String classify ;
	private List<DetailsBean> detailsBean ;
	private List<ShopcarBean> shopcarBean ;
	private List<CommentsBean> commentsBean ;
	public List<DetailsBean> getDetails() {
		return detailsBean;
	}
	public void setDetails(List<DetailsBean> detailsBean) {
		this.detailsBean = detailsBean;
	}
	public List<ShopcarBean> getShopcar() {
		return shopcarBean;
	}
	public void setShopcar(List<ShopcarBean> shopcarBean) {
		this.shopcarBean = shopcarBean;
	}
	public List<CommentsBean> getComments() {
		return commentsBean;
	}
	public void setComments(List<CommentsBean> commentsBean) {
		this.commentsBean = commentsBean;
	}
	public Integer getGid() {
		return gid;
	}
	public void setGid(Integer gid) {
		this.gid = gid;
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Integer getRank() {
		return rank;
	}
	public void setRank(Integer rank) {
		this.rank = rank;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getClassify() {
		return classify;
	}
	public void setClassify(String classify) {
		this.classify = classify;
	}
}
