package cn.mldn.ele.daoImpl;
import java.sql.Timestamp;
import java.util.List;
import cn.mldn.ele.beans.ShopsBean;
import cn.mldn.ele.dao.ShopsDao;
import cn.mldn.ele.util.DaoUtilFactory;
public class ShopsDaoImpl implements ShopsDao {

	@Override
	public int insert(ShopsBean shopsBean) {
		Integer sid = shopsBean.getSid();
		String name = shopsBean.getName();
		Integer sales = shopsBean.getSales();
		Integer rank = shopsBean.getRank();
		Float lowest = shopsBean.getLowest();
		Float transcost = shopsBean.getTranscost();
		String logo = shopsBean.getLogo();
		String reserve = shopsBean.getReserve();
		String fullcut = shopsBean.getFullcut();
		String firstcut = shopsBean.getFirstcut();
		String cutspecial = shopsBean.getCutspecial();
		String payonline = shopsBean.getPayonline();
		String invoicespt = shopsBean.getInvoicespt();
		String welfarespt = shopsBean.getWelfarespt();
		String giftspt = shopsBean.getGiftspt();
		String compensate = shopsBean.getCompensate();
		String news = shopsBean.getNews();
		String label_1 = shopsBean.getLabel_1();
		String label_2 = shopsBean.getLabel_2();
		String label_3 = shopsBean.getLabel_3();
		String adminname = shopsBean.getAdminname();
		String cardid = shopsBean.getCardid();
		Timestamp begintime = shopsBean.getBegintime();
		Integer count = shopsBean.getCount();
		String adminbank = shopsBean.getAdminbank();
		String citycode = shopsBean.getCitycode();
		String address = shopsBean.getAddress();
		String adminphone = shopsBean.getAdminphone();
		String adminaddr = shopsBean.getAdminaddr();
		String introduce = shopsBean.getIntroduce();
		Timestamp worktime = shopsBean.getWorktime();
		String announce = shopsBean.getAnnounce();
		String classify = shopsBean.getClassify();
		Integer attitude = shopsBean.getAttitude();
		String comment = shopsBean.getComment();
		String sendpartner = shopsBean.getSendpartner();
		Timestamp settledate = shopsBean.getSettledate();
		String status = shopsBean.getStatus();
		StringBuilder sb_before = new StringBuilder("insert into shops(");
		StringBuilder sb_behind = new StringBuilder(")values(");
		if (sid!=null && sid!= 0){
			sb_before.append("sid");
			sb_behind.append(sid);
		}
		if (name!=null && name!= ""){
			sb_before.append(",name");
			sb_behind.append(",'"+name+"'");
		}
		if (sales!=null && sales!= 0){
			sb_before.append(",sales");
			sb_behind.append(","+sales);
		}
		if (rank!=null && rank!= 0){
			sb_before.append(",rank");
			sb_behind.append(","+rank);
		}
		if (lowest!=null && lowest!= 0){
			sb_before.append(",lowest");
			sb_behind.append(","+lowest);
		}
		if (transcost!=null && transcost!= 0){
			sb_before.append(",transcost");
			sb_behind.append(","+transcost);
		}
		if (logo!=null && logo!= ""){
			sb_before.append(",logo");
			sb_behind.append(",'"+logo+"'");
		}
		if (reserve!=null && reserve!= ""){
			sb_before.append(",reserve");
			sb_behind.append(",'"+reserve+"'");
		}
		if (fullcut!=null && fullcut!= ""){
			sb_before.append(",fullcut");
			sb_behind.append(",'"+fullcut+"'");
		}
		if (firstcut!=null && firstcut!= ""){
			sb_before.append(",firstcut");
			sb_behind.append(",'"+firstcut+"'");
		}
		if (cutspecial!=null && cutspecial!= ""){
			sb_before.append(",cutspecial");
			sb_behind.append(",'"+cutspecial+"'");
		}
		if (payonline!=null && payonline!= ""){
			sb_before.append(",payonline");
			sb_behind.append(",'"+payonline+"'");
		}
		if (invoicespt!=null && invoicespt!= ""){
			sb_before.append(",invoicespt");
			sb_behind.append(",'"+invoicespt+"'");
		}
		if (welfarespt!=null && welfarespt!= ""){
			sb_before.append(",welfarespt");
			sb_behind.append(",'"+welfarespt+"'");
		}
		if (giftspt!=null && giftspt!= ""){
			sb_before.append(",giftspt");
			sb_behind.append(",'"+giftspt+"'");
		}
		if (compensate!=null && compensate!= ""){
			sb_before.append(",compensate");
			sb_behind.append(",'"+compensate+"'");
		}
		if (news!=null && news!= ""){
			sb_before.append(",news");
			sb_behind.append(",'"+news+"'");
		}
		if (label_1!=null && label_1!= ""){
			sb_before.append(",label_1");
			sb_behind.append(",'"+label_1+"'");
		}
		if (label_2!=null && label_2!= ""){
			sb_before.append(",label_2");
			sb_behind.append(",'"+label_2+"'");
		}
		if (label_3!=null && label_3!= ""){
			sb_before.append(",label_3");
			sb_behind.append(",'"+label_3+"'");
		}
		if (adminname!=null && adminname!= ""){
			sb_before.append(",adminname");
			sb_behind.append(",'"+adminname+"'");
		}
		if (cardid!=null && cardid!= ""){
		 	sb_before.append(",cardid");
		 	sb_behind.append(",'"+cardid+"'");
		}
		if (begintime!=null){
			sb_before.append(",begintime");
			sb_behind.append(",'"+begintime+"'");
		}
		if (count!=null && count!= 0){
			sb_before.append(",count");
			sb_behind.append(","+count);
		}
		if (adminbank!=null && adminbank!= ""){
			sb_before.append(",adminbank");
			sb_behind.append(",'"+adminbank+"'");
		}
		if (citycode!=null && citycode!= ""){
			sb_before.append(",citycode");
			sb_behind.append(",'"+citycode+"'");
		}
		if (address!=null && address!= ""){
			sb_before.append(",address");
			sb_behind.append(",'"+address+"'");
		}
		if (adminphone!=null && adminphone!= ""){
			sb_before.append(",adminphone");
			sb_behind.append(",'"+adminphone+"'");
		}
		if (adminaddr!=null && adminaddr!= ""){
			sb_before.append(",adminaddr");
			sb_behind.append(",'"+adminaddr+"'");
		}
		if (introduce!=null && introduce!= ""){
			sb_before.append(",introduce");
			sb_behind.append(",'"+introduce+"'");
		}
		if (worktime!=null){
			sb_before.append(",worktime");
		 	sb_behind.append(",'"+worktime+"'");
		}
		if (announce!=null && announce!= ""){
		 	sb_before.append(",announce");
		 	sb_behind.append(",'"+announce+"'");
		}
		if (classify!=null && classify!= ""){
			sb_before.append(",classify");
			sb_behind.append(",'"+classify+"'");
		}
		if (attitude!=null && attitude!= 0){
			sb_before.append(",attitude");
			sb_behind.append(",'"+attitude+"'");
		}
		if (comment!=null && comment!= ""){
		 	sb_before.append(",comment");
		 	sb_behind.append(",'"+comment+"'");
		}
		if (sendpartner!=null && sendpartner!= ""){
			sb_before.append(",sendpartner");
			sb_behind.append(",'"+sendpartner+"'");
		}
		if (settledate!=null){
			sb_before.append(",settledate");
			sb_behind.append(",'"+settledate+"'");
		}
		if (status!=null && status!= ""){
			sb_before.append(",status");
			sb_behind.append(",'"+status+"'");
		}	
		sb_behind.append(")");
		String sql = sb_before.toString()+sb_behind.toString();
		return DaoUtilFactory.getShopsDaosUtil().insert(sql);
	}

	@Override
	public int delete(ShopsBean shopsBean) {
		Integer sid = shopsBean.getSid();
		String name = shopsBean.getName();
		Integer sales = shopsBean.getSales();
		Integer rank = shopsBean.getRank();
		Float lowest = shopsBean.getLowest();
		Float transcost = shopsBean.getTranscost();
		String logo = shopsBean.getLogo();
		String reserve = shopsBean.getReserve();
		String fullcut = shopsBean.getFullcut();
		String firstcut = shopsBean.getFirstcut();
		String cutspecial = shopsBean.getCutspecial();
		String payonline = shopsBean.getPayonline();
		String invoicespt = shopsBean.getInvoicespt();
		String welfarespt = shopsBean.getWelfarespt();
		String giftspt = shopsBean.getGiftspt();
		String compensate = shopsBean.getCompensate();
		String news = shopsBean.getNews();
		String label_1 = shopsBean.getLabel_1();
		String label_2 = shopsBean.getLabel_2();
		String label_3 = shopsBean.getLabel_3();
		String adminname = shopsBean.getAdminname();
		String cardid = shopsBean.getCardid();
		Timestamp begintime = shopsBean.getBegintime();
		Integer count = shopsBean.getCount();
		String adminbank = shopsBean.getAdminbank();
		String citycode = shopsBean.getCitycode();
		String address = shopsBean.getAddress();
		String adminphone = shopsBean.getAdminphone();
		String adminaddr = shopsBean.getAdminaddr();
		String introduce = shopsBean.getIntroduce();
		Timestamp worktime = shopsBean.getWorktime();
		String announce = shopsBean.getAnnounce();
		String classify = shopsBean.getClassify();
		Integer attitude = shopsBean.getAttitude();
		String comment = shopsBean.getComment();
		String sendpartner = shopsBean.getSendpartner();
		Timestamp settledate = shopsBean.getSettledate();
		String status = shopsBean.getStatus();
		StringBuilder sb = new StringBuilder("delete from shops where 1=1");
		if (sid!=null && sid!= 0){
			sb.append(" "+"and sid = "+sid+" ");
		}
		if (name!=null && name!= ""){
			sb.append(" "+"and name = '"+name+"' ");
		}
		if (sales!=null && sales!= 0){
			sb.append(" "+"and sales = "+sales+" ");
		}
		if (rank!=null && rank!= 0){
			sb.append(" "+"and rank = "+rank+" ");
		}
		if (lowest!=null && lowest!= 0){
			sb.append(" "+"and lowest = "+lowest+" ");
		}
		if (transcost!=null && transcost!= 0){
			sb.append(" "+"and transcost = "+transcost+" ");
		}
		if (logo!=null && logo!= ""){
			sb.append(" "+"and logo = '"+logo+"' ");
		}
		if (reserve!=null && reserve!= ""){
			sb.append(" "+"and reserve = '"+reserve+"' ");
		}
		if (fullcut!=null && fullcut!= ""){
			sb.append(" "+"and fullcut = '"+fullcut+"' ");
		}
		if (firstcut!=null && firstcut!= ""){
			sb.append(" "+"and firstcut = '"+firstcut+"' ");
		}
		if (cutspecial!=null && cutspecial!= ""){
			sb.append(" "+"and cutspecial = '"+cutspecial+"' ");
		}
		if (payonline!=null && payonline!= ""){
		  	sb.append(" "+"and payonline = '"+payonline+"' ");
		}
		if (invoicespt!=null && invoicespt!= ""){
			sb.append(" "+"and invoicespt = '"+invoicespt+"' ");
		}
		if (welfarespt!=null && welfarespt!= ""){
			sb.append(" "+"and welfarespt = '"+welfarespt+"' ");
		}
		if (giftspt!=null && giftspt!= ""){
			sb.append(" "+"and giftspt = '"+giftspt+"' ");
		}
		if (compensate!=null && compensate!= ""){
			sb.append(" "+"and compensate = '"+compensate+"' ");
		}
		if (news!=null && news!= ""){
			sb.append(" "+"and news = '"+news+"' ");
		}
		if (label_1!=null && label_1!= ""){
			sb.append(" "+"and label_1 = '"+label_1+"' ");
		}
		if (label_2!=null && label_2!= ""){
			sb.append(" "+"and label_2 = '"+label_2+"' ");
		}
		if (label_3!=null && label_3!= ""){
			sb.append(" "+"and label_3 = '"+label_3+"' ");
		}
		if (adminname!=null && adminname!= ""){
		 	sb.append(" "+"and adminname = '"+adminname+"' ");
		}
		if (cardid!=null && cardid!= ""){
			sb.append(" "+"and cardid = '"+cardid+"' ");
		}
		if (begintime!=null){
			sb.append(" "+"and begintime = '"+begintime+"' ");
		}
		if (count!=null && count!= 0){
			sb.append(" "+"and count = "+count+" ");
		}
		if (adminbank!=null && adminbank!= ""){
			sb.append(" "+"and adminbank = '"+adminbank+"' ");
		}
		if (citycode!=null && citycode!= ""){
			sb.append(" "+"and citycode = '"+citycode+"' ");
		}
		if (address!=null && address!= ""){
			sb.append(" "+"and address = '"+address+"' ");
		}
		if (adminphone!=null && adminphone!= ""){
			sb.append(" "+"and adminphone = '"+adminphone+"' ");
		}
		if (adminaddr!=null && adminaddr!= ""){
			sb.append(" "+"and adminaddr = '"+adminaddr+"' ");
		}
		if (introduce!=null && introduce!= ""){
			sb.append(" "+"and introduce = '"+introduce+"' ");
		}
		if (worktime!=null){
			sb.append(" "+"and worktime = '"+worktime+"' ");
		}
		if (announce!=null && announce!= ""){
			sb.append(" "+"and announce = '"+announce+"' ");
		}
		if (classify!=null && classify!= ""){
			sb.append(" "+"and classify = '"+classify+"' ");
		}
		if (attitude!=null && attitude!= 0){
			sb.append(" "+"and attitude = "+attitude+" ");
		}
		if (comment!=null && comment!= ""){
			sb.append(" "+"and comment = '"+comment+"' ");
		}
		if (sendpartner!=null && sendpartner!= ""){
			sb.append(" "+"and sendpartner = '"+sendpartner+"' ");
		}
		if (settledate!=null){
			sb.append(" "+"and settledate = '"+settledate+"' ");
		}
		if (status!=null && status!= ""){
			sb.append(" "+"and status = '"+status+"' ");
		}
		String sql = sb.toString();
		return DaoUtilFactory.getShopsDaosUtil().delete(sql);
	}

	@Override
	public int update(ShopsBean shopsBean) {
		Integer sid = shopsBean.getSid();
		String name = shopsBean.getName();
		Integer sales = shopsBean.getSales();
		Integer rank = shopsBean.getRank();
		Float lowest = shopsBean.getLowest();
		Float transcost = shopsBean.getTranscost();
		String logo = shopsBean.getLogo();
		String reserve = shopsBean.getReserve();
		String fullcut = shopsBean.getFullcut();
		String firstcut = shopsBean.getFirstcut();
		String cutspecial = shopsBean.getCutspecial();
		String payonline = shopsBean.getPayonline();
		String invoicespt = shopsBean.getInvoicespt();
		String welfarespt = shopsBean.getWelfarespt();
		String giftspt = shopsBean.getGiftspt();
		String compensate = shopsBean.getCompensate();
		String news = shopsBean.getNews();
		String label_1 = shopsBean.getLabel_1();
		String label_2 = shopsBean.getLabel_2();
		String label_3 = shopsBean.getLabel_3();
		String adminname = shopsBean.getAdminname();
		String cardid = shopsBean.getCardid();
		Timestamp begintime = shopsBean.getBegintime();
		Integer count = shopsBean.getCount();
		String adminbank = shopsBean.getAdminbank();
		String citycode = shopsBean.getCitycode();
		String address = shopsBean.getAddress();
		String adminphone = shopsBean.getAdminphone();
		String adminaddr = shopsBean.getAdminaddr();
		String introduce = shopsBean.getIntroduce();
		Timestamp worktime = shopsBean.getWorktime();
		String announce = shopsBean.getAnnounce();
		String classify = shopsBean.getClassify();
		Integer attitude = shopsBean.getAttitude();
		String comment = shopsBean.getComment();
		String sendpartner = shopsBean.getSendpartner();
		Timestamp settledate = shopsBean.getSettledate();
		String status = shopsBean.getStatus();
		StringBuilder sb_before = new StringBuilder("update shops set ");
		StringBuilder sb_behind = new StringBuilder(" where sid = ");
		if (sid!=null && sid!= 0){
			sb_behind.append(" "+"sid = "+sid+" ");
		}
		if (name!=null && name!=""){
			sb_before.append(","+"name = '"+name+"' ");
		}
		if (sales!=null && sales!= 0){
			sb_before.append(","+"sales = "+sales+" ");
		}
		if (rank!=null && rank!= 0){
			sb_before.append(","+"rank = "+rank+" ");
		}
		if (lowest!=null && lowest!= 0){
			sb_before.append(","+"lowest = "+lowest+" ");
		}
		if (transcost!=null && transcost!= 0){
			sb_before.append(","+"transcost = "+transcost+" ");
		}
		if (logo!=null && logo!=""){
			sb_before.append(","+"logo = '"+logo+"' ");
		}
		if (reserve!=null && reserve!=""){
			sb_before.append(","+"reserve = '"+reserve+"' ");
		}
		if (fullcut!=null && fullcut!=""){
			sb_before.append(","+"fullcut = '"+fullcut+" ");
		}
		if (firstcut!=null && firstcut!=""){
			sb_before.append(","+"firstcut = '"+firstcut+"' ");
		}
		if (cutspecial!=null && cutspecial!=""){
			sb_before.append(","+"cutspecial = '"+cutspecial+"' ");
		}
		if (payonline!=null && payonline!=""){
			sb_before.append(","+"payonline = '"+payonline+"' ");
		}
		if (invoicespt!=null && invoicespt!=""){
			sb_before.append(","+"invoicespt = '"+invoicespt+"' ");
		}
		if (welfarespt!=null && welfarespt!=""){
			sb_before.append(","+"welfarespt = '"+welfarespt+"' ");
		}
		if (giftspt!=null && giftspt!=""){
			sb_before.append(","+"giftspt = '"+giftspt+"' ");
		}
		if (compensate!=null && compensate!=""){
			sb_before.append(","+"compensate = '"+compensate+"' ");
		}
		if (news!=null && news!=""){
			sb_before.append(","+"news = '"+news+"' ");
		}
		if (label_1!=null && label_1!=""){
			sb_before.append(","+"label_1 = '"+label_1+"' ");
		}
		if (label_2!=null && label_2!=""){
			sb_before.append(","+"label_2 = '"+label_2+"' ");
		}
		if (label_3!=null && label_3!=""){
			sb_before.append(","+"label_3 = '"+label_3+"' ");
		}
		if (adminname!=null && adminname!=""){
			sb_before.append(","+"adminname = '"+adminname+"' ");
		}
		if (cardid!=null && cardid!=""){
			sb_before.append(","+"cardid = '"+cardid+"' ");
		}
		if (begintime!=null){
			sb_before.append(","+"begintime = '"+begintime+"' ");
		}
		if (count!=null && count!= 0){
		 	sb_before.append(","+"count = "+count+"' ");
		}
		if (adminbank!=null && adminbank!=""){
			sb_before.append(","+"adminbank = '"+adminbank+"' ");
		}
		if (citycode!=null && citycode!=""){
			sb_before.append(","+"citycode = '"+citycode+"' ");
		}
		if (address!=null && address!=""){
			sb_before.append(","+"address = '"+address+"' ");
		}
		if (adminphone!=null && adminphone!=""){
			sb_before.append(","+"adminphone = '"+adminphone+"' ");
		}
		if (adminaddr!=null && adminaddr!=""){
			sb_before.append(","+"adminaddr = '"+adminaddr+"' ");
		}
		if (introduce!=null && introduce!=""){
			sb_before.append(","+"introduce = '"+introduce+"' ");
		}
		if (worktime!=null){
			sb_before.append(","+"worktime = '"+worktime+"' ");
		}
		if (announce!=null && announce!=""){
			sb_before.append(","+"announce = '"+announce+"' ");
		}
		if (classify!=null && classify!=""){
			sb_before.append(","+"classify = '"+classify+"' ");
		}
		if (attitude!=null && attitude!= 0){
			sb_before.append(","+"attitude = "+attitude+" ");
		}
		if (comment!=null && comment!=""){
			sb_before.append(","+"comment = '"+comment+"' ");
		}
		if (sendpartner!=null && sendpartner!=""){
			sb_before.append(","+"sendpartner = '"+sendpartner+"' ");
		}
		if (settledate!=null){
			sb_before.append(","+"settledate = '"+settledate+"' ");
		}
		if (status!=null && status!=""){
			sb_before.append(","+"status = '"+status+"' ");
		}
		String sql = sb_before.toString()+sb_behind.toString();
		return DaoUtilFactory.getShopsDaosUtil().update(sql);
	}

	@Override
	public ShopsBean select(ShopsBean shopsBean) {
		Integer sid = shopsBean.getSid();
		String name = shopsBean.getName();
		Integer sales = shopsBean.getSales();
		Integer rank = shopsBean.getRank();
		Float lowest = shopsBean.getLowest();
		Float transcost = shopsBean.getTranscost();
		String logo = shopsBean.getLogo();
		String reserve = shopsBean.getReserve();
		String fullcut = shopsBean.getFullcut();
		String firstcut = shopsBean.getFirstcut();
		String cutspecial = shopsBean.getCutspecial();
		String payonline = shopsBean.getPayonline();
		String invoicespt = shopsBean.getInvoicespt();
		String welfarespt = shopsBean.getWelfarespt();
		String giftspt = shopsBean.getGiftspt();
		String compensate = shopsBean.getCompensate();
		String news = shopsBean.getNews();
		String label_1 = shopsBean.getLabel_1();
		String label_2 = shopsBean.getLabel_2();
		String label_3 = shopsBean.getLabel_3();
		String adminname = shopsBean.getAdminname();
		String cardid = shopsBean.getCardid();
		Timestamp begintime = shopsBean.getBegintime();
		Integer count = shopsBean.getCount();
		String adminbank = shopsBean.getAdminbank();
		String citycode = shopsBean.getCitycode();
		String address = shopsBean.getAddress();
		String adminphone = shopsBean.getAdminphone();
		String adminaddr = shopsBean.getAdminaddr();
		String introduce = shopsBean.getIntroduce();
		Timestamp worktime = shopsBean.getWorktime();
		String announce = shopsBean.getAnnounce();
		String classify = shopsBean.getClassify();
		Integer attitude = shopsBean.getAttitude();
		String comment = shopsBean.getComment();
		String sendpartner = shopsBean.getSendpartner();
		Timestamp settledate = shopsBean.getSettledate();
		String status = shopsBean.getStatus();
		StringBuilder sb = new StringBuilder("select * from shops where 1=1 ");
		if (sid!=null && sid!= 0){
			sb.append(" "+"and sid = "+sid+" ");
		}
		if (name!=null && name!= ""){
			sb.append(" "+"and name = '"+name+"' ");
		}
		if (sales!=null && sales!= 0){
			sb.append(" "+"and sales = "+sales+" ");
		}
		if (rank!=null && rank!= 0){
			sb.append(" "+"and rank = "+rank+" ");
		}
		if (lowest!=null && lowest!= 0){
			sb.append(" "+"and lowest = "+lowest+" ");
		}
		if (transcost!=null && transcost!= 0){
			sb.append(" "+"and transcost = "+transcost+" ");
		}
		if (logo!=null && logo!= ""){
			sb.append(" "+"and logo = '"+logo+"' ");
		}
		if (reserve!=null && reserve!= ""){
			sb.append(" "+"and reserve = '"+reserve+"' ");
		}
		if (fullcut!=null && fullcut!= ""){
			sb.append(" "+"and fullcut = '"+fullcut+"' ");
		}
		if (firstcut!=null && firstcut!= ""){
			sb.append(" "+"and firstcut = '"+firstcut+"' ");
		}
		if (cutspecial!=null && cutspecial!= ""){
			sb.append(" "+"and cutspecial = '"+cutspecial+"' ");
		}
		if (payonline!=null && payonline!= ""){
			sb.append(" "+"and payonline = '"+payonline+"' ");
		}
		if (invoicespt!=null && invoicespt!= ""){
			sb.append(" "+"and invoicespt = '"+invoicespt+"' ");
		}
		if (welfarespt!=null && welfarespt!= ""){
			sb.append(" "+"and welfarespt = '"+welfarespt+"' ");
		}
		if (giftspt!=null && giftspt!= ""){
			sb.append(" "+"and giftspt = '"+giftspt+"' ");
		}
		if (compensate!=null && compensate!= ""){
			sb.append(" "+"and compensate = '"+compensate+"' ");
		}
		if (news!=null && news!= ""){
			sb.append(" "+"and news = '"+news+"' ");
		}
		if (label_1!=null && label_1!= ""){
			sb.append(" "+"and label_1 = '"+label_1+"' ");
		}
		if (label_2!=null && label_2!= ""){
			sb.append(" "+"and label_2 = '"+label_2+"' ");
		}
		if (label_3!=null && label_3!= ""){
			sb.append(" "+"and label_3 = '"+label_3+"' ");
		}
		if (adminname!=null && adminname!=""){
			sb.append(" "+"and adminname = '"+adminname+"' ");
		}
		if (cardid!=null && cardid!=""){
			sb.append(" "+"and cardid = '"+cardid+"' ");
		}
		if (begintime!=null){
			sb.append(" "+"and begintime = '"+begintime+"' ");
		}
		if (count!=null && count!= 0){
			sb.append(" "+"and count = "+count+"' ");
		}
		if (adminbank!=null && adminbank!=""){
			sb.append(" "+"and adminbank = '"+adminbank+"' ");
		}
		if (citycode!=null && citycode!=""){
			sb.append(" "+"and citycode = '"+citycode+"' ");
		}
		if (address!=null && address!=""){
			sb.append(" "+"and address = '"+address+"' ");
		}
		if (adminphone!=null && adminphone!=""){
			sb.append(" "+"and adminphone = '"+adminphone+"' ");
		}
		if (adminaddr!=null && adminaddr!=""){
			sb.append(" "+"and adminaddr = '"+adminaddr+"' ");
		}
		if (introduce!=null && introduce!=""){
			sb.append(" "+"and introduce = '"+introduce+"' ");
		}
		if (worktime!=null){
			sb.append(" "+"and worktime = '"+worktime+"' ");
		}
		if (announce!=null && announce!=""){
			sb.append(" "+"and announce = '"+announce+"' ");
		}
		if (classify!=null && classify!=""){
			sb.append(" "+"and classify = '"+classify+"' ");
		}
		if (attitude!=null && attitude!= 0){
			sb.append(" "+"and attitude = "+attitude+" ");
		}
		if (comment!=null && comment!=""){
			sb.append(" "+"and comment = '"+comment+"' ");
		}
		if (sendpartner!=null && sendpartner!=""){
			sb.append(" "+"and sendpartner = '"+sendpartner+"' ");
		}
		if (settledate!=null){
			sb.append(" "+"and settledate = '"+settledate+"' ");
		}
		if (status!=null && status!=""){
			sb.append(" "+"and status = '"+status+"' ");
		}
		String sql = sb.toString();
		List<ShopsBean> shopsBeansList = DaoUtilFactory.getShopsDaosUtil().select(sql);
		if(shopsBeansList != null && shopsBeansList.size()==1){
			return shopsBeansList.get(0);
		}else{
			return new ShopsBean();//不返回null，如果没有查到，则返回一个空的bean，防止客户端调用方法报空指针。
		}
	}

	@Override
	public List<ShopsBean> selectAll(ShopsBean shopsBean) {
		Integer sid = shopsBean.getSid();
		String name = shopsBean.getName();
		Integer sales = shopsBean.getSales();
		Integer rank = shopsBean.getRank();
		Float lowest = shopsBean.getLowest();
		Float transcost = shopsBean.getTranscost();
		String logo = shopsBean.getLogo();
		String reserve = shopsBean.getReserve();
		String fullcut = shopsBean.getFullcut();
		String firstcut = shopsBean.getFirstcut();
		String cutspecial = shopsBean.getCutspecial();
		String payonline = shopsBean.getPayonline();
		String invoicespt = shopsBean.getInvoicespt();
		String welfarespt = shopsBean.getWelfarespt();
		String giftspt = shopsBean.getGiftspt();
		String compensate = shopsBean.getCompensate();
		String news = shopsBean.getNews();
		String label_1 = shopsBean.getLabel_1();
		String label_2 = shopsBean.getLabel_2();
		String label_3 = shopsBean.getLabel_3();
		String adminname = shopsBean.getAdminname();
		String cardid = shopsBean.getCardid();
		Timestamp begintime = shopsBean.getBegintime();
		Integer count = shopsBean.getCount();
		String adminbank = shopsBean.getAdminbank();
		String citycode = shopsBean.getCitycode();
		String address = shopsBean.getAddress();
		String adminphone = shopsBean.getAdminphone();
		String adminaddr = shopsBean.getAdminaddr();
		String introduce = shopsBean.getIntroduce();
		Timestamp worktime = shopsBean.getWorktime();
		String announce = shopsBean.getAnnounce();
		String classify = shopsBean.getClassify();
		Integer attitude = shopsBean.getAttitude();
		String comment = shopsBean.getComment();
		String sendpartner = shopsBean.getSendpartner();
		Timestamp settledate = shopsBean.getSettledate();
		String status = shopsBean.getStatus();
		StringBuilder sb = new StringBuilder("select * from shops where 1=1 ");
		if (sid!=null && sid!= 0){
			sb.append(" "+"and sid = "+sid+" ");
		}
		if (name!=null && name!= ""){
			sb.append(" "+"and name = '"+name+"' ");
		}
		if (sales!=null && sales!= 0){
			sb.append(" "+"and sales = "+sales+" ");
		}
		if (rank!=null && rank!= 0){
			sb.append(" "+"and rank = "+rank+" ");
		}
		if (lowest!=null && lowest!= 0){
			sb.append(" "+"and lowest = "+lowest+" ");
		}
		if (transcost!=null && transcost!= 0){
			sb.append(" "+"and transcost = "+transcost+" ");
		}
		if (logo!=null && logo!= ""){
			sb.append(" "+"and logo = '"+logo+"' ");
		}
		if (reserve!=null && reserve!= ""){
			sb.append(" "+"and reserve = '"+reserve+"' ");
		}
		if (fullcut!=null && fullcut!= ""){
			sb.append(" "+"and fullcut = '"+fullcut+"' ");
		}
		if (firstcut!=null && firstcut!= ""){
			sb.append(" "+"and firstcut = '"+firstcut+"' ");
		}
		if (cutspecial!=null && cutspecial!= ""){
			sb.append(" "+"and cutspecial = '"+cutspecial+"' ");
		}
		if (payonline!=null && payonline!= ""){
			sb.append(" "+"and payonline = '"+payonline+"' ");
		}
		if (invoicespt!=null && invoicespt!= ""){
			sb.append(" "+"and invoicespt = '"+invoicespt+"' ");
		}
		if (welfarespt!=null && welfarespt!= ""){
			sb.append(" "+"and welfarespt = '"+welfarespt+"' ");
		}
		if (giftspt!=null && giftspt!= ""){
			sb.append(" "+"and giftspt = '"+giftspt+"' ");
		}
		if (compensate!=null && compensate!= ""){
			sb.append(" "+"and compensate = '"+compensate+"' ");
		}
		if (news!=null && news!= ""){
			sb.append(" "+"and news = '"+news+"' ");
		}
		if (label_1!=null && label_1!= ""){
			sb.append(" "+"and label_1 = '"+label_1+" '");
		}
		if (label_2!=null && label_2!= ""){
			sb.append(" "+"and label_2 = '"+label_2+"' ");
		}
		if (label_3!=null && label_3!= ""){
			sb.append(" "+"and label_3 = '"+label_3+"' ");
		}
		if (adminname!=null && adminname!=""){
			sb.append(" "+"and adminname = '"+adminname+"' ");
		}
		if (cardid!=null && cardid!=""){
			sb.append(" "+"and cardid = '"+cardid+"' ");
		}
		if (begintime!=null){
			sb.append(" "+"and begintime = '"+begintime+"' ");
		}
		if (count!=null && count!= 0){
			sb.append(" "+"and count = "+count+" ");
		}
		if (adminbank!=null && adminbank!=""){
			sb.append(" "+"and adminbank = '"+adminbank+"' ");
		}
		if (citycode!=null && citycode!=""){
			sb.append(" "+"and citycode = '"+citycode+"' ");
		}
		if (address!=null && address!=""){
			sb.append(" "+"and address = '"+address+"' ");
		}
		if (adminphone!=null && adminphone!=""){
			sb.append(" "+"and adminphone = '"+adminphone+"' ");
		}
		if (adminaddr!=null && adminaddr!=""){
			sb.append(" "+"and adminaddr = '"+adminaddr+"' ");
		}
		if (introduce!=null && introduce!=""){
			sb.append(" "+"and introduce = '"+introduce+"' ");
		}
		if (worktime!=null){
			sb.append(" "+"and worktime = '"+worktime+"' ");
		}
		if (announce!=null && announce!=""){
			sb.append(" "+"and announce = '"+announce+"' ");
		}
		if (classify!=null && classify!=""){
			sb.append(" "+"and classify = '"+classify+" ");
		}
		if (attitude!=null && attitude!= 0){
			sb.append(" "+"and attitude = "+attitude+" ");
		}
		if (comment!=null && comment!=""){
			sb.append(" "+"and comment = '"+comment+"' ");
		}
		if (sendpartner!=null && sendpartner!=""){
			sb.append(" "+"and sendpartner = '"+sendpartner+"' ");
		}
		if (settledate!=null){ 
			sb.append(" "+"and settledate = '"+settledate+"' ");
		}
		if (status!=null && status!=""){
			sb.append(" "+"and status = '"+status+"' ");
		}
		String sql = sb.toString();
		List<ShopsBean> shopsBeansList = DaoUtilFactory.getShopsDaosUtil().select(sql);
		return shopsBeansList;
	}
}
