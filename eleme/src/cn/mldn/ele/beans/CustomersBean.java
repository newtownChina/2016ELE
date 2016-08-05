package cn.mldn.ele.beans;
import java.sql.Timestamp;
import java.util.List;
public class CustomersBean{
	private Integer cid ;
	private String password ;
	private String name ;
	private String phone ;
	private String address ;
	private Float welfare ;
	private Float remain ;
	private Integer score ;
	private String email ;
	private String photo ;
	private String citycode ;
	private String city ;
	private Timestamp regdate ;
	private List<OrdersBean> ordersBeans;
	private List<ShopcarBean> shopcarBeans;
	private List<CommentsBean> commentsBeans;
	public List<OrdersBean> getOrders() {
		return ordersBeans;
	}
	public void setOrders(List<OrdersBean> ordersBeans) {
		this.ordersBeans = ordersBeans;
	}
	public List<ShopcarBean> getShopcars() {
		return shopcarBeans;
	}
	public void setShopcars(List<ShopcarBean> shopcarBeans) {
		this.shopcarBeans = shopcarBeans;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public List<CommentsBean> getComments() {
		return commentsBeans;
	}
	public void setComments(List<CommentsBean> commentsBeans) {
		this.commentsBeans = commentsBeans;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCsid(Integer cid) {
		this.cid = cid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Float getWelfare() {
		return welfare;
	}
	public void setWelfare(Float welfare) {
		this.welfare = welfare;
	}
	public Float getRemain() {
		return remain;
	}
	public void setRemain(Float remain) {
		this.remain = remain;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getCitycode() {
		return citycode;
	}
	public void setCitycode(String citycode) {
		this.citycode = citycode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Timestamp getRegdate() {
		return regdate;
	}
	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}
	
}
