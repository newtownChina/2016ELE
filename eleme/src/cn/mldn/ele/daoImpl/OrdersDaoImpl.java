package cn.mldn.ele.daoImpl;
import java.util.List;
import cn.mldn.ele.beans.OrdersBean;
import cn.mldn.ele.dao.OrdersDao;
import cn.mldn.ele.util.DaoUtilFactory;
public class OrdersDaoImpl implements OrdersDao {
	@Override
	public int insert(OrdersBean ordersBean) {
		Integer oid = ordersBean.getOid();
		Integer cid = ordersBean.getCid();
		Integer sid = ordersBean.getSid();
		String name = ordersBean.getName();
		String phone = ordersBean.getPhone();
		Float pay = ordersBean.getPay();
		Float total = ordersBean.getTotal();
		String sendway = ordersBean.getSendway();
		String sendtime = ordersBean.getSendtime();
		Float spendtime = ordersBean.getSpendtime();
		String contact = ordersBean.getContact();
		String contacttel = ordersBean.getContacttel();
		String address = ordersBean.getAddress();
		String invoice = ordersBean.getInvoice();
		String ordertime = ordersBean.getOrdertime();
		String note = ordersBean.getNote();
		StringBuilder sb_before = new StringBuilder("insert into orders(");
		StringBuilder sb_behind = new StringBuilder(")values(");
		if (oid!=null && oid!= 0){
			sb_before.append("oid");
			sb_behind.append(oid);
		}
		if (cid!=null && cid!= 0){
			sb_before.append(",cid");
			sb_behind.append(","+cid);
		}
		if (sid!=null && sid!= 0){
			sb_before.append(",sid");
			sb_behind.append(","+sid);
		}
		if (name!=null && name!= ""){
			sb_before.append(",name");
			sb_behind.append(",'"+name+"'");
		}
		if (phone!=null && phone!= ""){
			sb_before.append(",phone");
			sb_behind.append(",'"+phone+"'");
		}
		if (pay!=null && pay!= 0){
			sb_before.append(",pay");
			sb_behind.append(","+pay);
		}
		if (total!=null && total!= 0){
			sb_before.append(",total");
			sb_behind.append(","+total);
		}
		if (sendway!=null && sendway!= ""){
			sb_before.append(",sendway");
			sb_behind.append(",'"+sendway+"'");
		}
		if (sendtime!=null){
			sb_before.append(",sendtime");
			sb_behind.append(",'"+sendtime+"'");
		}
		if (spendtime!=null && spendtime!= 0){
			sb_before.append(",spendtime");
			sb_behind.append(","+spendtime);
		}
		if (contact!=null && contact!= ""){
			sb_before.append(",contact");
			sb_behind.append(",'"+contact+"'");
		}
		if (contacttel!=null && contacttel!= ""){
			sb_before.append(",contacttel");
			sb_behind.append(",'"+contacttel+"'");
		}
		if (address!=null && address!= ""){
			sb_before.append(",address");
			sb_behind.append(",'"+address+"'");
		}
		if (invoice!=null && invoice!= ""){
			sb_before.append("invoice");
			sb_behind.append(",'"+invoice+"'");
		}
		if (ordertime!=null){
			sb_before.append("ordertime");
			sb_behind.append(",'"+ordertime+"'");
		}
		if (note!=null && note!= ""){
			sb_before.append("note");
			sb_behind.append(",'"+note+"'");
		}
		sb_behind.append(")");
		String sql = sb_before.toString()+sb_behind.toString();
		return DaoUtilFactory.getOrdersDaoUtil().insert(sql);
	}

	@Override
	public int delete(OrdersBean ordersBean) {
		Integer oid = ordersBean.getOid();
		Integer cid = ordersBean.getCid();
		Integer sid = ordersBean.getSid();
		String name = ordersBean.getName();
		String phone = ordersBean.getPhone();
		Float pay = ordersBean.getPay();
		Float total = ordersBean.getTotal();
		String sendway = ordersBean.getSendway();
		String sendtime = ordersBean.getSendtime();
		Float spendtime = ordersBean.getSpendtime();
		String contact = ordersBean.getContact();
		String contacttel = ordersBean.getContacttel();
		String address = ordersBean.getAddress();
		String invoice = ordersBean.getInvoice();
		String ordertime = ordersBean.getOrdertime();
		String note = ordersBean.getNote();
		StringBuilder sb = new StringBuilder("delete from orders where 1=1");
		if (oid!=null && oid!= 0){
			sb.append(" "+"and oid = "+oid+" ");
		}
		if (cid!=null && cid!= 0){
			sb.append(" "+"and cid = "+cid+" ");
		}
		if (sid!=null && sid!= 0){
			sb.append(" "+"and sid = "+sid+" ");
		}
		if (name!=null && name!= ""){
			sb.append(" "+"and name = '"+name+"' ");
		}
		if (phone!=null && phone!= ""){
			sb.append(" "+"and phone = '"+phone+"' ");
		}
		if (pay!=null && pay!= 0){
			sb.append(" "+"and pay = "+pay+" ");
		}
		if (total!=null && total!= 0){
			sb.append(" "+"and total = "+total+" ");
		}
		if (sendway!=null && sendway!= ""){
			sb.append(" "+"and sendway = '"+sendway+"' ");
		}
		if (sendtime!=null){
			sb.append(" "+"and sendtime = '"+sendtime+"' ");
		}
		if (spendtime!=null && spendtime!= 0){
			sb.append(" "+"and spendtime = "+spendtime+" ");
		}
		if (contact!=null && contact!= ""){
			sb.append(" "+"and contact = '"+contact+"' ");
		}
		if (contacttel!=null && contacttel!= ""){
			sb.append(" "+"and contacttel = '"+contacttel+"' ");
		}
		if (address!=null && address!= ""){
			sb.append(" "+"and address = '"+address+"' ");
		}
		if (invoice!=null && invoice!= ""){
			sb.append(" "+"and invoice = '"+invoice+"' ");
		}
		if (ordertime!=null){
			sb.append(" "+"and ordertime = '"+ordertime+"' ");
		}
		if (note!=null && note!= ""){
			sb.append(" "+"and note = '"+note+"' ");
		}
		String sql = sb.toString();
		return DaoUtilFactory.getOrdersDaoUtil().delete(sql);
	}

	@Override
	public int update(OrdersBean ordersBean) {
		Integer oid = ordersBean.getOid();
		Integer cid = ordersBean.getCid();
		Integer sid = ordersBean.getSid();
		String name = ordersBean.getName();
		String phone = ordersBean.getPhone();
		Float pay = ordersBean.getPay();
		Float total = ordersBean.getTotal();
		String sendway = ordersBean.getSendway();
		String sendtime = ordersBean.getSendtime();
		Float spendtime = ordersBean.getSpendtime();
		String contact = ordersBean.getContact();
		String contacttel = ordersBean.getContacttel();
		String address = ordersBean.getAddress();
		String invoice = ordersBean.getInvoice();
		String ordertime = ordersBean.getOrdertime();
		String note = ordersBean.getNote();
		StringBuilder sb_before = new StringBuilder("update orders set ");
		StringBuilder sb_behind = new StringBuilder(" where oid = ");
		if (oid!=null && oid!= 0){
			sb_behind.append(" "+"oid = "+oid+" ");
		}
		if (cid!=null && cid!= 0){
			sb_before.append(" "+"cid = "+cid+" ");
		}
		if (sid!=null && sid!= 0){
			sb_before.append(" "+"sid = "+sid+" ");
		}
		if (name!=null && name!= ""){
			sb_before.append(" "+"name = '"+name+"' ");
		}
		if (phone!=null && phone!= ""){
			sb_before.append(" "+"phone = '"+phone+"' ");
		}
		if (pay!=null && pay!= 0){
			sb_before.append(" "+"pay = "+pay+" ");
		}
		if (total!=null && total!= 0){
			sb_before.append(" "+"total = "+total+" ");
		}
		if (sendway!=null && sendway!= ""){
			sb_before.append(" "+"sendway = '"+sendway+"' ");
		}
		if (sendtime!=null){
			sb_before.append(" "+"sendtime = '"+sendtime+"' ");
		}
		if (spendtime!=null && spendtime!= 0){
			sb_before.append(" "+"spendtime = "+spendtime+" ");
		}
		if (contact!=null && contact!= ""){
			sb_before.append(" "+"contact = '"+contact+"' ");
		}
		if (contacttel!=null && contacttel!= ""){
			sb_before.append(" "+"contacttel = '"+contacttel+"' ");
		}
		if (address!=null && address!= ""){
			sb_before.append(" "+"address = '"+address+"' ");
		}
		if (invoice!=null && invoice!= ""){
			sb_before.append(" "+"invoice = '"+invoice+"' ");
		}
		if (ordertime!=null){
			sb_before.append(" "+"ordertime = '"+ordertime+"' ");
		}
		if (note!=null && note!= ""){
			sb_before.append(" "+"note = '"+note+"' ");
		}
		String sql = sb_before.toString()+sb_behind.toString();
		return DaoUtilFactory.getOrdersDaoUtil().update(sql);
	}

	@Override
	public OrdersBean select(OrdersBean ordersBean) {
		Integer oid = ordersBean.getOid();
		Integer cid = ordersBean.getCid();
		Integer sid = ordersBean.getSid();
		String name = ordersBean.getName();
		String phone = ordersBean.getPhone();
		Float pay = ordersBean.getPay();
		Float total = ordersBean.getTotal();
		String sendway = ordersBean.getSendway();
		String sendtime = ordersBean.getSendtime();
		Float spendtime = ordersBean.getSpendtime();
		String contact = ordersBean.getContact();
		String contacttel = ordersBean.getContacttel();
		String address = ordersBean.getAddress();
		String invoice = ordersBean.getInvoice();
		String ordertime = ordersBean.getOrdertime();
		String note = ordersBean.getNote();
		StringBuilder sb = new StringBuilder("select * from orders where 1=1 ");
		if (oid!=null && oid!= 0){
			sb.append(" "+"and oid = "+oid+" ");
		}
		if (cid!=null && cid!= 0){
			sb.append(" "+"and cid = "+cid+" ");
		}
		if (sid!=null && sid!= 0){
			sb.append(" "+"and sid = "+sid+" ");
		}
		if (name!=null && name!= ""){
			sb.append(" "+"and name = '"+name+"' ");
		}
		if (phone!=null && phone!= ""){
			sb.append(" "+"and phone = '"+phone+"' ");
		}
		if (pay!=null && pay!= 0){
			sb.append(" "+"and pay = "+pay+" ");
		}
		if (total!=null && total!= 0){
			sb.append(" "+"and total = "+total+" ");
		}
		if (sendway!=null && sendway!= ""){
			sb.append(" "+"and sendway = '"+sendway+"' ");
		}
		if (sendtime!=null){
			sb.append(" "+"and sendtime = '"+sendtime+"' ");
		}
		if (spendtime!=null){
			sb.append(" "+"and spendtime = '"+spendtime+"' ");
		}
		if (contact!=null && contact!= ""){
			sb.append(" "+"and contact = '"+contact+"' ");
		}
		if (contacttel!=null && contacttel!= ""){
			sb.append(" "+"and contacttel = '"+contacttel+"' ");
		}
		if (address!=null && address!= ""){
			sb.append(" "+"and address = '"+address+"' ");
		}
		if (invoice!=null && invoice!= ""){
			sb.append(" "+"and invoice = '"+invoice+"' ");
		}
		if (ordertime!=null){
			sb.append(" "+"and ordertime = '"+ordertime+"' ");
		}
		if (note!=null && note!= ""){
			sb.append(" "+"and note = '"+note+"' ");
		}
		String sql = sb.toString();
		List<OrdersBean> ordersBeansList = DaoUtilFactory.getOrdersDaoUtil().select(sql);
		if(ordersBeansList != null && ordersBeansList.size()==1){
			return ordersBeansList.get(0);
		}else{
			return new OrdersBean();//不返回null，如果没有查到，则返回一个空的bean，防止客户端调用方法报空指针。
		}
	}

	@Override
	public List<OrdersBean> selectAll(OrdersBean ordersBean) {
		Integer oid = ordersBean.getOid();
		Integer cid = ordersBean.getCid();
		Integer sid = ordersBean.getSid();
		String name = ordersBean.getName();
		String phone = ordersBean.getPhone();
		Float pay = ordersBean.getPay();
		Float total = ordersBean.getTotal();
		String sendway = ordersBean.getSendway();
		String sendtime = ordersBean.getSendtime();
		Float spendtime = ordersBean.getSpendtime();
		String contact = ordersBean.getContact();
		String contacttel = ordersBean.getContacttel();
		String address = ordersBean.getAddress();
		String invoice = ordersBean.getInvoice();
		String ordertime = ordersBean.getOrdertime();
		String note = ordersBean.getNote();
		StringBuilder sb = new StringBuilder("select * from orders where 1=1 ");
		if (oid!=null && oid!= 0){
			sb.append(" "+"and oid = "+oid+" ");
		}
		if (cid!=null && cid!= 0){
			sb.append(" "+"and cid = "+cid+" ");
		}
		if (sid!=null && sid!= 0){
			sb.append(" "+"and sid = "+sid+" ");
		}
		if (name!=null && name!= ""){
			sb.append(" "+"and name = '"+name+"' ");
		}
		if (phone!=null && phone!= ""){
			sb.append(" "+"and phone = '"+phone+"' ");
		}
		if (pay!=null && pay!= 0){
			sb.append(" "+"and pay = "+pay+" ");
		}
		if (total!=null && total!= 0){
			sb.append(" "+"and total = "+total+" ");
		}
		if (sendway!=null && sendway!= ""){
			sb.append(" "+"and sendway = '"+sendway+"' ");
		}
		if (sendtime!=null){
			sb.append(" "+"and sendtime = '"+sendtime+"' ");
		}
		if (spendtime!=null && spendtime != 0){
			sb.append(" "+"and spendtime = "+spendtime+" ");
		}
		if (contact!=null && contact!= ""){
			sb.append(" "+"and contact = '"+contact+"' ");
		}
		if (contacttel!=null && contacttel!= ""){
			sb.append(" "+"and contacttel = '"+contacttel+"' ");
		}
		if (address!=null && address!= ""){
			sb.append(" "+"and address = '"+address+"' ");
		}
		if (invoice!=null && invoice!= ""){
			sb.append(" "+"and invoice = '"+invoice+"' ");
		}
		if (ordertime!=null){
			sb.append(" "+"and ordertime = '"+ordertime+"' ");
		}
		if (note!=null && note!= ""){
			sb.append(" "+"and note = '"+note+"' ");
		}
		String sql = sb.toString();
		List<OrdersBean> ordersBeansList = DaoUtilFactory.getOrdersDaoUtil().select(sql);
		return ordersBeansList;
	}

}
