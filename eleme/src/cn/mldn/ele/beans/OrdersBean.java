package cn.mldn.ele.beans;
import java.util.List;
public class OrdersBean{
	private Integer oid ;
	private Integer cid ;
	private Integer sid ;
	private	String name ;
	private	String phone ; 
	private	Float pay ;
	private	Float total ;
	private String sendway ;	
	private String sendtime ;
	private Float spendtime ;
	private String contact ;
	private String contacttel ;
	private String address ;
	private String invoice ;
	private String ordertime ;
	private String note ;
	private List<DetailsBean> detailsBean ;
	public List<DetailsBean> getDetails() {
		return detailsBean;
	}
	public void setDetails(List<DetailsBean> detailsBean) {
		this.detailsBean = detailsBean;
	}
	public Integer getOid() {
		return oid;
	}
	public void setOid(Integer oid) {
		this.oid = oid;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Float getPay() {
		return pay;
	}
	public void setPay(Float pay) {
		this.pay = pay;
	}
	public Float getTotal() {
		return total;
	}
	public void setTotal(Float total) {
		this.total = total;
	}
	public String getSendway() {
		return sendway;
	}
	public void setSendway(String sendway) {
		this.sendway = sendway;
	}
	public String getSendtime() {
		return sendtime;
	}
	public void setSendtime(String sendtime) {
		this.sendtime = sendtime;
	}
	public Float getSpendtime() {
		return spendtime;
	}
	public void setSpendtime(Float spendtime) {
		this.spendtime = spendtime;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getContacttel() {
		return contacttel;
	}
	public void setContacttel(String contacttel) {
		this.contacttel = contacttel;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getInvoice() {
		return invoice;
	}
	public void setInvoice(String invoice) {
		this.invoice = invoice;
	}
	public String getOrdertime() {
		return ordertime;
	}
	public void setOrdertime(String ordertime) {
		this.ordertime = ordertime;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
}
