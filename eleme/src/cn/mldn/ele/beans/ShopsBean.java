package cn.mldn.ele.beans;
import java.sql.Timestamp;
import java.util.List;
public class ShopsBean{
	private	Integer sid ;
	private String name ;
	private Integer sales ;
	private Integer rank ;
	private Float lowest ;
	private Float transcost ;
	private String logo ;
	private String reserve ;
	private String fullcut ;
	private String firstcut ;
	private String cutspecial ;
	private String payonline ;
	private String invoicespt ;
	private String welfarespt ;
	private String giftspt ;
	private String compensate ;
	private String news ;
	private String label_1 ;
	private String label_2 ;
	private String label_3 ;
	private String adminname ;
	private String cardid ;
	private Timestamp begintime ;
	private Integer count ;
	private String adminbank ;
	private String citycode ;
	private String address ;
	private String adminphone ;
	private String adminaddr ;
	private String introduce ;
	private Timestamp worktime ;
	private String announce ;
	private String classify ;
	private Integer attitude ;
	private String comment ;
	private String sendpartner ;
	private Timestamp settledate ;
	private String status ;
	private Integer avgtime;
	public Integer getAvgtime() {
		return avgtime;
	}
	public void setAvgtime(Integer avgtime) {
		this.avgtime = avgtime;
	}
	private List<GoodsBean> goodsBeans ;
	private List<OrdersBean> ordersBeans ;
	public List<OrdersBean> getOrders() {
		return ordersBeans;
	}
	public void setOrders(List<OrdersBean> ordersBeans) {
		this.ordersBeans = ordersBeans;
	}
	public List<GoodsBean> getGoods() {
		return goodsBeans;
	}
	public void setGoods(List<GoodsBean> goodsBeans) {
		this.goodsBeans = goodsBeans;
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
	public Integer getSales() {
		return sales;
	}
	public void setSales(Integer sales) {
		this.sales = sales;
	}
	public Integer getRank() {
		return rank;
	}
	public void setRank(Integer rank) {
		this.rank = rank;
	}
	public Float getLowest() {
		return lowest;
	}
	public void setLowest(Float lowest) {
		this.lowest = lowest;
	}
	public Float getTranscost() {
		return transcost;
	}
	public void setTranscost(Float transcost) {
		this.transcost = transcost;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getReserve() {
		return reserve;
	}
	public void setReserve(String reserve) {
		this.reserve = reserve;
	}
	public String getFullcut() {
		return fullcut;
	}
	public void setFullcut(String fullcut) {
		this.fullcut = fullcut;
	}
	public String getFirstcut() {
		return firstcut;
	}
	public void setFirstcut(String firstcut) {
		this.firstcut = firstcut;
	}
	public String getCutspecial() {
		return cutspecial;
	}
	public void setCutspecial(String cutspecial) {
		this.cutspecial = cutspecial;
	}
	public String getPayonline() {
		return payonline;
	}
	public void setPayonline(String payonline) {
		this.payonline = payonline;
	}
	public String getInvoicespt() {
		return invoicespt;
	}
	public void setInvoicespt(String invoicespt) {
		this.invoicespt = invoicespt;
	}
	public String getWelfarespt() {
		return welfarespt;
	}
	public void setWelfarespt(String welfarespt) {
		this.welfarespt = welfarespt;
	}
	public String getGiftspt() {
		return giftspt;
	}
	public void setGiftspt(String giftspt) {
		this.giftspt = giftspt;
	}
	public String getCompensate() {
		return compensate;
	}
	public void setCompensate(String compensate) {
		this.compensate = compensate;
	}
	public String getNews() {
		return news;
	}
	public void setNews(String news) {
		this.news = news;
	}
	public String getLabel_1() {
		return label_1;
	}
	public void setLabel_1(String label_1) {
		this.label_1 = label_1;
	}
	public String getLabel_2() {
		return label_2;
	}
	public void setLabel_2(String label_2) {
		this.label_2 = label_2;
	}
	public String getLabel_3() {
		return label_3;
	}
	public void setLabel_3(String label_3) {
		this.label_3 = label_3;
	}
	public String getAdminname() {
		return adminname;
	}
	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}
	public String getCardid() {
		return cardid;
	}
	public void setCardid(String cardid) {
		this.cardid = cardid;
	}
	public Timestamp getBegintime() {
		return begintime;
	}
	public void setBegintime(Timestamp begintime) {
		this.begintime = begintime;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public String getAdminbank() {
		return adminbank;
	}
	public void setAdminbank(String adminbank) {
		this.adminbank = adminbank;
	}
	public String getCitycode() {
		return citycode;
	}
	public void setCitycode(String citycode) {
		this.citycode = citycode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAdminphone() {
		return adminphone;
	}
	public void setAdminphone(String adminphone) {
		this.adminphone = adminphone;
	}
	public String getAdminaddr() {
		return adminaddr;
	}
	public void setAdminaddr(String adminaddr) {
		this.adminaddr = adminaddr;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	public Timestamp getWorktime() {
		return worktime;
	}
	public void setWorktime(Timestamp worktime) {
		this.worktime = worktime;
	}
	public String getAnnounce() {
		return announce;
	}
	public void setAnnounce(String announce) {
		this.announce = announce;
	}
	public String getClassify() {
		return classify;
	}
	public void setClassify(String classify) {
		this.classify = classify;
	}
	public Integer getAttitude() {
		return attitude;
	}
	public void setAttitude(Integer attitude) {
		this.attitude = attitude;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getSendpartner() {
		return sendpartner;
	}
	public void setSendpartner(String sendpartner) {
		this.sendpartner = sendpartner;
	}
	public Timestamp getSettledate() {
		return settledate;
	}
	public void setSettledate(Timestamp settledate) {
		this.settledate = settledate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
