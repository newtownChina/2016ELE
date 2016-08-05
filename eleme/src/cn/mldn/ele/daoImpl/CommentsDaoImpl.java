package cn.mldn.ele.daoImpl;
import java.sql.Timestamp;
import java.util.List;
import cn.mldn.ele.beans.CommentsBean;
import cn.mldn.ele.dao.CommentsDao;
import cn.mldn.ele.util.DaoUtilFactory;
/**
 * @author NXY
 * @version 1.0
 * CommentsDao接口的实现类，对Comments增删改查，sql语句根据传入的javabean中的属性进行动态拼接
 */
public class CommentsDaoImpl implements CommentsDao {
	/**
	 * @param commentsBean 传入一个commentsBean实体
	 * 持久化到数据库
	 */
	@Override
	public int insert(CommentsBean commentsBean) {
//		Integer cid = commentsBean.getCid();
		Integer gid = commentsBean.getGid();
		String name = commentsBean.getName();
		Timestamp comtime = commentsBean.getComtime();
		Integer rank = commentsBean.getRank();
		String comment = commentsBean.getComment();
		StringBuilder sb_before = new StringBuilder("insert into comments(");
		StringBuilder sb_behind = new StringBuilder(")values(");
//		if (cid!=null && cid != 0){//插入数据不需要传cid，自动增长
//			sb_before.append("cid");	
//			sb_behind.append(cid);
//		}
		if (gid!=null && gid != 0){
			sb_before.append("gid");
			sb_behind.append(gid);
		}
		if (name!=null && name != ""){			
			sb_before.append(",name");
			sb_behind.append(",'"+name+"'");
		}
		if (comtime !=null){
			sb_before.append(",comtime");
			sb_behind.append(",'"+comtime+"'");
		}
		if (rank!=null && rank != 0){
			sb_before.append(",rank");
			sb_behind.append(","+rank);
		}
		if (comment!=null && comment != ""){
			sb_before.append(",comment");
			sb_behind.append(",'"+comment+"'");
		}
		sb_behind.append(")");
		String sql = sb_before.toString()+sb_behind.toString();
		return DaoUtilFactory.getCommentsDaoUtil().insert(sql);
	}
	/**
	 * @param commentsBean 传入一个commentsBean实体
	 * 从数据库中删除指定的记录
	 */
	@Override
	public int delete(CommentsBean commentsBean) {
		Integer cid = commentsBean.getCid();
		Integer gid = commentsBean.getGid();
		String name = commentsBean.getName();
		Timestamp comtime = commentsBean.getComtime();
		Integer rank = commentsBean.getRank();
		String comment = commentsBean.getComment();
		StringBuilder sb = new StringBuilder("delete from comments where 1=1");
		if (cid!=null && cid != 0){
			sb.append(" "+"and cid = "+cid+" ");	
		}
		if (gid!=null && gid != 0){
			sb.append(" "+"and gid = "+gid+" ");
		}
		if (name!=null && name != ""){			
			sb.append(" "+"and name = '"+name+"' ");
		}
		if (comtime !=null){
			sb.append(" "+"and comtime = '"+comtime+"' ");
		}
		if (rank!=null && rank != 0){
			sb.append(" "+"and rank = "+rank+" ");
		}
		if (comment!=null && comment != ""){
			sb.append(" "+"and comment = '"+comment+"' ");
		}
		String sql = sb.toString();
		return DaoUtilFactory.getCommentsDaoUtil().delete(sql);
	}
	
	/**
	 * @param commentsBean 传入一个commentsBean实体
	 * 更新指定的记录
	 */
	@Override
	public int update(CommentsBean commentsBean) {
		Integer cid = commentsBean.getCid();
		Integer gid = commentsBean.getGid();
		String name = commentsBean.getName();
		Timestamp comtime = commentsBean.getComtime();
		Integer rank = commentsBean.getRank();
		String comment = commentsBean.getComment();
		StringBuilder sb_before = new StringBuilder("update comments set ");
		StringBuilder sb_behind = new StringBuilder(" where cid = ");
		if (cid!=null && cid != 0){
			sb_behind.append(cid);//先确定更新的记录的id
		}
		if (gid!=null && gid != 0){
			sb_before.append(" "+"gid = "+gid+" ");
		} 
		if (name!=null && name != ""){			
			sb_before.append(","+"name = '"+name+"' ");
		}
		if (comtime !=null){
			sb_before.append(","+"comtime = '"+comtime+"' ");
		}
		if (rank != null && rank != 0){
			sb_before.append(","+"rank = "+rank+" ");
		}
		if (comment!=null && comment != ""){
			sb_before.append(","+"comment = '"+comment+"' ");
		}
		String sql = sb_before.toString()+sb_behind.toString();
		return DaoUtilFactory.getCommentsDaoUtil().update(sql);
	}
	
	/**
	 * @param commentsBean 传入一个commentsBean实体
	 * 从数据库中查询出满足条件的单个记录，封装成javabean实体并返回
	 */
	@Override
	public CommentsBean select(CommentsBean commentsBean) {
		Integer cid = commentsBean.getCid();
		Integer gid = commentsBean.getGid();
		String name = commentsBean.getName();
		Timestamp comtime = commentsBean.getComtime();
		Integer rank = commentsBean.getRank();
		String comment = commentsBean.getComment();
		StringBuilder sb = new StringBuilder("select * from comments where 1=1 ");
		if (cid!=null && cid != 0){
			sb.append(" "+"and cid = "+cid+" ");	
		}
		if (gid!=null && gid != 0){
			sb.append(" "+"and gid = "+gid+" ");
		}
		if (name!=null && name != ""){			
			sb.append(" "+"and name = '"+name+"' ");
		}
		if (comtime !=null){
			sb.append(" "+"and comtime = '"+comtime+"' ");
		}
		if (rank!=null && rank != 0){
			sb.append(" "+"and rank = "+rank+" ");
		}
		if (comment!=null && comment != ""){
			sb.append(" "+"and comment = '"+comment+"' ");
		}
		String sql = sb.toString();
		List<CommentsBean> commentsBeansList = DaoUtilFactory.getCommentsDaoUtil().select(sql);
		if(commentsBeansList != null && commentsBeansList.size()==1){
			return commentsBeansList.get(0);
		}else{
			return new CommentsBean();//不返回null，如果没有查到，则返回一个空的bean，防止客户端调用方法报空指针。
		}
	}
	
	/**
	 * @param commentsBean 传入一个commentsBean实体
	 * 从数据库中查询出所有满足条件的记录，并封装成List并返回
	 */
	@Override
	public List<CommentsBean> selectAll(CommentsBean commentsBean) {
		Integer cid = commentsBean.getCid();
		Integer gid = commentsBean.getGid();
		String name = commentsBean.getName();
		Timestamp comtime = commentsBean.getComtime();
		Integer rank = commentsBean.getRank();
		String comment = commentsBean.getComment();
		StringBuilder sb = new StringBuilder("select * from comments where 1=1 ");
		if (cid!=null && cid != 0){
			sb.append(" "+"and cid = "+cid+" ");	
		}
		if (gid!=null && gid != 0){
			sb.append(" "+"and gid = "+gid+" ");
		}
		if (name!=null && name != ""){			
			sb.append(" "+"and name = '"+name+"' ");
		}
		if (comtime !=null){
			sb.append(" "+"and comtime = '"+comtime+"' ");
		}
		if (rank!=null && rank != 0){
			sb.append(" "+"and rank = "+rank+" ");
		}
		if (comment!=null && comment != ""){
			sb.append(" "+"and comment = '"+comment+"' ");
		}
		String sql = sb.toString();
		List<CommentsBean> commentsBeansList = DaoUtilFactory.getCommentsDaoUtil().select(sql);
		return commentsBeansList;
	}
}
