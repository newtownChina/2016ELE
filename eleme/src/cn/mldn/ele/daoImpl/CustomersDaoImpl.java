package cn.mldn.ele.daoImpl;
import java.sql.Timestamp;
import java.util.List;
import cn.mldn.ele.beans.CustomersBean;
import cn.mldn.ele.dao.CustomersDao;
import cn.mldn.ele.util.DaoUtilFactory;
public class CustomersDaoImpl implements CustomersDao{
	/**
	 * @param commentsBean 传入一个commentsBean实体
	 * 持久化到数据库
	 */
	@Override
	public int insert(CustomersBean customersBean) {
//		Integer cid = customersBean.getCid();
		String password = customersBean.getPassword();
		String address = customersBean.getAddress();
		String city = customersBean.getCity();
		String cityCode = customersBean.getCitycode();
		String email = customersBean.getEmail();
		String name = customersBean.getName();
		String phone = customersBean.getPhone();
		String photo = customersBean.getPhoto();
		Timestamp regdate = customersBean.getRegdate();
		Float remain = customersBean.getRemain();
		Integer score = customersBean.getScore();
		Float welfare = customersBean.getWelfare();
		StringBuilder sb_before = new StringBuilder("insert into customers(");
		StringBuilder sb_behind = new StringBuilder(")values(");
//		if (cid!=null && cid != 0){
//			sb_before.append("cid");	
//			sb_behind.append(cid);
//		}
		if (password!=null && password != ""){
			sb_before.append("password");
			sb_behind.append("'"+password+"'");
		}
		if (address!=null && address != ""){			
			sb_before.append(",address");
			sb_behind.append(",'"+address+"'");
		}
		if (city !=null && city !=""){
			sb_before.append(",city");
			sb_behind.append(",'"+city+"'");
		}
		if (cityCode!=null && cityCode != ""){
			sb_before.append(",cityCode");
			sb_behind.append(",'"+cityCode+"'");
		}
		if (email!=null && email != ""){
			sb_before.append(",email");
			sb_behind.append(",'"+email+"'");
		}
		if (name!=null && name != ""){
			sb_before.append(",name");
			sb_behind.append(",'"+name+"'");
		}
		if (phone!=null && phone != ""){
			sb_before.append(",phone");
			sb_behind.append(",'"+phone+"'");
		}
		if (photo!=null && photo != ""){
			sb_before.append(",photo");
			sb_behind.append(",'"+photo+"'");
		}
		if (regdate!=null){
			sb_before.append(",regdate");
			sb_behind.append(",'"+regdate+"'");
		}
		if (remain!=null && remain != 0){
			sb_before.append(",remain");
			sb_behind.append(",'"+remain);
		}
		if (score!=null && score != 0){
			sb_before.append(",score");
			sb_behind.append(","+score);
		}
		if (welfare!=null && welfare !=0){
			sb_before.append(",welfare");
			sb_behind.append(",'"+welfare+"'");
		}
		sb_behind.append(")");
		String sql = sb_before.toString()+sb_behind.toString();
		return DaoUtilFactory.getCustomersDaoUtil().insert(sql);
	}
	/**
	 * @param commentsBean 传入一个commentsBean实体
	 * 从数据库中删除指定的记录
	 */
	@Override
	public int delete(CustomersBean customersBean) {
		Integer cid = customersBean.getCid();
		String password = customersBean.getPassword();
		String name = customersBean.getName();
		String phone = customersBean.getPhone();
		String address = customersBean.getAddress();
		Float welfare = customersBean.getWelfare();
		Float remain = customersBean.getRemain();
		Integer score = customersBean.getScore();
		String email = customersBean.getEmail();
		String photo = customersBean.getPhoto();
		String citycode = customersBean.getCitycode();
		String city = customersBean.getCity();
		Timestamp regdate = customersBean.getRegdate();
		StringBuilder sb = new StringBuilder("delete from customers where 1=1");
		if (cid!=null && cid!= 0){
			sb.append(" "+"and cid = "+cid+" ");
		}
		if (password!=null && password!= ""){
			sb.append(" "+"and password = '"+password+"' ");
		}
		if (name!=null && name!= ""){
			sb.append(" "+"and name = '"+name+"' ");
		}
		if (phone!=null && phone!= ""){
			sb.append(" "+"and phone = '"+phone+"' ");
		}
		if (address!=null && address!= ""){
			sb.append(" "+"and address = '"+address+"' ");
		}
		if (welfare!=null && welfare!= 0){
			sb.append(" "+"and welfare = '"+welfare+"' ");
		}
		if (remain!=null && remain!= 0){
			sb.append(" "+"and remain = '"+remain+"' ");
		}
		if (score!=null && score!= 0){
			sb.append(" "+"and score = "+score+" ");
		}
		if (email!=null && email!= ""){
			sb.append(" "+"and email = '"+email+"' ");
		}
		if (photo!=null && photo!= ""){
			sb.append(" "+"and photo = '"+photo+"' ");
		}
		if (citycode!=null && citycode!= ""){
			sb.append(" "+"and citycode = '"+citycode+"' ");
		}
		if (city!=null && city!= ""){
			sb.append(" "+"and city = '"+city+"' ");
		}
		if (regdate!=null){
			sb.append(" "+"and regdate = '"+regdate+"' ");
		}
		String sql = sb.toString();
		return DaoUtilFactory.getCustomersDaoUtil().delete(sql);
		
	}
	
	/**
	 * @param commentsBean 传入一个commentsBean实体
	 * 更新指定的记录
	 */
	@Override
	public int update(CustomersBean customersBean) {
		Integer cid = customersBean.getCid();
		String password = customersBean.getPassword();
		String name = customersBean.getName();
		String phone = customersBean.getPhone();
		String address = customersBean.getAddress();
		Float welfare = customersBean.getWelfare();
		Float remain = customersBean.getRemain();
		Integer score = customersBean.getScore();
		String email = customersBean.getEmail();
		String photo = customersBean.getPhoto();
		String citycode = customersBean.getCitycode();
		String city = customersBean.getCity();
		Timestamp regdate = customersBean.getRegdate();
		StringBuilder sb_before = new StringBuilder("update customers set ");
		StringBuilder sb_behind = new StringBuilder(" where cid = ");
		if (cid!=null && cid!= 0){
			sb_behind.append(" "+"cid = "+cid+" ");
		}
		if (password!=null && password!= ""){
			sb_before.append(","+"password = '"+password+"' ");
		}
		if (name!=null && name!= ""){
			sb_before.append(","+"name = '"+name+"' ");
		}
		if (phone!=null && phone!= ""){
			sb_before.append(","+"phone = '"+phone+"' ");
		}
		if (address!=null && address!= ""){
			sb_before.append(","+"address = '"+address+"' ");
		}
		if (welfare!=null && welfare!= 0){
			sb_before.append(","+"welfare = "+welfare+" ");
		}
		if (remain!=null && remain!= 0){
			sb_before.append(","+"remain = "+remain+" ");
		}
		if (score!=null && score!= 0){
			sb_before.append(","+"score = "+score+" ");
		}
		if (email!=null && email!= ""){
			sb_before.append(","+"email = '"+email+"' ");
		}
		if (photo!=null && photo!= ""){
			sb_before.append(","+"photo = '"+photo+"' ");
		}
		if (citycode!=null && citycode!= ""){
			sb_before.append(","+"citycode = '"+citycode+"' ");
		}
		if (city!=null && city!= ""){
			sb_before.append(","+"city = '"+city+"' ");
		}
		if (regdate!=null){
			sb_before.append(","+"regdate = '"+regdate+"' ");
		}
		String sql = sb_before.toString()+sb_behind.toString();
		return DaoUtilFactory.getCustomersDaoUtil().update(sql);
	}
	
	/**
	 * @param commentsBean 传入一个commentsBean实体
	 * 从数据库中查询出满足条件的单个记录，封装成javabean实体并返回
	 */
	@Override
	public CustomersBean select(CustomersBean customersBean) {
		Integer cid = customersBean.getCid();
		String password = customersBean.getPassword();
		String name = customersBean.getName();
		String phone = customersBean.getPhone();
		String address = customersBean.getAddress();
		Float welfare = customersBean.getWelfare();
		Float remain = customersBean.getRemain();
		Integer score = customersBean.getScore();
		String email = customersBean.getEmail();
		String photo = customersBean.getPhoto();
		String citycode = customersBean.getCitycode();
		String city = customersBean.getCity();
		Timestamp regdate = customersBean.getRegdate();
		StringBuilder sb = new StringBuilder("select * from customers where 1=1 ");
		if (cid!=null && cid!= 0){
			sb.append(" "+"and cid = "+cid+" ");
		}
		if (password!=null && password!= ""){
			sb.append(" "+"and password = '"+password+"' ");
		}
		if (name!=null && name!= ""){
			sb.append(" "+"and name = '"+name+"' ");
		}
		if (phone!=null && phone!= ""){
			sb.append(" "+"and phone = '"+phone+"' ");
		}
		if (address!=null && address!= ""){
			sb.append(" "+"and address = '"+address+"' ");
		}
		if (welfare!=null && welfare!= 0){
			sb.append(" "+"and welfare = "+welfare+" ");
		}
		if (remain!=null && remain!= 0){
			sb.append(" "+"and remain = "+remain+" ");
		}
		if (score!=null && score!= 0){
			sb.append(" "+"and score = "+score+" ");
		}
		if (email!=null && email!= ""){
			sb.append(" "+"and email = '"+email+"' ");
		}
		if (photo!=null && photo!= ""){
			sb.append(" "+"and photo = '"+photo+"' ");
		}
		if (citycode!=null && citycode!= ""){
			sb.append(" "+"and citycode = '"+citycode+"' ");
		}
		if (city!=null && city!= ""){
			sb.append(" "+"and city = '"+city+"' ");
		}
		if (regdate!=null){
			sb.append(" "+"and regdate = '"+regdate+"' ");
		}
		String sql = sb.toString();
		List<CustomersBean> customersBeanList = DaoUtilFactory.getCustomersDaoUtil().select(sql);
		if(customersBeanList != null && customersBeanList.size()==1){
			return customersBeanList.get(0);
		}else{
			return new CustomersBean();//不返回null，如果没有查到，则返回一个空的bean，防止客户端调用方法报空指针。
		}
	}
	
	/**
	 * @param commentsBean 传入一个commentsBean实体
	 * 从数据库中查询出所有满足条件的记录，并封装成List并返回
	 */
	@Override
	public List<CustomersBean> selectAll(CustomersBean customersBean) {
		Integer cid = customersBean.getCid();
		String password = customersBean.getPassword();
		String name = customersBean.getName();
		String phone = customersBean.getPhone();
		String address = customersBean.getAddress();
		Float welfare = customersBean.getWelfare();
		Float remain = customersBean.getRemain();
		Integer score = customersBean.getScore();
		String email = customersBean.getEmail();
		String photo = customersBean.getPhoto();
		String citycode = customersBean.getCitycode();
		String city = customersBean.getCity();
		Timestamp regdate = customersBean.getRegdate();
		StringBuilder sb = new StringBuilder("select * from customers where 1=1 ");
		if (cid!=null && cid!= 0){
			sb.append(" "+"and cid = "+cid+" ");
		}
		if (password!=null && password!= ""){
			sb.append(" "+"and password = '"+password+"' ");
		}
		if (name!=null && name!= ""){
			sb.append(" "+"and name = '"+name+"' ");
		}
		if (phone!=null && phone!= ""){
			sb.append(" "+"and phone = '"+phone+"' ");
		}
		if (address!=null && address!= ""){
			sb.append(" "+"and address = '"+address+"' ");
		}
		if (welfare!=null && welfare!= 0){
			sb.append(" "+"and welfare = "+welfare+" ");
		}
		if (remain!=null && remain!= 0){
			sb.append(" "+"and remain = "+remain+" ");
		}
		if (score!=null && score!= 0){
			sb.append(" "+"and score = "+score+" ");
		}
		if (email!=null && email!= ""){
			sb.append(" "+"and email = '"+email+"' ");
		}
		if (photo!=null && photo!= ""){
			sb.append(" "+"and photo = '"+photo+"' ");
		}
		if (citycode!=null && citycode!= ""){
			sb.append(" "+"and citycode = '"+citycode+"' ");
		}
		if (city!=null && city!= ""){
			sb.append(" "+"and city = '"+city+"' ");
		}
		if (regdate!=null){
			sb.append(" "+"and regdate = '"+regdate+"' ");
		}
		String sql = sb.toString();
		List<CustomersBean> customersBeanList = DaoUtilFactory.getCustomersDaoUtil().select(sql);
		return customersBeanList;
	}
}
